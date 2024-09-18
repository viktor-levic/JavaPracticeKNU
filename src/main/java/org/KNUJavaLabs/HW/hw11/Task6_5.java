package org.KNUJavaLabs.HW.hw11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Task6_5 {
    static String path = "src/main/java/org/KNUJavaLabs/HW/hw11/";

    public static void writeToBinary(String filename, int[] intValues) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename));

            for (int value : intValues) {
                dos.writeInt(value);
            }

            dos.flush();
            dos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert dos != null;
                dos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static byte[] readFromBinary(String filename) {
        byte[] allBytes = new byte[0];
        try {
            allBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allBytes;
    }

    public static int[] toIntArray(byte[] byteArray) {
        int times = Integer.SIZE / Byte.SIZE;
        int[] integers = new int[byteArray.length / times];

        for (int i = 0; i < integers.length; ++i) {
            integers[i] = ByteBuffer.wrap(byteArray, i * times, times).getInt();
        }

        return integers;
    }

    public static void generateIntArray(String filename, int size) {
        int[] intArray = new int[size];

        for (int i = 0; i < size / 2; ++i) {
            Random r = new Random();
            intArray[i] = r.nextInt(200);
        }

        for (int i = size / 2; i < size; ++i) {
            Random r = new Random();
            intArray[i] = r.nextInt(200) - 300;
        }

        writeToBinary(filename, intArray);
    }

    public static void TaskA(int n) {
        int[] file = toIntArray(readFromBinary(path + "fileF.dat"));
        int max = -2147483647;
        for (int i = 0; i < n; i++) {
            if (file[i] > max) {
                max = file[i];
            }
        }
        int[] gFile = new int[n + 1];
        gFile[0] = max;
        for (int i = 0; i < n; i++) {
            gFile[i + 1] = file[i];
        }
        writeToBinary(path + "fileG.dat", gFile);

    }

    public static void TaskB(int n) {
        int[] file = toIntArray(readFromBinary(path + "fileF.dat"));
        int maxFirst = -2147483647;
        for (int i = 0; i < n; i++) {
            if (file[i] > maxFirst) {
                maxFirst = file[i];
            }
        }
        int[] gFile = new int[n + 2];
        gFile[0] = maxFirst;
        for (int i = 0; i < n; i++) {
            gFile[i + 1] = file[i];
        }
        int maxLast = -2147483647;
        for (int i = n; i < file.length; i++) {
            if (file[i] > maxLast) {
                maxLast = file[i];
            }
        }
        gFile[n + 1] = maxLast;
        writeToBinary(path + "fileG.dat", gFile);


    }

    public static void main(String[] args) {
        int n = 8;
        int size = 16;
        generateIntArray("fileF.dat", size);
        if (size % n == 0) {
            TaskA(n);
        } else {
            TaskB(n);
        }

    }
}
