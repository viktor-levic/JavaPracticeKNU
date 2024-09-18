package org.KNUJavaLabs.HW.hw2;
/*
LabsJava1_2 Part 1 Task 3.28
 */

import java.util.Scanner;

public class Task3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"r\" :");
        int r = sc.nextInt();
        System.out.println("Enter \"R\" :");
        int R = sc.nextInt();
        float volume = (float) (2 * Math.pow(Math.PI, 2) * Math.pow(r, 2) * R);
        System.out.println(volume);
    }
}
