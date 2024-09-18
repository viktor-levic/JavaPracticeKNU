package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
LabsJava3 Task 2.6
 */
public class Task2_6 {
    public static void main(String[] args) {
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        System.out.print("Matrix A \n");
        displayMatrix(matrix);
        findNorm(matrix);
    }

    public static void displayMatrix(Float[][] matrix) {
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }

    public static void findNorm(Float[][] m) {
        float Knorm = 0.0f;
        float max_sumM = 0.0f, max_sumL = 0.0f;
        for (int i = 0; i < m.length; i++) {
            int sumM = 0, sumL = 0;
            for (int j = 0; j < m.length; j++) {
                sumM += Math.abs(m[i][j]);
                sumL += Math.abs(m[j][i]);
                Knorm += Math.pow(m[i][j], 2);
            }
            if (sumM > max_sumM)
                max_sumM = sumM;

            if (sumL > max_sumL)
                max_sumL = sumL;
        }
        System.out.printf("M норма: %.3f \n", max_sumM);
        System.out.printf("L норма: %.3f \n", max_sumL);
        System.out.printf("K норма: %.3f \n", Math.sqrt(Knorm));

    }
}