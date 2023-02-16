package leet_code_quizes.easy;

import java.util.Arrays;

public class FindFirstPalindromicStringInTheArray_2108 {

    public static void main(String[] args) {

        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        System.out.println("FirstPalindrome: " + firstPalindrome(words));
        System.out.println("FirstPalindromeUsingStringBuilder: " +
                firstPalindromeUsingStringBuilder(words));
        System.out.println("FirstPalindromeUsingStringBuilderSimplified: " +
                firstPalindromeUsingStringBuilderSimplified(words));
    }


    public static String firstPalindrome(String[] words) {

        for (String word : words) {

            if (isWordPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    public static boolean isWordPalindrome(String word) {

        int wLen = word.length();
        int lp = 0, rp = wLen - 1;

        while (lp < rp) {
            if (word.charAt(lp) != word.charAt(rp)) {
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }

    public static String firstPalindromeUsingStringBuilder(String[] words) {

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            if (word.equals(sb.reverse().toString()))
                return word;
        }
        return "";
    }

    public static String firstPalindromeUsingStringBuilderSimplified(String[] words) {

        for (String word : words) {
            if (new StringBuilder(word).reverse().toString().equals(word)) {
                return word;
            }
        }
        return "";
    }
}
