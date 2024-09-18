package org.KNUJavaLabs.ClassWork.lab3;

import java.util.Scanner;

/*
LabsJava1_2 (2 Part) Task 2.1
 */
public class Task2_1 {
    public static void main(String[] args) {
        int a = 0b1101010; //106
        int b = 0b1010111; //87

        System.out.println("AND: " + Integer.toBinaryString(a & b));
        System.out.println("OR: " + Integer.toBinaryString(a | b));
        System.out.println("XOR: " + Integer.toBinaryString(a ^ b));
    }
}
