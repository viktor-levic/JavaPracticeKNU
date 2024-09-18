package org.KNUJavaLabs.ClassWork.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
LabsJava3 Task 2.1
 */
public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = scanner.nextInt();
        Float[][] matrix = new Float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter number in (" + (i + 1) + " " + (j + 1) + ") position");
                float new_num = scanner.nextFloat();
                matrix[i][j] = new_num;

            }
        }
//        int n = 3;
//        Float[][] matrix = {{15.0f,25.0f,75.0f},{87.0f,92.0f,83.0f},{19.0f,27.0f,99.0f}};
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Manual changing element in MATRIX :\n\n\n");
        Float[][] new_matrix_manual = change_num_manual(matrix, n);
        System.out.println("Auto changing element in MATRIX :\n\n\n");
        Float[][] new_matrix_auto = change_num_auto(new_matrix_manual, n);
        Float[][] new_matrix_arrangementByRow = arrangementByColumn(new_matrix_auto, n);
        Float[][] new_matrix_arrangementByColumn = arrangementByRow(new_matrix_arrangementByRow, n);

    }

    public static Float[][] change_num_manual(Float[][] matrix, Integer n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row where number u want tot change :");
        int row_in_matrix = scanner.nextInt();
        System.out.println("Enter the number of column where number u want tot change :");
        int column_in_matrix = scanner.nextInt();
        System.out.println("Enter the number u wanna insert to position (" + row_in_matrix + " " + column_in_matrix + ")");
        float number = scanner.nextFloat();
        matrix[row_in_matrix][column_in_matrix] = number;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }

    public static Float[][] change_num_auto(Float[][] matrix, Integer n) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number of row choosing automaticaly :");
        int row_in_matrix = ThreadLocalRandom.current().nextInt(-n + 1, n - 1);
        System.out.println(row_in_matrix);

        System.out.println("The number of column where number u want tot change :");
        int column_in_matrix = ThreadLocalRandom.current().nextInt(-n, n);
        System.out.println(column_in_matrix);

        System.out.println("Enter the number u wanna insert to position (" + row_in_matrix + " " + column_in_matrix + ")");
        float number = scanner.nextFloat();
        matrix[row_in_matrix][column_in_matrix] = number;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }

    public static Float[][] arrangementByColumn(Float[][] matrix, Integer n) {
        System.out.println("Enter the column which u want to sort");
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        Float[][] new_matrix = new Float[n][n];
        int row = 0;
        int counter = 0;
        int length = n;
        float min_elem = 2147483647;
        int min_elem_num = 0;
        do {
            if (matrix[row][column] < min_elem) {
                min_elem = matrix[row][column];
                min_elem_num = row;
            }
            row += 1;
            if (row == length) {
                new_matrix[counter] = matrix[min_elem_num];
                matrix = removerow(matrix, min_elem_num);

                counter += 1;
                length -= 1;
                min_elem_num = 0;
                min_elem = 2147483647;
                row = 0;
                for (int i = 0; i < length; i++) {
                    System.out.println(Arrays.toString(matrix[i]));
                }
            }
        } while (length != 0);
        System.out.println("\n\n--------------------------------\n\n");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(new_matrix[i]));
        }
        return matrix;
    }

    public static Float[][] arrangementByRow(Float[][] matrix, Integer n) {
        System.out.println("Enter the row which u want to sort");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int counter = 0;
        int column = 0;
        float min_elem = 2147483647;
        int min_elem_num = 0;
        do {
            if (matrix[row][column] < min_elem) {
                min_elem = matrix[row][column];
                min_elem_num = column;
                column += 1;
            } else {
                column += 1;
            }

            if (column == n) {
                exchangeAnyTwoColumns(matrix, min_elem_num, counter);
                counter += 1;
                column = counter;
                min_elem = 2147483647;
                min_elem_num = 0;

            }
        } while (counter != n);

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }

    public static Float[][] removerow(Float mat[][], int ren) {
        int rengre = ren;//row to remove
        Float mat2[][] = new Float[mat.length - 1][mat[0].length];
        int p = 0;
        for (int i = 0; i < mat.length; ++i) {
            if (i == rengre)
                continue;
            int q = 0;
            for (int j = 0; j < mat[0].length; ++j) {
                mat2[p][q] = mat[i][j];
                ++q;
            }
            ++p;
        }
        for (int i = 0; i < mat2.length; i++) {
            System.out.println(Arrays.toString(mat2[i]));
        }
        return mat2;
    }

    public static Float[][] exchangeAnyTwoColumns(Float[][] matrix, int K, int L) {
        for (int i = 0; i < matrix.length; i++) {
            Float temp = matrix[i][K];
            matrix[i][K] = matrix[i][L];
            matrix[i][L] = temp;
        }
        return matrix;
    }
}
