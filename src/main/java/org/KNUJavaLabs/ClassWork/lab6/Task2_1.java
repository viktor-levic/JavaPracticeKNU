package org.KNUJavaLabs.ClassWork.lab6;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2_1 {
    public static void main(String[] args) throws ParseException {
        Student[] list = new Student[]{
                new Student(new String[]{"A", "AA", "01.01.2011", "A1", "F", "1", "111", "1"}),
                new Student(new String[]{"B", "BB", "02.02.2011", "A2", "F", "2", "222", "1"}),
                new Student(new String[]{"C", "CC", "09.05.2012", "A3", "J", "5", "333", "1"}),
                new Student(new String[]{"D", "DD", "17.10.2013", "A4", "J", "5", "444", "2"}),
                new Student(new String[]{"F", "FF", "07.02.2012", "A5", "L", "1", "555", "4"})};

        Scanner in = new Scanner(System.in);
        String command = "end";
        do {
            System.out.print("\nEnter command: ");
            command = in.nextLine();
            if (command.equals("faculty")) {
                System.out.print("\nEnter faculty: ");
                command = in.nextLine();
                for (Student a : list) {
                    if (a.getFaculty().equals(command))
                        System.out.print(a.toString());
                }
            } else if (command.equals("year")) {
                System.out.print("\nEnter date: ");
                command = in.nextLine();
                Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(command);
                for (Student a : list) {
                    Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse(a.getDateOfBirth());
                    if (date2.compareTo(date1) > 0)
                        System.out.print(a.toString());
                }
            } else if (command.equals("group")) {
                System.out.print("\nEnter faculty: ");
                command = in.nextLine();
                System.out.printf("Groups: ");
                for (Student a : list) {
                    if (a.getFaculty().equals(command))
                        System.out.printf("%d ", a.getGroup());
                }
            }
        } while (command != "end");
    }

}
