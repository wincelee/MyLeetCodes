package leet_code_quizes.easy;

import classes.Config;

import java.util.Arrays;

public class CountingWordsWithAGivenPrefix_2185 {

    public static void main(String[] args) {

        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";

        String[] words2 = {"leetcode","win","loops","success"};
        String pref2 = "code";

        System.out.println(Config.ANSI_GREEN + "PrefixCount: " + prefixCount(words2, pref2));
        System.out.println(Config.ANSI_YELLOW + "PrefixCountStartsWith: " +
                prefixCountStartsWithSolution(words2, pref2));
        System.out.println(Config.ANSI_RED + "PrefixCountIndexOfSolution: " +
                prefixCountIndexOfSolution(words2, pref2));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        int prefLength = pref.length();

        for (int i = 0; i < words.length; i++){

            String currWord = words[i];

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < currWord.length(); j++){

                sb.append(currWord.charAt(j));

                if (sb.length() == prefLength){
                    if (sb.toString().equals(pref)) {
                        count++;
                    }
                    break;
                }
            }
        }

        return count;
    }

    public static int prefixCountStartsWithSolution(String[] words, String pref) {
        int count=0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static int prefixCountIndexOfSolution(String[] words, String pref) {
        int count = 0;


        System.out.println("IndexOf: " + Arrays.toString(words) + ", pref = " + pref);

        /*for (String word: words) {

            if (word.indexOf(pref) == 0) {
                count++;
            }
        }*/
        return count;
    }

}
