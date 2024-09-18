package org.KNUJavaLabs.HW.hw3;

/*
LabsJava1_2 Part 2 Task 3.6
 */
public class Task2_9 {
    public static void main(String[] args) {
        int m = 123121341;
        int k = 2;
        StringBuilder m_str = new StringBuilder().append(m);
        StringBuilder s = new StringBuilder();
        int counter = 0;

        while (m > 0 && m_str.length() - s.length() != k) {
            s.insert(0, m % 10);
            m = m / 10;
            counter += 1;
        }
        System.out.println(s.toString());


    }
}
