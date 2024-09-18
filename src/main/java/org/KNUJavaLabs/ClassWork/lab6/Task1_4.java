package org.KNUJavaLabs.ClassWork.lab6;

/*
LabsJava4 Task 1.4
 */
class Newclass {
    protected int x = 2;

    protected void foo(int y) {
        x = 5 + y;
        System.out.printf("result: %d\n", x);
    }
}

public class Task1_4 {
    public static void main(String[] args) {
        Newclass newclass = new Newclass();
        newclass.foo(5); // result: 10
    }
}
