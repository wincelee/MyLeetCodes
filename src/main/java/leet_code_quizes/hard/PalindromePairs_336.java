package leet_code_quizes.hard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromePairs_336 {

    public static void main(String[] args) {

        String[] wordsArrayOne = {"abcd","dcba","lls","s","sssll"};
        String[] wordsArrayTwo = {"a","b","c","ab","ac","aa"};

        System.out.println("PalindromePairs: " + new Gson().toJson(palindromePairs(wordsArrayTwo)));
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();

        // [[0,1],[1,0],[3,2],[2,4]]

        int len = words.length;

        for(int i = 0; i < len; i++){


            for(int j =i+1; j < len; j++){

                List<Integer> fList = new ArrayList<>();
                List<Integer> bList = new ArrayList<>();

                if(isWordPalindrome(words[i] + words[j])){

                    System.out.println("Word[i]: " + words[i]);
                    System.out.println("Word[j]: " + words[j]);
                    fList.add(i);
                    fList.add(j);
                }

                if(isWordPalindrome(words[j] + words[i])){
                    System.out.println("Word[j]: " + words[j]);
                    System.out.println("Word[i]: " + words[i]);
                    bList.add(j);
                    bList.add(i);
                }

                if(!fList.isEmpty()){
                    res.add(fList);
                }if(!bList.isEmpty()){
                    res.add(bList);
                }
            }

        }

        return res;
    }

    public static boolean isWordPalindrome(String word){

        System.out.println("CurrentWord: " + word);

        int lp = 0, rp = word.length() - 1;

        while (lp < rp) {

            if (word.charAt(lp) != word.charAt(rp)) {
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }

    public static boolean isWordPalindrome2(String word){
        char[] wordArr = word.toCharArray();

        int lp = 0, rp = wordArr.length -1;

        while (lp < rp){
            if(wordArr[lp] != wordArr[rp]){
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }

}
