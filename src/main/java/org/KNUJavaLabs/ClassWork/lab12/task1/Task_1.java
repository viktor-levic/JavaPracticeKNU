package org.KNUJavaLabs.ClassWork.lab12.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/org/KNUJavaLabs/ClassWork/lab12/task1/a.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        List<String> strings = new ArrayList<>();
        while (line != null) {
            System.out.println(line);
            strings.add(line);
            line = reader.readLine();

        }
        FileWriter writer = new FileWriter("src/main/java/org/KNUJavaLabs/ClassWork/lab12/task1/b.txt", false);
        Collections.reverse(strings);
        System.out.println(strings);
        for(String string : strings){
            writer.write(string+"\n");
        }
        writer.flush();
    }

}
