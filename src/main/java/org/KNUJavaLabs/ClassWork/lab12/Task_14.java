package org.KNUJavaLabs.ClassWork.lab12;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task_14 {
    public static void main(String[] args) {
        String filename = "text.txt";

        ArrayList<String> lines = new ArrayList<>();

        FileReader fr;
        try {
            fr = new FileReader(filename);
            Scanner scr = new Scanner(fr);

            System.out.println("Lines BEFORE Collections.sort() method \n");
            while (scr.hasNext()) {
                String line = scr.nextLine();
                System.out.println(line);
                lines.add(line);
            }

            fr.close();

            Collections.sort(lines);

            System.out.println("\nLines AFTER Collections.sort() method \n");
            for (String line : lines) {
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
