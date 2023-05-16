package leet_code_quizes.medium;

import java.util.Arrays;

public class AdditiveNumber_306 {

    public static void main(String[] args) {
        String num = "112358";

        System.out.println("IsAdditiveNumber: " + isAdditiveNumber(num));

    }

    public static boolean isAdditiveNumber(String num) {

        char[] numChar = num.toCharArray();

        int[] nums = new  int[numChar.length];

        for (char i = 0; i < numChar.length; i++){

            nums[i] = num.charAt(i) - '0';

        }

        for (int i = 0; i < nums.length -2; i++){
            if (nums[i] + nums[i+1] != nums[i+2]){
                return false;
            }
        }

        return true;
    }
}
