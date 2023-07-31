package leet_code_quizes.easy;

import java.util.Arrays;

public class RelativeRanks_506 {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

        System.out.println("FindRelativeRanks: " + Arrays.toString(findRelativeRanks(nums)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int goldMedal = 0, silverMedal = 0, bronzeMedal = 0;

        String[] res = new String[score.length];

        for (int currentScore: score){
            if (currentScore > goldMedal){
                goldMedal = currentScore;
            }else{
                if (currentScore > silverMedal){
                    silverMedal = currentScore;
                }else{
                    if (currentScore > bronzeMedal){
                        bronzeMedal = currentScore;
                    }
                }
            }
        }

        for (int i = 0; i < score.length; i++){
            if (score[i] == goldMedal){
                res[i] =  "Gold Medal";
            }

            else if (score[i] == silverMedal){
                res[i] = "Silver Medal";
            }

            else if (score[i] == bronzeMedal){
                res[i] = "Bronze Medal";
            }else{
                res[i] = String.valueOf(i);
            }
        }

        System.out.println("GoldMedal: " + goldMedal);
        System.out.println("SilverMedal: " + silverMedal);
        System.out.println("BronzeMedal: " + bronzeMedal);

        return res;
    }
}
