package leet_code_quizes;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent_1662 {

    public static void main(String[] args) {

        System.out.println("AreArrayStringsEqual: " + arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String finalWord1 = "";
        String finalWord2 = "";

        for (int i =0; i < word1.length; i++) {
            finalWord1 = finalWord1 + word1[i];
        }

        for (int i =0; i < word2.length; i++){
            finalWord2 = finalWord2 + word2[i];
        }

        return  finalWord1.equals(finalWord2);

    }

    public static boolean arrayStringsAreEqualUsingOneLine(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

}
