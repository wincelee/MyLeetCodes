package leet_code_quizes.medium;

import classes.Config;

public class MinimumSizeSubarraySum_209 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int[] nums1 = {1,1,1,1,1,1,1,1};
        int target1 = 11;

        System.out.println(Config.ANSI_BLUE + "MinimumSizeSubarraySum: " + minSubArrayLen(target, nums));
        System.out.println(Config.ANSI_CYAN + "MinimumSizeSubarraySumNums1Target1: " +
                minSubArrayLen(target1, nums1));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        // we assign integers MAX_VALUE because that the largest value that an integer can hold and we are going
        // to compare min with that
        // we compare the min between the largest value and the current min and check if that is the min
        int min = Integer.MAX_VALUE, lp = 0, rp = 0, sum = 0;

        while (rp < nums.length) {
            sum += nums[rp];

            while (sum >= target) {
                min = Math.min(min, rp - lp + 1);
                sum -= nums[lp++];
            }
            rp++;
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }
}
