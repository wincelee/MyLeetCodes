package leet_code_quizes.easy;

import classes.Config;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters_1160 {

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println("CountCharacters: " + countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int res = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch: chars.toCharArray()){
            map.put(ch, 0);
        }

        for (String word: words){

            for (int i = 0; i < word.length(); i++){
                System.out.println(Config.ANSI_BLUE + "CurrentChar: " + word.charAt(i));
            }

        }

        return 0;
    }
}
