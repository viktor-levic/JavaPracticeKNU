package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
LabsJava3 Task 2.4
 */
public class Task2_4 {
    public static void main(String[] args) {

        int n = 3;
        Float[][] matrix = {{15.0f, -25.0f, 75.0f}, {87.0f, -92.0f, 83.0f}, {19.0f, -27.0f, 99.0f}};
        System.out.print("Matrix A \n");
        displayMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("The sum is %f \n", findSum(matrix, i));
        }
    }

    public static void displayMatrix(Float[][] matrix) {
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }

    public static Float findSum(Float[][] m, int k) {
        Float sum = 0.0f;
        for (int i = 0; i < m.length; i++) {
            if (m[k][i] >= 0) {
                for (int j = i + 1; j < m.length; j++) {
                    if (m[k][j] >= 0)
                        return sum;
                    sum += m[k][j];
                }
            }
        }
        return 0.0f;
    }
}