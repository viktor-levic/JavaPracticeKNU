package org.KNUJavaLabs.ClassWork.lab4;
/*
LabsJava1_2 (2 Part) Task 4.5
 */

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        int max = 1000;
        int lenMax = Integer.toString(max).length();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < max; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i);
                StringBuilder space = new StringBuilder();

                for (int k = 0; k < lenMax - Integer.toString(i).length(); k++) {
                    space.append(" ");
                }

                System.out.print(space);
                i += 1;
                if (i >= max) {
                    return;
                }
            }
            i -= 1;
            System.out.print("\n");

        }
    }
}
