package org.KNUJavaLabs.ClassWork.lab1;
/*
LabsJava1_2 (1 Part) Task 2.1
 */

import java.util.Scanner;

public class Task2_1 {
    private String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2_1 task = new Task2_1();
        System.out.println("Input surname: ");
        task.name = sc.next();
        System.out.println("Welcome, " + task.name);
    }
}
