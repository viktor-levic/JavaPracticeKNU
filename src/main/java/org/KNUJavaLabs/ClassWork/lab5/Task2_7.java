package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
LabsJava3 Task 2.7
 */
public class Task2_7 {
    public static void main(String[] args) {
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        System.out.print("Matrix A \n");
        displayMatrix(matrix);

        for (int i = 1; i < 4; i++) {
            System.out.printf("Matrix A rotated %d degrees \n", (4 - i) * 90);
            displayMatrix(rotateMatrix(matrix, i));
        }
    }

    public static void displayMatrix(Float[][] matrix) {
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }

    public static Float[][] rotateMatrix(Float[][] m, int k) {
        Float[][] mR = new Float[m.length][m.length];
        if (k == 0)
            return m;
        else {
            int n = m.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    mR[j][n - i - 1] = m[i][j];
            }
        }
        return rotateMatrix(mR, k - 1);
    }
}