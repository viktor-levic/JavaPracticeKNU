package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;

/*
LabsJava3 Task 2.5
 */
public class Task2_5 {
    public static void main(String[] args) {
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        System.out.print("Matrix A \n");
        displayMatrix(matrix);
        System.out.print("Matrix A after transpose \n");
        displayMatrix(transposeMatrix(matrix));
    }

    public static void displayMatrix(Float[][] matrix) {
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }

    public static Float[][] transposeMatrix(Float[][] m) {
        int n = m.length;
        Float[][] mT = new Float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mT[j][i] = m[i][j];
        }
        return mT;
    }
}
