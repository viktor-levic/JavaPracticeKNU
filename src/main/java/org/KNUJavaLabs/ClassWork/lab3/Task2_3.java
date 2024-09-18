package org.KNUJavaLabs.ClassWork.lab3;

import java.util.Scanner;

/*
LabsJava1_2 (2 Part) Task 2.3
 */
public class Task2_3 {
    public static void main(String[] args) {
        returnBinary('2');
        returnBinary('7');
        returnBinary('c');
        returnBinary('A');
    }

    public static void returnBinary(char c) {
        System.out.println("char: " + Integer.toBinaryString(c));
    }
}
