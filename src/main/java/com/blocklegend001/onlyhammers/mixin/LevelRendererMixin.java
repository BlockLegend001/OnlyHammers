package com.blocklegend001.onlyhammers.mixin;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.Hammer;
import com.blocklegend001.onlyhammers.utils.HammerOverlayRenderer;
import com.blocklegend001.onlyhammers.utils.RadiusMap;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.ChunkSectionsToRender;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ARGB;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {

    @Inject(method = "submitFeatures", at = @At("TAIL"))
    private void onSubmitFeatures(LevelRenderState levelRenderState, SubmitNodeCollector submitNodeCollector, boolean renderOutline, CallbackInfo ci) {

        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) return;

        if (!OnlyHammers.SHOW_OUTLINE_ENABLED) return;

        ItemStack heldItem = Minecraft.getInstance().player.getMainHandItem();
        if (!(heldItem.getItem() instanceof Hammer)) {
            return;
        }

        if (!(Minecraft.getInstance().hitResult instanceof BlockHitResult blockHit) || blockHit.getType() != HitResult.Type.BLOCK) {
            return;
        }

        BlockPos origin = blockHit.getBlockPos();
        Direction side = blockHit.getDirection();
        int range;
        if (Minecraft.getInstance().player.isShiftKeyDown()) {
            range = 0;
        } else {
            range = RadiusMap.getHammerRadius().get(heldItem.getItem());
        }

        if (!Minecraft.getInstance().level.getBlockState(origin).is(BlockTags.MINEABLE_WITH_PICKAXE)) {
            return;
        }

        AABB box = getSelectionBox(range, side, origin);
        VoxelShape shape = Shapes.create(box);

        Vec3 cameraPos = levelRenderState.cameraRenderState.pos;
        PoseStack poseStack = new PoseStack();
        poseStack.pushPose();
        poseStack.translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);

        int color = ARGB.color(255, 255, 255, 255);
        submitNodeCollector.submitShapeOutline(poseStack, shape, RenderTypes.lines(), color, 2.0F, false);

        poseStack.popPose();
    }

    private static AABB getSelectionBox(int range, Direction side, BlockPos origin) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;

        for (int x = -range; x <= range; x++) {
            for (int y = -range; y <= range; y++) {
                BlockPos pos = switch (side.getAxis()) {
                    case Y -> origin.offset(x, 0, y);
                    case X -> origin.offset(0, y, x);
                    case Z -> origin.offset(x, y, 0);
                };

                minX = Math.min(minX, pos.getX());
                minY = Math.min(minY, pos.getY());
                minZ = Math.min(minZ, pos.getZ());
                maxX = Math.max(maxX, pos.getX() + 1);
                maxY = Math.max(maxY, pos.getY() + 1);
                maxZ = Math.max(maxZ, pos.getZ() + 1);
            }
        }

        return new AABB(minX, minY, minZ, maxX, maxY, maxZ).inflate(0.002);
    }
}