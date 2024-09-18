package org.KNUJavaLabs.ClassWork.lab1;

/*
LabsJava1_2 (1 Part) Task 2.3
 */

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        double a, b, c;
        a = scanIn.nextDouble();
        b = scanIn.nextDouble();
        c = Math.sqrt(a * b);
        System.out.println("Serednye geometrychne " + c);
    }
}
