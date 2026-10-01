package com.blocklegend001.onlyhammers.mixin;

import com.blocklegend001.onlyhammers.OnlyHammersClient;
import com.blocklegend001.onlyhammers.utils.RadiusMap;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderTypes;
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
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class HammerOverlayRenderer {
    @Inject(method = "submitFeatures", at = @At("TAIL"))
    private void onSubmitFeatures(
            LevelRenderState levelRenderState,
            SubmitNodeCollector submitNodeCollector,
            boolean renderOutline,
            CallbackInfo ci
    ) {

        Minecraft client = Minecraft.getInstance();

        if (!OnlyHammersClient.SHOW_OUTLINE_ENABLED) return;

        if (client.level == null || client.player == null) return;

        ItemStack heldItem = client.player.getMainHandItem();
        if (heldItem.isEmpty()) return;

        if (!(client.hitResult instanceof BlockHitResult blockHit)) return;
        if (blockHit.getType() != HitResult.Type.BLOCK) return;

        boolean isHammer = RadiusMap.HAMMER_RADIUS_MAP.containsKey(heldItem.getItem());

        if (!isHammer) return;

        int range;
        if (client.player.isShiftKeyDown()) {
            range = 0;
        } else {
            range = RadiusMap.HAMMER_RADIUS_MAP.getOrDefault(heldItem.getItem(), 0);
        }

        BlockPos origin = blockHit.getBlockPos();
        if (!client.level.getBlockState(origin).is(BlockTags.MINEABLE_WITH_PICKAXE)) return;

        AABB box = computeSelectionBox(origin, blockHit.getDirection(), range);
        VoxelShape shape = Shapes.create(box);

        Vec3 cameraPos = levelRenderState.cameraRenderState.pos;
        PoseStack poseStack = new PoseStack();
        poseStack.pushPose();
        poseStack.translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);

        int color = ARGB.color(255, 255, 255, 255);
        submitNodeCollector.submitShapeOutline(poseStack, shape, RenderTypes.lines(), color, 2.0F, false);

        poseStack.popPose();
    }

    private AABB computeSelectionBox(BlockPos origin, Direction side, int range) {
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