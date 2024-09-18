package org.KNUJavaLabs.HW.hw4;

import java.util.Scanner;

/*
LabsJava3 Task 1.25
 */
public class Task1_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String strNum = String.valueOf(num);
        String[] listNums = strNum.split("");
        Integer firstOut = 0;
        int secondOut = 0;
        String firstSection = "";
        StringBuilder secondSection = new StringBuilder();
        StringBuilder thirdSection = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            firstOut += Integer.parseInt(listNums[i]);
            if (i == 0) {
                firstSection = listNums[i];
            } else {
                secondSection.append(listNums[i]);
            }
        }
        for (int i = 6; i < listNums.length; i++) {
            secondOut += Integer.parseInt(listNums[i]);
            thirdSection.append(listNums[i]);
        }
        int summOfNums = (firstOut + secondOut * 3);
        int lastNum;
        for (int i = 1; i < 11; i++) {
            if ((summOfNums + i * 3) % 10 == 0 && (i) % 1 == 0) {
                lastNum = i;
                thirdSection.append(lastNum);
                System.out.println(firstOut);
                System.out.println(secondOut * 3);
                System.out.println(firstOut + secondOut * 3);
                System.out.println(lastNum);
                System.out.println(firstSection + "-" + secondSection + "-" + thirdSection);
                break;
            }
            ;
        }

    }
}
