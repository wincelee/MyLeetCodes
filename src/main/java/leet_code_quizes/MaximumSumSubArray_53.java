package leet_code_quizes;


import java.util.Arrays;

public class MaximumSumSubArray_53 {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int[] nums2 = {5,4,-1,7,8};

        System.out.println("MaximumSumSubArray: " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int totalSum = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(currSum>0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }

            if(currSum>totalSum){
                totalSum = currSum;
            }
        }

        return totalSum;

    }



}
