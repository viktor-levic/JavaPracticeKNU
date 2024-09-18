package org.KNUJavaLabs.ClassWork.lab4;

/*
LabsJava3 Task 1.6
 */

import java.util.*;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину массиву чисел");
        int n = scanner.nextInt();
        List<Integer> numsListInt = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            Integer num = scanner.nextInt();
            numsListInt.add(num);
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<Integer> lensOfNums = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            map.put(String.valueOf(numsListInt.get(i)), String.valueOf(numsListInt.get(i)).length());
            lensOfNums.add(String.valueOf(numsListInt.get(i)).length());
        }
        Optional<Integer> min = lensOfNums.stream().min(Integer::compare);
        Integer minNum = Integer.parseInt(String.valueOf(min.get()));
        System.out.println("Отже маємо найменшу довжину елемента : " + minNum);
        System.out.println("Числа з такою довжиною :");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), minNum)) {
                System.out.println(entry.getKey());
            }
        }


    }
}
