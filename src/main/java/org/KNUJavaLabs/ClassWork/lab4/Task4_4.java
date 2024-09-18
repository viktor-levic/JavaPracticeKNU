package org.KNUJavaLabs.ClassWork.lab4;
/*
LabsJava1_2 (2 Part) Task 4.4
 */

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i);
                System.out.print(" ");
                i += 1;
                if (i > 999) {
                    return;
                }
            }
            i -= 1;
            System.out.print("\n");

        }
    }
}
