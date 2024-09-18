package org.KNUJavaLabs.HW.hw5;

import java.util.Arrays;

/*
LabsJava3 Task 2.9
 */
public class Task2_9 {
    public static void main(String[] args) {
        int n = 3;
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        Float summ = 0.0f;
        int lenght = 0;
        for (Float[] row : matrix) {
            for (Float aFloat : row) {
                summ += aFloat;
                lenght += 1;
            }
        }
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
        System.out.println("-------------------------");
        float central = summ / lenght;
        System.out.println("Central arithmetical: " + central);
        System.out.println("-------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] - central;
            }
        }
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }

    }
}
