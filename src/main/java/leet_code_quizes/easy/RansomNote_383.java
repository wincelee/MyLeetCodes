package leet_code_quizes.easy;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote_383 {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println("CanConstruct: " + canConstruct(ransomNote, magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Check if the ransom note can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (!freqMap.containsKey(ch) || freqMap.get(ch) == 0) {
                return false;
            }
            freqMap.put(ch, freqMap.get(ch) - 1);
        }

        return true;
    }
}
