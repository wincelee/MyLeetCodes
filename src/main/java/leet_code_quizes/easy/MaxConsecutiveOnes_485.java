package leet_code_quizes.easy;

import java.util.Arrays;

public class MaxConsecutiveOnes_485 {

    public static void main(String[] args) {

        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println("FindMaxConsecutiveOnesNums1: " + findMaxConsecutiveOnes(nums1));
        System.out.println("FindMaxConsecutiveOnesNums2: " + findMaxConsecutiveOnes(nums2));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int counter = 0, maxCounter = 0;

        for (int num : nums) {

            if (num == 1) {
                counter++;

                if(counter > maxCounter){
                    maxCounter = counter;
                }
            } else {
                counter = 0;
            }
        }

        return maxCounter;
    }
}
