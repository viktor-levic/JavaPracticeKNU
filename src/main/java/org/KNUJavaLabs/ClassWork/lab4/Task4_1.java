package org.KNUJavaLabs.ClassWork.lab4;
/*
LabsJava1_2 (2 Part) Task 4.1
 */

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, q;
        if (args.length < 2) {
            System.out.println("Not Enough inpyt args");
            return;
        }
        p = Integer.parseInt(args[0]);
        q = Integer.parseInt(args[1]);
        double r = (double) p / q;
        String repr = Double.toString(r);
        System.out.println(repr);
        char[] prev = new char[10];
        int k = 0;
        String answer;
        int point = repr.indexOf(".");
        if (repr.length() < point + 10) {
            answer = repr.substring(0, point);
            answer += "(";
            answer += repr.substring(point);
            answer += ")";
        } else {

            int i, j;
            boolean found = false;
            for (i = point + 1; i < repr.length(); i++) {
                char c = repr.charAt(i);
                for (j = 0; j < k; j++) {
                    if (c == prev[j]) {
                        found = true;
                        break;
                    }
                }
            }
            answer = repr.substring(0, i - k);
            answer += "(";
            answer += repr.substring(i - k, i);
            answer += ")";
        }
        System.out.println("Answer" + answer);
    }
}
