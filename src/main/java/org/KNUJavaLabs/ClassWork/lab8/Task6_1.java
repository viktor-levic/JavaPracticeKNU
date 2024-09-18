package org.KNUJavaLabs.ClassWork.lab8;

import org.KNUJavaLabs.HW.hw8.RockMusic;

import java.util.*;
import java.util.concurrent.Flow;

public class Task6_1 {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        Accessories accessories = new Accessories(new String[]{"packaging", "bob", "paper"});
        flowers.add(new Flower(11, 2, accessories));
        flowers.add(new Flower(12, 3, accessories));
        flowers.add(new Flower(13, 1, accessories));
        flowers.add(new Flower(14, 2, accessories));
        flowers.add(new Flower(15, 3, accessories));
        flowers.add(new Flower(16, 3, accessories));

        Set<Integer> SetOfSpoils = new HashSet<>();
        for (Flower flower : flowers) {
            SetOfSpoils.add(flower.getDegreeOfSpoil());
        }
        System.out.println(SetOfSpoils);
        List<Flower> sortedFlowerList = new ArrayList<>();
        for (int spoil : SetOfSpoils) {
            List<Flower> currentStyle = new ArrayList<>();
            for (Flower flower : flowers) {
                if (Objects.equals(flower.getDegreeOfSpoil(), spoil)) {
                    currentStyle.add(flower);
                }
            }
            sortedFlowerList.addAll(currentStyle);
            currentStyle.clear();
        }
        System.out.println("Sorted by style Playlist");
        for (Flower flower : sortedFlowerList) {
            System.out.println(flower.toString());
        }

        System.out.println("\n\n\n" +
                "Flower with length from 10cm to 12 cm\n\n\n");
        int min = 10, max = 12;
        for (Flower flower : sortedFlowerList) {
            if (flower.getLength() < max && flower.getLength() > min) {
                System.out.println(flower);
            }
        }
    }


}
