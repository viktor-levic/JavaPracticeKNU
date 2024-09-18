package org.KNUJavaLabs.HW.hw7;
/*
LabsJava4 Task 5.6
 */

public class Moon {
    String name;

    Moon() {
        this.name = "Moon";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "name='" + name + '\'' +
                '}';
    }
}
