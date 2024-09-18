package org.KNUJavaLabs.HW.hw3;

/*
LabsJava1_2 Part 2 Task 3.6
 */

import java.util.concurrent.ThreadLocalRandom;

public class Task3_6 {
    //    public static void main(String[] args) {
//        float alice = 0;
//        float bob = 0;
//        for ( int i = 0 ; i < 100000000; i ++){
//            alice+=alice();
//            bob += bob();
//        }
//        System.out.println(alice);
//        System.out.println(bob);
//        System.out.println(1-bob/alice);
//    }
//    public static float alice(){
//        int prev = ThreadLocalRandom.current().nextInt(0,2);
//        int now ;
//        int counter = 1;
//        while (true) {
//            now = ThreadLocalRandom.current().nextInt(0,2);
//            counter +=1;
//            if (now == 1 && prev == 1){break;}
//            prev = now;
//        }
//        return (float) counter;
//    }
//    public static float bob(){
//        double prev =  ThreadLocalRandom.current().nextInt(0,2);
//        int now ;
//        int counter = 1;
//        while (true) {
//            now = ThreadLocalRandom.current().nextInt(0,2);
//            counter +=1;
//            if (now == 0 && prev == 1){break;}
//            prev = now;
//        }
//        return (float) counter;
//    }
//
    static int n = 100000;

    enum CoinSide {
        HEAD, TAIL
    }

    static int[] countFlips() {
        boolean[] success = new boolean[]{
                false, false
        };
        int aliceFlips = 0;
        int bobFlips = 0;
        CoinSide lastFlip;
        CoinSide currentFlip = null;
        CoinSide bobsFlip;
        do {
            if (currentFlip == null) {
                currentFlip = flipACoin();
                aliceFlips++;
                bobsFlip = flipACoin();
                bobFlips++;
                if (bobsFlip.equals(CoinSide.TAIL) && (currentFlip.equals(CoinSide.HEAD))) {
                    success[1] = true;
                }
                continue;
            }
            lastFlip = currentFlip;
            currentFlip = flipACoin();
            if (lastFlip.equals(currentFlip) && lastFlip.equals(CoinSide.HEAD))
                success[0] = true;
            if (!success[0])
                aliceFlips++;
            bobsFlip = flipACoin();
            if (!success[1])
                bobFlips++;
            if (bobsFlip.equals(CoinSide.TAIL) && (currentFlip.equals(CoinSide.HEAD))) {
                success[1] = true;
            }
        } while (!success[0] || !success[1]);

        return new int[]{aliceFlips, bobFlips};
    }

    static CoinSide flipACoin() {
        if (ThreadLocalRandom.current().nextDouble() <= 0.5) {
            return CoinSide.HEAD;
        }
        return CoinSide.TAIL;
    }


    public static void main(String[] args) {
        int succeed = 0;
        int total = n;
        for (int i = 0; i < n; i++) {
            int[] flips = countFlips();
            if (flips[0] < flips[1]) {
                succeed++;
            }
        }
        double probability = (double) succeed / total;
        System.out.println(probability);
    }
}
