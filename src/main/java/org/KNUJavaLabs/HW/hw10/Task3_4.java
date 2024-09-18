package org.KNUJavaLabs.HW.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_4 {
    public static void main(String[] args) {
        String string = "3a*sdq+w*d+qw-d*asd+4-5+";
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("[+|*|-]")
                .matcher(string);
        while (m.find()) {
            allMatches.add(m.group());
        }
        System.out.println(allMatches.size());
    }

}