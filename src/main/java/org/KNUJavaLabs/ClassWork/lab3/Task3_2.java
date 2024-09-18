package org.KNUJavaLabs.ClassWork.lab3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
LabsJava1_2 (2 Part) Task 3.2
 */
public class Task3_2 {
    public static void main(String[] args) {
        Random25();
    }

    public static void Random25() {
        int a = (int) (ThreadLocalRandom.current().nextInt());
        for (int i = 0; i < 24; i++) {
            int b = (int) (ThreadLocalRandom.current().nextInt());
            if (b > a)
                System.out.printf("%d < %d \n", a, b);
            else if (a > b)
                System.out.printf("%d > %d \n", a, b);
            else
                System.out.printf("%d == %d \n", a, b);
            a = b;
        }
    }
}
