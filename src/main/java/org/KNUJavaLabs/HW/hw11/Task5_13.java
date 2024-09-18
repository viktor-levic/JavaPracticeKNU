package org.KNUJavaLabs.HW.hw11;

import java.io.*;
import java.util.*;

public class Task5_13 {
    public static void main(String[] args) {
        List<Map<String, String>> file = readFile("src/main/java/org/KNUJavaLabs/HW/hw11/Task5_13.txt");
        System.out.println("TASK A)");
        aTask(file, "aaaaa");
        System.out.println("TASK B)");
        bTask(file, "E1");


//        System.out.println(file);
    }

    public static List<Map<String, String>> readFile(String path) {
        BufferedReader reader;
        List<String[]> f = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                f.add(line.split(" "));
                // read next line
                line = reader.readLine();
//                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Map<String, String>> listMap = new ArrayList<>();

        for (String[] a : f) {
            Map<String, String> mapBook = new HashMap<>();
            mapBook.put("author", a[0]);
            mapBook.put("book", a[1]);
            mapBook.put("year", a[2]);
            listMap.add(mapBook);
        }
        return listMap;
    }

    public static void aTask(List<Map<String, String>> file, String author) {
        for (Map<String, String> map : file) {
            if (Objects.equals(map.get("author"), author) && Integer.parseInt(map.get("year")) > 1960) {
                System.out.println("Author :" + map.get("author") + "; Book :" + map.get("book") + "; Year :" + map.get("year"));
            }
        }

    }

    public static void bTask(List<Map<String, String>> file, String book) {
        for (Map<String, String> map : file) {
            if (Objects.equals(map.get("book"), book)) {
                System.out.println("Author :" + map.get("author") + "; Book :" + map.get("book") + "; Year :" + map.get("year"));
            }
        }
    }
}
