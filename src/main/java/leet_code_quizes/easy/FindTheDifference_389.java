package leet_code_quizes.easy;

import classes.Config;

import java.util.HashSet;
import java.util.Set;

public class FindTheDifference_389 {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(Config.ANSI_GREEN + "FindDifference: " + findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {

        if(s == null){
            return t.charAt(0);
        }

        Set<Character> sSet = new HashSet<>();

        for (Character ch: s.toCharArray()){
            sSet.add(ch);
        }

        for (Character ch: t.toCharArray()) {

            if (!sSet.contains(ch)) {
                return ch;
            }
        }

        return ' ';

    }
}
