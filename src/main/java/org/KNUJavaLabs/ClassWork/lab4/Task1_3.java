package org.KNUJavaLabs.ClassWork.lab4;


import java.util.Scanner;

/*
LabsJava3 Task 1.3
 */
public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] listOfNums = new int[n];
        for (int i = 0; i < n; i++) {
            listOfNums[i] = scanner.nextInt();
        }
        double sumOfNums = 0;
        for (int listOfNum : listOfNums) {
            sumOfNums += listOfNum;
        }
        double mean = sumOfNums / listOfNums.length;
        System.out.println("MEAN:" + mean);
        double summWithoumMean = 0;
        for (int listOfNum : listOfNums) {
            summWithoumMean += Math.pow(listOfNum - mean, 2);
        }
        double SampleStandartDeviation = Math.sqrt(summWithoumMean / listOfNums.length);
        System.out.println("Sample Standart Deviation :" + SampleStandartDeviation);


    }

}
