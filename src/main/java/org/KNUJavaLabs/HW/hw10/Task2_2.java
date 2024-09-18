package org.KNUJavaLabs.HW.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_2 {
    public static String coma = ",";

    public static void main(String[] args) {

        String string = "asd,asd,as,da,sdaw,q,ea,sd,wq,e,sd,asd,wqe,a";
        System.out.println("A)");
        a(string);
        System.out.println("B)");
        b(string);
        System.out.println("C)");
        c(string);
    }

    public static void a(String string) {
        if (ifComaIsHere(string)) {
            System.out.println("First coma index:");
            System.out.println(string.indexOf(coma));
        }
    }

    public static void b(String string) {
        if (ifComaIsHere(string)) {
            System.out.println("Last coma index:");
            System.out.println(string.lastIndexOf(","));
        }
    }

    public static void c(String string) {
        if (ifComaIsHere(string)) {
            Matcher m = Pattern.compile(",").matcher(string);
            List<String> allMatches = new ArrayList<String>();
            while (m.find()) {
                allMatches.add(m.group());
            }
            System.out.println("Count of comas:");
            System.out.println(allMatches.size());
        }
    }

    public static Boolean ifComaIsHere(String string) {
        Integer index = string.indexOf(",");
        return !(index == -1);
    }
}
