package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
LabsJava3 Task 2.3
 */
public class Task2_3 {
    public static void main(String[] args) {
        System.out.print("Matrix A \n");
        int n = 3;
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        displayMatrix(matrix);

        System.out.printf("The length of the largest increasing sequence is %f", findSequence(matrix));
    }

    public static void displayMatrix(Float[][] matrix) {
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }

    public static float findSequence(Float[][] m) {
        float a = m[0][0], b, k = (float) 0, max_k = (float) 0;
        float n = (float) m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b = m[i][j];
                if (a < b) {
                    k += 1;
                } else {
                    if (k > max_k)
                        max_k = k;
                    k = 1;
                }
                a = b;
            }
        }
        return max_k;
    }
}