package org.KNUJavaLabs.HW.hw2;
/*
LabsJava1_2 Part 1 Task 4.1b
 */

import java.util.Scanner;

public class Task4_1b {
    public static float funcMath(float x) {
        return (float) (Math.pow(x, 4) + Math.pow(x, 3) + Math.pow(x, 2) + x + 1);
    }

    public static float funcByHand(float x) {
        float x_2 = x * x;
        return (float) (x_2 * x_2 + x_2 * x + x_2 + x + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println("Math lib :" + funcMath(x));
        System.out.println("Hand made :" + funcByHand(x));
    }
}
