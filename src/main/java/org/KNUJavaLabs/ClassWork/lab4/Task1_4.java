package org.KNUJavaLabs.ClassWork.lab4;

/*
LabsJava3 Task 1.4
 */

import java.util.*;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNums = scanner.nextLine();
        String[] strListofNums = stringOfNums.split(" ");
        Map<String, String> map = new HashMap<String, String>();
        String prev = strListofNums[0];
        String now;
        int counter = 1;
        List<Integer> entryList = new ArrayList<Integer>();
        ;
        for (int i = 1; i < strListofNums.length; i++) {
            now = strListofNums[i];
            if (Objects.equals(now, prev)) {
                counter += 1;
                prev = now;
                if (i == strListofNums.length - 1) {
                    map.put(prev, String.valueOf(counter));
                    entryList.add(counter);
                }
            } else {
                map.put(prev, String.valueOf(counter));
                entryList.add(counter);
                counter = 1;
                prev = now;
            }
        }
        Optional<Integer> maxOf = entryList.stream().max(Integer::compare);
        List<Integer> maxEntryList = new ArrayList<Integer>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), maxOf.get().toString())) {
                maxEntryList.add(Integer.valueOf(entry.getKey()));
            }
        }
        System.out.println("" + maxOf.get().toString() + " підряд чисел " + maxEntryList.stream().max(Integer::compare).get().toString());

    }
}
