package org.KNUJavaLabs.ClassWork.lab3;
/*
LabsJava1_2 (2 Part) Task 3.4
 */

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();
        if (x == y && x == z)
            System.out.printf("All numbers are equal");
        else if ((x == y) || (x == z) || (z == y))
            System.out.printf("Two equal numbers");
        else
            System.out.printf("All numbers are different");
    }
}
