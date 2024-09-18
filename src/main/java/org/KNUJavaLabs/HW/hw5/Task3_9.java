package org.KNUJavaLabs.HW.hw5;

/*
LabsJava3 Task 3.9
 */
public class Task3_9 {
    String name;

    public void hello() {
        System.out.println("hello, " + name);
    }

    public void doubleHello() {
        hello();
        this.hello();
    }
}
