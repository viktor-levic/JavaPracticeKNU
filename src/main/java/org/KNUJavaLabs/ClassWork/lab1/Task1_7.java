package org.KNUJavaLabs.ClassWork.lab1;

/*
LabsJava1_2 (1 Part) Task 1.7
 */

public class Task1_7 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        for (String str : args) {
            name.append(str);
            name.append(" ");
        }
        System.out.println("Name :" + name);
    }
}
