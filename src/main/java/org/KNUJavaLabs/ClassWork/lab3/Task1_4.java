package org.KNUJavaLabs.ClassWork.lab3;

/*
LabsJava1_2 (2 Part) Task 1.4
 */

public class Task1_4 {
    public static class Measure {
        float a;
    }

    public static void main(String[] args) {
        Measure x = new Measure();
        Measure y = x;
        x.a = 9.0f;
        System.out.println(y.a);
        System.out.println(x.a);

    }

}
