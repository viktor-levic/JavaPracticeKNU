package org.KNUJavaLabs.ClassWork.lab3;

import java.util.Scanner;

/*
LabsJava1_2 (2 Part) Task 3.3
 */
public class Task3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many rolls? : ");
        int num = in.nextInt();

        int SIDES = 6;

        for (int i = 0; i < num; i++) {
            int roll = (int) (Math.random() * SIDES) + 1;
            System.out.printf("Roll %d: %d \n", i + 1, roll);
        }
    }
}
