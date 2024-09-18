package org.KNUJavaLabs.ClassWork.lab7;
/*
LabsJava4 Task 4.1
 */

import java.util.Random;

public class Task4_1 {

    public static void main(String[] args) {
        int n = 21;

        Polinom[] polinomsList = new Polinom[n];
        for (int i = 0; i < n; i++) {
            float[] arrFloats = new float[10];
            for (int j = 0; j < 10; j++) {
                float generatedFloat = new Random().nextFloat();
                arrFloats[j] = generatedFloat;
            }
            polinomsList[i] = new Polinom(arrFloats);
        }
        for (Polinom polinom : polinomsList) {
            System.out.println(polinom);
        }
        float summOfPolinoms = 0.0F;
        for (Polinom polinom : polinomsList) {
            for (float coef : polinom.coefs) {
                summOfPolinoms += coef;
            }
        }
        System.out.println("Summ of Polinoms" + summOfPolinoms);
    }
}
