package leet_code_quizes.easy;

import classes.Config;

import java.util.Arrays;

public class ReversePrefixOfWord_2000 {

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println("String: " + reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {

        char[] wordArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {

            if (ch == word.charAt(i)) {

                int lp = 0, rp = i;

                while (lp < rp) {
                    char temp = wordArray[lp];
                    wordArray[lp++] = wordArray[rp];
                    wordArray[rp--] = temp;
                }

                return new String(wordArray);
            }
        }

        return new String(wordArray);
    }
}
