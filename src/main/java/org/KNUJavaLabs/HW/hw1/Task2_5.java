package org.KNUJavaLabs.HW.hw1;
/*
LabsJava1_2 Part 1 Task 2.5
 */

import java.util.Arrays;

public class Task2_5 {
    public static void main(String[] args) {
        StringBuilder argsRevers = new StringBuilder();
        for (int i = args.length - 1; i >= 0; i--) {
            argsRevers.append(args[i]);
            argsRevers.append(" ");
        }
        System.out.println(argsRevers);
    }
}
