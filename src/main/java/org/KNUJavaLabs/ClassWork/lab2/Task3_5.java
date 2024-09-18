package org.KNUJavaLabs.ClassWork.lab2;

/*
LabsJava1_2 (1 Part) Task 3.5
 */

import java.util.Arrays;

public class Task3_5 {

    public static void main(String[] args) {
        int[] ints = new int[]{
                1, 2, 0, 4, 5
        };
        double[] doubles = new double[]{
                45, 23, 4, -1, 18
        };

        String delim = " | ";

        System.out.println(String.join(
                delim, Arrays.stream(ints).mapToObj(String::valueOf)
                        .toArray(String[]::new)));
        System.out.println(String.join(
                delim, Arrays.stream(ints).mapToObj(x -> "--")
                        .toArray(String[]::new)));
        System.out.println(String.join(
                delim, Arrays.stream(doubles).mapToObj(x -> String.format("%.2f", x))
                        .toArray(String[]::new)));

    }
}
