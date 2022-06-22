package leet_code_quizes;

import java.util.HashSet;

public class JewelsAndStones_771 {

    public static void main(String[] args) {

    }

    public static int numJewelsInStonesUsingTwoForLoops(String jewels, String stones) {

        HashSet<Character> jewelsSet = new HashSet<>();

        int counter = 0;

        for (int i =0; i < jewels.length(); i++){
            jewelsSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++){
            if (jewelsSet.contains(stones.charAt(i))){
                counter++;
            }
        }

        return counter;
    }

    public static int numJewelsInStonesUsingForEachLoop(String jewels, String stones) {

        HashSet<Character> jewelsSet = new HashSet<>();

        int counter = 0;

        for (char j: jewels.toCharArray()){
            jewelsSet.add(j);
        }

        for (char s: stones.toCharArray()){
            if(jewelsSet.contains(s)){
                counter++;
            }
        }

        return counter;
    }
}
