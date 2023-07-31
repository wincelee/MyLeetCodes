package leet_code_quizes.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("FirstUniqueCharacterInAString1: " + firstUniqCharChatGpt(s1));
        System.out.println("FirstUniqueCharacterInAString2: " + firstUniqCharChatGpt(s2));
        System.out.println("FirstUniqueCharacterInAString3: " + firstUniqCharChatGpt(s3));

       /* System.out.println("FirstUniqueCharacterInAString1: " + firstUniqCharTimeLimitExceeded(s1));
        System.out.println("FirstUniqueCharacterInAString2: " + firstUniqCharTimeLimitExceeded(s2));
        System.out.println("FirstUniqueCharacterInAString3: " + firstUniqCharTimeLimitExceeded(s3));*/
    }

    public static int firstUniqCharChatGpt(String s){

        Map<Character, Integer> mMap = new LinkedHashMap<>();

        for (Character ch: s.toCharArray()){

            mMap.put(ch, mMap.getOrDefault(ch, 0) +1);
        }

        for (int i = 0; i < s.length(); i++){
           if (mMap.get(s.charAt(i)) == 1){
               return i;
           }
        }

        return -1;
    }

    public static int firstUniqCharTimeLimitExceeded(String s) {

        Map<Character, Integer> mMap = new LinkedHashMap<>();

        for (Character ch: s.toCharArray()){
            /*if (mMap.containsKey(ch)){
                mMap.put(ch, mMap.get(ch) + 1);
            }else{
                mMap.put(ch, 1);
            }*/
            mMap.put(ch, mMap.getOrDefault(ch,0) +1);
        }

        char ch = '\0';

        for (Map.Entry<Character, Integer> entry : mMap.entrySet()) {
            if (entry.getValue() == 1) {
                ch = entry.getKey();
                break;
            }
        }

        for (int i = 0 ; i < s.toCharArray().length; i++){
            if (ch == s.charAt(i)){
                return i;
            }
        }

        return -1;
    }

}
