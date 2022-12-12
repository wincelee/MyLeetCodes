package leet_code_quizes.easy;

import classes.Config;

import java.util.Arrays;

public class SearchInsertPosition_35 {

    public static void main(String[] args) {

        //             0,1,2,3
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int[] nums4 = {1};
        int target5 = 0;


        System.out.println("\u001B[33m" + "SearchInsert: " + searchInsert(nums4, target5));


    }

    public static int searchInsert(int[] nums, int target) {

        int res = 0;


        for (int i =1; i < nums.length; i++){

           if(target > nums[i-1] && target < nums[i]){
               return i;
           }

           if(nums[i-1] == target){
               return i-1;
           }

            if (target < nums[i-1]){
                return i-1;
            }

            if (target > nums[i-1] && target > nums[i]){
                res = (i +1);
            }

            System.out.println(Config.ANSI_PURPLE + "Target" + target);

            if (target < nums[i-1]){
                return i-1;
            }


        }

        return res;
    }
}
