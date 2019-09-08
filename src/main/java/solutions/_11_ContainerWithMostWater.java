package solutions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class _11_ContainerWithMostWater {

    public int maxArea(int[] height) {

        if (height == null || height.length == 0)
            return 0;

        // Queue<Integer> areas = new PriorityQueue<Integer>(20, Collections.reverseOrder());

        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {

                int length = Math.min(height[i], height[j]);
                int width = j - i;

                int currentArea = length * width;
                area = area < currentArea ? currentArea : area;
            }
        }

        return area;
    }
}
