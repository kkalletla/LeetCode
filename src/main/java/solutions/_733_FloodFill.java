package solutions;

import Utilities.Print;

public class _733_FloodFill {

    int[][] visitMatrix;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image.length == 0 && image[0].length <= 0)
            return image;

        visitMatrix = new int[image.length][image[0].length];

        floodFill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public void floodFill(int[][] image, int sr, int sc, int newColor, int oldColor) {

        if (!(sr > -1 && sr < image.length && sc > -1 && sc < image[0].length))
            return;

        if (visitMatrix[sr][sc] == 1)
            return;

        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            visitMatrix[sr][sc] = 1;
            floodFill(image, sr - 1, sc, newColor, oldColor);
            floodFill(image, sr + 1, sc, newColor, oldColor);
            floodFill(image, sr, sc - 1, newColor, oldColor);
            floodFill(image, sr, sc + 1, newColor, oldColor);
        }
    }
}
