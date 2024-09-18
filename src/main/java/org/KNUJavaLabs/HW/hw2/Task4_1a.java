package org.KNUJavaLabs.HW.hw2;
/*
LabsJava1_2 Part 1 Task 4.1a
 */

import java.util.Scanner;

public class Task4_1a {
    public static float funcMath(float x) {
        return (float) (Math.pow(x, 4) + 2 * Math.pow(x, 2) + 1);
    }

    public static float funcByHand(float x) {
        float x_2 = x * x;
        return (float) (x_2 * x_2 + 2 * x_2 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println("Math lib :" + funcMath(x));
        System.out.println("Hand made :" + funcByHand(x));
    }
}
