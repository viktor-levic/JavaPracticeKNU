package org.KNUJavaLabs.ClassWork.lab3;

import java.util.Scanner;

/*
LabsJava1_2 (2 Part) Task 2.2
 */
public class Task2_2 {
    public static void main(String[] args) {
        int a = 0b1101010; //106
        a = a << 1;
        while (a != 0) {
            a = a >> 1;
            System.out.println("number: " + Integer.toBinaryString(a));
        }
    }
}
