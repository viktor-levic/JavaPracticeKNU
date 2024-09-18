package org.KNUJavaLabs.ClassWork.lab1;

/*
LabsJava1_2 (1 Part) Task 2.2
 */

import java.util.Scanner;

public class Task2_2 {
    static final boolean useLog = true;

    static void method1() {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(num1.length() + " " + num2.length());
    }

    static void method2() {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println((int) Math.ceil(Math.log10(num1)) + " " + (int) Math.ceil(Math.log10(num2)));
    }

    public static void main(String[] args) {
        if (useLog) {
            method2();
        } else {
            method1();
        }
    }
}
