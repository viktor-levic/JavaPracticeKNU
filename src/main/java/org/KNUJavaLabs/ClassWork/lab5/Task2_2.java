package org.KNUJavaLabs.ClassWork.lab5;
/*
LabsJava3 Task 2.2
 */

import java.util.Arrays;

public class Task2_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter N :");
//        int n = scanner.nextInt();
//        Float[][] matrix = new Float[n][n];
//        for (int i = 0 ; i <n ; i ++){
//            for( int j = 0 ; j < n ; j ++){
//                System.out.println("Enter number in ("+(i+1)+" "+ (j+1)+") position");
//                float new_num = scanner.nextFloat();
//                matrix[i][j] = new_num;
//
//            }
//        }
        int n = 3;
        Float[][] matrix = {{15.0f, 25.0f, 75.0f}, {87.0f, 92.0f, 83.0f}, {19.0f, 27.0f, 99.0f}};
        System.out.println("MAIN MATRIX");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int shiftrght = 186;
        int shiftlft = 14;
        int shiftdwn = 2;
        int shiftup = 1;
        System.out.println("---------------------------");
        System.out.println("SHIFT RIGHT for " + shiftrght + " elem");
        System.out.println("---------------------------");
        Float[][] shiftRight = shiftRight(matrix, n, shiftrght);
        System.out.println("---------------------------");
        System.out.println("SHIFT LEFT for " + shiftlft + " elem");
        System.out.println("---------------------------");
        Float[][] shiftLeft = shiftLeft(shiftRight, n, shiftlft);
        System.out.println("---------------------------");
        System.out.println("SHIFT DOWN for " + shiftdwn + " elem");
        System.out.println("---------------------------");
        Float[][] shiftDown = shiftDown(shiftLeft, shiftdwn);
        System.out.println("---------------------------");
        System.out.println("SHIFT UP for " + shiftup + " elem");
        System.out.println("---------------------------");
        Float[][] shiftUp = shiftUP(shiftDown, shiftup);

    }

    public static Float[][] shiftRight(Float[][] matrix, Integer n, Integer shift) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = shiftingRight(matrix[i], shift);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;

    }

    public static Float[] shiftingRight(Float[] _mas, int _temp) {
        for (int i = 0; i < _temp; ++i) {
            Float val = _mas[0];
            _mas[0] = _mas[_mas.length - 1];
            for (int j = 0; j < _mas.length - 1; ++j) {
                Float _val = _mas[j + 1];
                _mas[j + 1] = val;
                val = _val;
            }
        }

        return _mas;
    }

    public static Float[][] shiftLeft(Float[][] matrix, Integer n, Integer shift) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = shiftingLeft(matrix[i], shift);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;

    }

    public static Float[] shiftingLeft(Float[] _mas, int _temp) {
        for (int i = 0; i < _mas.length / 2; i++) {
            Float tmp = _mas[i];
            _mas[i] = _mas[_mas.length - i - 1];
            _mas[_mas.length - i - 1] = tmp;
        }
        shiftingRight(_mas, _temp);
        for (int i = 0; i < _mas.length / 2; i++) {
            Float tmp = _mas[i];
            _mas[i] = _mas[_mas.length - i - 1];
            _mas[_mas.length - i - 1] = tmp;
        }
//        for(int i = 0 ; i < _mas.length;i ++){
//            System.out.println(_mas[i]);
//        }
        return _mas;
    }

    public static Float[][] shiftDown(Float[][] matrix, int temp) {
        for (int i = 0; i < temp; ++i) {
            Float[] val = matrix[0];
            matrix[0] = matrix[matrix.length - 1];
            for (int j = 0; j < matrix.length - 1; ++j) {
                Float[] _val = matrix[j + 1];
                matrix[j + 1] = val;
                val = _val;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }

    public static Float[][] shiftUP(Float[][] matrix, int temp) {
        for (int i = 0; i < matrix.length / 2; i++) {
            Float[] tmp = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = tmp;
        }
        for (int i = 0; i < temp; ++i) {
            Float[] val = matrix[0];
            matrix[0] = matrix[matrix.length - 1];
            for (int j = 0; j < matrix.length - 1; ++j) {
                Float[] _val = matrix[j + 1];
                matrix[j + 1] = val;
                val = _val;
            }
        }
        for (int i = 0; i < matrix.length / 2; i++) {
            Float[] tmp = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = tmp;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }


}
