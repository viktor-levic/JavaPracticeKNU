package org.KNUJavaLabs.HW.hw4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
LabsJava1_2 Part 2 Task 4.3
 */
public class Task4_3 {
    public static void main(String[] args) throws Exception {
        int year = 2022;
        int month = 1;
        int day = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("SATURDAY", 0);
        map.put("SUNDAY", 0);
        for (int i = 1; i <= 400; i++) {
            LocalDate localDate = LocalDate.of(year, month, day);
            java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            if (Objects.equals(dayOfWeek.toString(), "SUNDAY") || Objects.equals(dayOfWeek.toString(), "SATURDAY")) {
                map.put(dayOfWeek.toString(), map.get(dayOfWeek.toString()) + 1);
            }
            year += 1;
        }
        System.out.println("SATURDAY " + map.get("SATURDAY"));
        System.out.println("SUNDAY " + map.get("SUNDAY"));
    }
}