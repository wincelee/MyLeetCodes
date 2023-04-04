package leet_code_quizes.easy;

import java.util.Arrays;

public class RepeatedSubstringPattern_459 {

    public static void main(String[] args) {

        String s1 = "abab";

        System.out.println("RepeatedStringPattern: " + repeatedSubstringPattern(s1));

    }

    public static boolean repeatedSubstringPattern(String s) {

        /*for (int i = 0; i < s.length(); i++){
            System.out.println("CurrentChar: " + s.charAt(i));
        }*/

        return s.length() % 2 == 0;
    }
}
