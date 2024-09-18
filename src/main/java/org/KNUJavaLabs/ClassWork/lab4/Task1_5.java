package org.KNUJavaLabs.ClassWork.lab4;

/*
LabsJava3 Task 1.5
 */

import java.util.*;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координату Х точки А");
        int x = scanner.nextInt();
        System.out.println("Введіть координату У точки А");
        int y = scanner.nextInt();
        System.out.println("Введіть координату Z точки А");
        int z = scanner.nextInt();
        System.out.println("Введіть Скільки точок бажаєте ввести в масиві");
        int n = scanner.nextInt();
        Map<String, Double> map = new HashMap<String, Double>();
        List<Double> distanceList = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть координату Х точки " + i);
            int x_point = scanner.nextInt();
            System.out.println("Введіть координату У точки " + i);
            int y_point = scanner.nextInt();
            System.out.println("Введіть координату Z точки " + i);
            int z_point = scanner.nextInt();
            double distance = (double) Math.sqrt(Math.pow(x_point - x, 2) + Math.pow(y_point - y, 2) + Math.pow(z_point - z, 2));
            map.put("" + x_point + " " + y_point + " " + z_point, distance);
            distanceList.add(distance);
        }
        Optional<Double> minDistance = distanceList.stream().min(Double::compare);
        double min = Double.parseDouble(String.valueOf(minDistance.get()));
        System.out.println("Точки, та їх відстань до початкової точки");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println("");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.println(
                        "Найменша відстань від початкової точки буде :" + entry.getValue() + "\n" +
                                "До точки з координатами :" + entry.getKey());
            }
        }
    }
}
