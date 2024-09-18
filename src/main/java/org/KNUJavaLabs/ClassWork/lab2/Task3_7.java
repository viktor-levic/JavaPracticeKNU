package org.KNUJavaLabs.ClassWork.lab2;

/*
LabsJava1_2 (1 Part) Task 3.7
 */

public class Task3_7 {

    public static final double gamma = 6.673e-11;

    static double G(double m1, double m2, double r) {
        assert r > 0 && m1 >= 0 && m2 >= 0;
        double r2 = r * r;
        return ((m1 / r2) * (m2 / r2)) * gamma;
    }

    public static void main(String[] args) {
        System.out.printf("F = %e", G(100000, 1224.23, 500));
    }
}
