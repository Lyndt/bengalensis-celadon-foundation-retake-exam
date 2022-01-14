package com.multiplymatrix;

import java.util.Arrays;

public class MultiplyItemsInMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}
        };
        int[][] matrix2 = {
                {1, 3, 12, 4},
                {14, 10, 6, 2},
                {3, 3, 1, 5},
                {18, 0, 10, 6}
        };
        System.out.println(Arrays.deepToString(multiplyInMatrix(matrix1)));
        System.out.println(Arrays.deepToString(multiplyInMatrix(matrix2)));
//        System.out.println(multiplyInMatrix(matrix1));
//        System.out.println(multiplyInMatrix(matrix2));
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int[][] multiplyInMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isEven(i) && isEven(matrix[i][j])) {
                    matrix[i][j] = 2 * matrix[i][j];
                }

                if (!isEven(i) && !isEven(matrix[i][j])) {
                    matrix[i][j] = 2 * matrix[i][j];
                }
            }
        }
        return matrix;
    }

}