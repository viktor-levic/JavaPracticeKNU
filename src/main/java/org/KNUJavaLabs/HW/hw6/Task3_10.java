package org.KNUJavaLabs.HW.hw6;

import java.util.*;

/*
LabsJava4 Task 3.10
 */
public class Task3_10 {
    public static void main(String[] args) {
        List<Line> list = new ArrayList<>();
        list.add(new Line(new Integer[]{1, 3, 15}));
        list.add(new Line(new Integer[]{4, 12, 20}));
        list.add(new Line(new Integer[]{8, 12, 3}));
        list.add(new Line(new Integer[]{6, 18, 1}));
        list.add(new Line(new Integer[]{4, 6, 7}));
        System.out.println("INTERSECTION OF LINES WITH X and Y AXIS");
        for (Line line : list) {
            System.out.println(line.toString());
            System.out.println(line.getPointIntersectionWithX());
            System.out.println(line.getPointIntersectionWithY());
            System.out.println("-----------------------");
        }
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("INTERSECTION OF [0] and [1] LINES :");
        System.out.printf("%s;%s%s;%s", list.get(0), System.lineSeparator(), list.get(1), System.lineSeparator());
        System.out.printf("%s%s", list.get(0).getPointIntersectionLines(list.get(1)), System.lineSeparator());

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("GROUPS OF PARALEL LINES :\n");
        printGroupsOfParallelLines(getParallelGroupsOfLines(list));


    }

    public static Map<Line, List<Line>> getParallelGroupsOfLines(List<Line> list) {
        Map<Line, List<Line>> mapOfParalelLines = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            boolean indicator;
            while (!list.isEmpty()) {
                indicator = false;
                Line line = list.remove(0);
                for (Line lineMap : mapOfParalelLines.keySet()) {
                    if (lineMap.isParallel(line)) {
                        mapOfParalelLines.get(lineMap).add(line);
                        indicator = true;
                        break;
                    }
                }
                if (!indicator) {
                    mapOfParalelLines.put(line, new ArrayList<>());
                }
            }
        }
        return mapOfParalelLines;
    }

    public static void printGroupsOfParallelLines(Map<Line, List<Line>> groupsOfParallelLines) {
        for (Map.Entry<Line, List<Line>> group : groupsOfParallelLines.entrySet()) {
            if (group.getValue().size() > 0) {
                for (Line line : group.getValue()) {
                    System.out.printf("Line %s is paralel to line: %s;\n", group.getKey(), line);
                }
                System.out.println();
            }
        }
    }
}
