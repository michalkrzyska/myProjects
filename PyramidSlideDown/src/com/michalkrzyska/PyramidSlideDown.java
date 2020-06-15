package com.michalkrzyska;

public class PyramidSlideDown {

    public static int longestSlideDown(int[][] pyramid) {

        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return pyramid[0][0];
    }
}
