package com.blocklegend001.onlyhammers.utils;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public class HammerOverlayRender {
    public static void drawBox(VertexConsumer buffer, Vec3 camPos, AABB box, float r, float g, float b, float a) {
        float[][] corners = getFloats(camPos, box);

        int[][] edges = {
                {0,1},{1,3},{3,2},{2,0},
                {4,5},{5,7},{7,6},{6,4},
                {0,4},{1,5},{2,6},{3,7}
        };

        for (int[] edge : edges) {
            float[] p1 = corners[edge[0]];
            float[] p2 = corners[edge[1]];
            buffer.addVertex(p1[0], p1[1], p1[2]).setColor(r, g, b, a).setNormal(1, 0, 0);
            buffer.addVertex(p2[0], p2[1], p2[2]).setColor(r, g, b, a).setNormal(1, 0, 0);
        }
    }

    private static float[] @NotNull [] getFloats(Vec3 camPos, AABB box) {
        float minX = (float) (box.minX - camPos.x);
        float minY = (float) (box.minY - camPos.y);
        float minZ = (float) (box.minZ - camPos.z);
        float maxX = (float) (box.maxX - camPos.x);
        float maxY = (float) (box.maxY - camPos.y);
        float maxZ = (float) (box.maxZ - camPos.z);

        float[][] corners = {
                {minX, minY, minZ}, {maxX, minY, minZ}, {minX, maxY, minZ}, {maxX, maxY, minZ},
                {minX, minY, maxZ}, {maxX, minY, maxZ}, {minX, maxY, maxZ}, {maxX, maxY, maxZ}
        };
        return corners;
    }
}