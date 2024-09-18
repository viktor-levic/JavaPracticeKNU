package org.KNUJavaLabs.HW.hw6;

import org.KNUJavaLabs.ClassWork.lab6.Student;
import org.KNUJavaLabs.HW.hw6.Abiturient;
/*
LabsJava4 Task 2.4
 */
import java.util.*;

public class Task2_4 {
    public static void main(String[] args) {
        Abiturient[] list = new Abiturient[]{
                new Abiturient(new String[]{"1", "A", "AA", "AAA", "Kyiv", "11111111"}, new int[]{1, 5, 5, 4, 3, 2, 4, 5, 2, 3, 1}),
                new Abiturient(new String[]{"2", "B", "BB", "BBB", "Sumy", "22222222"}, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}),
                new Abiturient(new String[]{"3", "C", "CC", "CCC", "Vinnitsya", "33333333"}, new int[]{3, 5, 5, 5, 5, 1, 5, 4, 4, 2, 1, 2, 4}),
                new Abiturient(new String[]{"4", "D", "DD", "DDD", "Poltava", "44444444"}, new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}),
                new Abiturient(new String[]{"5", "F", "FF", "FFF", "Lviv", "55555555"}, new int[]{1, 1, 1, 2, 2, 2, 1, 4, 3, 2, 1})};
        Scanner scanner = new Scanner(System.in);
        System.out.println("A)\n" + "Students with bad marks :");

        taskA(list);
        System.out.println("B)");
        System.out.println("Enter main summ of marks");
        int enteredSummOfMarks = scanner.nextInt();
        System.out.println("Students with summ of marks greater than " + enteredSummOfMarks + " :");
        taskB(list, enteredSummOfMarks);
        System.out.println("C)\n");
        int enteredNumbOfAbits = 0;
        do {
            System.out.println("Enter number of Abiturients with the greatest marks u wanna see <5");
            enteredNumbOfAbits = scanner.nextInt();
        } while (enteredNumbOfAbits >= 6 || enteredNumbOfAbits == 0);
        System.out.println("Enter Reward Summ:");
        int RewardSumm = scanner.nextInt();
        taskC(list, enteredNumbOfAbits, RewardSumm);


    }

    public static void taskA(Abiturient[] abiturients) {
        for (Abiturient abiturient : abiturients) {
            for (int j = 0; j < abiturient.getMarks().length; j++) {
                if (abiturient.getMarks()[j] < 3) {
                    System.out.println(abiturient.getName() + " " + abiturient.getLastname() + " " + abiturient.getFathername());
                    break;
                }
            }
        }
    }

    public static void taskB(Abiturient[] abiturients, int enteredSummOfMarks) {
        for (Abiturient abiturient : abiturients) {
            if (getSummOfMarks(abiturient.getMarks()) > enteredSummOfMarks) {
                System.out.println(abiturient.getName() + " " + abiturient.getLastname() + " " + abiturient.getFathername());
            }
        }
    }

    public static void taskC(Abiturient[] abiturients, int enteredNumbOfAbits, int RewardSumm) {
        int counter = 0;
        Map<String, Integer> marks = new LinkedHashMap<>();
        for (Abiturient abiturient : abiturients) {
            marks.put(abiturient.getName() + " " + abiturient.getLastname() + " " + abiturient.getFathername(), getSummOfMarks(abiturient.getMarks()));
        }
        int[] greatestMarks = new int[abiturients.length];
        for (Integer sumOfMarks : marks.values()) {
            greatestMarks[counter] = sumOfMarks;
            counter += 1;
        }
        counter = 0;
        Arrays.sort(greatestMarks);
        for (int i = greatestMarks.length - 1; i >= 0; i--) {
            if (counter == enteredNumbOfAbits) {
                break;
            }
            for (int j = 0; j < abiturients.length; j++) {
                if (getSummOfMarks(abiturients[j].getMarks()) == greatestMarks[i]) {
                    System.out.println(abiturients[j].getName() + " " + abiturients[j].getLastname() + " " + abiturients[j].getFathername() + " " + getSummOfMarks(abiturients[j].getMarks()));
                }
            }
            counter += 1;
        }

        System.out.println("Students who have half Reward Summ of marks :");
        for (Abiturient abiturient : abiturients) {
            if (getSummOfMarks(abiturient.getMarks()) > RewardSumm / 2 && getSummOfMarks(abiturient.getMarks()) < RewardSumm) {
                System.out.println(abiturient.getName() + " " + abiturient.getLastname() + " " + abiturient.getFathername() + " " + getSummOfMarks(abiturient.getMarks()));
            }
        }


    }

    public static int getSummOfMarks(int[] marks) {
        int summ = 0;
        for (int mark : marks) {
            summ += mark;
        }
        return summ;
    }


}
