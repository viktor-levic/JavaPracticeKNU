package org.KNUJavaLabs.HW.hw8;

import org.KNUJavaLabs.HW.hw8.RockMusic;

import java.util.*;

public class Task6_5 {
    public static void main(String[] args) {
        List<RockMusic> rockMusicPlayList = new ArrayList<>();
        rockMusicPlayList.add(new RockMusic("RingsSong1", 2.15F, "1"));
        rockMusicPlayList.add(new RockMusic("RingsSong2", 2.25F, "2"));
        rockMusicPlayList.add(new RockMusic("RingsSong3", 2.35F, "1"));
        rockMusicPlayList.add(new RockMusic("RingsSong4", 2.45F, "2"));
        rockMusicPlayList.add(new RockMusic("RingsSong5", 2.55F, "3"));
        rockMusicPlayList.add(new RockMusic("RingsSong6", 2.65F, "2"));
        rockMusicPlayList.add(new RockMusic("RingsSong7", 2.75F, "3"));

        float summaryLengthOfPlayist = 0.0F;
        for (RockMusic rockMusic : rockMusicPlayList) {
            summaryLengthOfPlayist += rockMusic.getTime();
        }
        System.out.println("Summary length of our PlayList : " + summaryLengthOfPlayist);

        Set<String> SetOfStyles = new HashSet<>();
        for (RockMusic song : rockMusicPlayList) {
            SetOfStyles.add(song.getType());
        }
        List<RockMusic> sortedPlayListByStyle = new ArrayList<>();
        for (String style : SetOfStyles) {
            List<RockMusic> currentStyle = new ArrayList<>();
            for (RockMusic song : rockMusicPlayList) {
                if (Objects.equals(song.getType(), style)) {
                    currentStyle.add(song);
                }
            }
            sortedPlayListByStyle.addAll(currentStyle);
            currentStyle.clear();
        }
        System.out.println("Sorted by style Playlist");
        for (RockMusic song : sortedPlayListByStyle) {
            System.out.println(song.toString());
        }
        System.out.println("\n\n\n" +
                "FINDING SONG WITH LENGHT 2.36 - 2.45\n\n");
        float min = 2.36F;
        float max = 2.45F;
        for (RockMusic song : sortedPlayListByStyle) {
            if (song.getTime() <= max && song.getTime() >= min) {
                System.out.println(song.toString());
            }
        }
    }
}
