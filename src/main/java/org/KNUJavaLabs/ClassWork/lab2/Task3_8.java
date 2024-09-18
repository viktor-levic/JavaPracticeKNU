package org.KNUJavaLabs.ClassWork.lab2;

/*
LabsJava1_2 (1 Part) Task 3.8
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        long rounded = (long) x;
        double fraction = x - rounded;
        long floor = (long) Math.floor(x);
        long ceil = (long) Math.ceil(x);

        System.out.println(Arrays.asList(
                x, rounded, fraction, floor, ceil
        ));
    }
}
