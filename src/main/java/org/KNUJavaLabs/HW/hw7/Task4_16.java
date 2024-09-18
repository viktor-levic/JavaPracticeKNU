package org.KNUJavaLabs.HW.hw7;

import java.util.Arrays;

/*
LabsJava4 Task 4.16
 */
public class Task4_16 {
    public static void main(String[] args) throws java.lang.Exception {
        BoolMatrix x = new BoolMatrix(6, 6);
        x.randomizeMatrix();
        BoolMatrix y = new BoolMatrix(6, 6);
        y.randomizeMatrix();
        System.out.println("MATRIX A");
        x.displayMatrix();
        System.out.println();
        System.out.println("MATRIX B");
        y.displayMatrix();
        BoolMatrix multM = BoolMatrix.multiply(x, y);
        System.out.println("Multiply of Matrixes");
        multM.displayMatrix();
        BoolMatrix subM = BoolMatrix.add(x, y);
        System.out.println("Summ of Matrixes");
        subM.displayMatrix();
        int[][] transponseM = BoolMatrix.transponse(x.getBoolMatrix());
        System.out.println("TransponseMatrix");
        for (int[] row : transponseM) {
            System.out.println(Arrays.toString(row));
        }
        subM.getAllOnes();
    }
}
