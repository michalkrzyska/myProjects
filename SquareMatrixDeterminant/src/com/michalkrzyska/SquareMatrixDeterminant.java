package com.michalkrzyska;

public class SquareMatrixDeterminant {

    public static int determinant(int[][] matrix) {
        int determinant = 0;
        if (matrix.length == 1) {
            determinant = matrix[0][0];
        } else if (matrix.length == 2) {
            determinant = matrix2x2(matrix);
        } else {
            for (int i = 0; i < matrix.length; i++) {
                int anchor = matrix[0][i];
                int[][] tempMatrix = removeRowAndColumn(matrix, i);
                if (i % 2 == 0) {
                    determinant += anchor * determinant(tempMatrix);
                }
                if (i % 2 != 0) {
                    determinant -= anchor * determinant(tempMatrix);
                }
            }
        }
        return determinant;
    }

    private static int matrix2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    private static int[][] removeRowAndColumn(int[][] matrix, int index) {
        int[][] tempMatrix = new int[matrix.length - 1][matrix.length - 1];
        int p = 0;
        int q = 0;

        for (int i = 1; i < matrix.length; i++) {
            q = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (j == index) {
                    continue;
                }
                tempMatrix[p][q] = matrix[i][j];
                q++;
            }
            p++;
        }
        return tempMatrix;

    }
}

