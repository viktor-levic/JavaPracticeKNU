package org.KNUJavaLabs.HW.hw7;
/*
LabsJava4 Task 4.16
 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BoolMatrix {
    int[][] boolMatrix;
    int n, m;

    BoolMatrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.boolMatrix = new int[this.n][this.m];
    }

    BoolMatrix(int[][] paramMatrix) {
        this.n = paramMatrix.length;
        this.m = paramMatrix[0].length;
        this.boolMatrix = paramMatrix;
    }


    public void randomizeMatrix() {
        int min = 0, max = 1;
        int[][] matrix = new int[this.n][this.m];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                matrix[i][j] = randomNum;
            }
        }
        this.boolMatrix = matrix;
    }

    public void setBoolMatrix(int[][] boolMatrix) {
        this.boolMatrix = boolMatrix;
    }

    public int[][] getBoolMatrix() {
        return boolMatrix;
    }

    public int getElement(int n, int m) {
        return this.boolMatrix[n][m];
    }

    public void setElement(int n, int m, int value) {
        this.boolMatrix[n][m] = value;
    }

    public int getVerticalLength() {
        return this.boolMatrix.length;
    }

    public int getHorizontalLength() {
        return this.boolMatrix[0].length;
    }

    public void displayMatrix() {
        for (int[] matrix : this.boolMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static BoolMatrix add(BoolMatrix first, BoolMatrix second) throws BadLenghtOfMatrixes {
        if (first.getVerticalLength() != second.getVerticalLength() ||
                first.getHorizontalLength() != second.getHorizontalLength()) {
            throw new BadLenghtOfMatrixes();
        } else {
            BoolMatrix tmpMatrix = new BoolMatrix(first.getVerticalLength(), second.getHorizontalLength());
            for (int i = 0; i < tmpMatrix.getHorizontalLength(); i++) {
                for (int j = 0; j < tmpMatrix.getVerticalLength(); j++) {
                    tmpMatrix.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
                }
            }
            return tmpMatrix;
        }
    }

    public static int[][] transponse(int[][] paramMatrix) {
        int[][] tmpMatrix = new int[paramMatrix[0].length][paramMatrix.length];
        for (int i = 0; i < paramMatrix[0].length; i++) {
            for (int j = 0; j < paramMatrix.length; j++) {
                tmpMatrix[i][j] = paramMatrix[j][i];
            }
        }
        return tmpMatrix;
    }

    public static BoolMatrix multiply(BoolMatrix one, BoolMatrix two) throws BadLenghtOfMatrixes {
        if (one.getHorizontalLength() != two.getVerticalLength()) {
            System.out.println("Exception");
            throw new BadLenghtOfMatrixes();
        } else {
            BoolMatrix tmpMatrix;
            int n = one.getVerticalLength();
            int m = two.getHorizontalLength();
            int o = two.getVerticalLength();
            int[][] tmpArr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < o; k++) {
                        tmpArr[i][j] += one.getElement(i, k) * two.getElement(k, j);
                    }
                }
            }
            tmpMatrix = new BoolMatrix(tmpArr);
            return tmpMatrix;
        }
    }

    public void getAllOnes() {
        int counter = 0;
        for (int[] row : this.boolMatrix) {
            for (int num : row) {
                if (num == 1) {
                    counter += 1;
                }
            }
        }
        System.out.println("Count of 1 -> " + counter);
    }


    @Override
    public String toString() {
        return "BoolMatrix{" +
                "boolMatrix=" + Arrays.toString(boolMatrix) +
                '}';
    }

}

class BadLenghtOfMatrixes extends Exception {
    public BadLenghtOfMatrixes() {
        System.out.println("Матриці не співпадають розмірами");
    }
}
