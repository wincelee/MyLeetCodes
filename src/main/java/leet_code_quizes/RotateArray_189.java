package leet_code_quizes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        // [5, 6, 7, 1, 2, 3, 4]

        int k = 3;

        reverseArr(nums, 0, nums.length -1);
        reverseArr(nums, k, nums.length -1);
        reverseArr(nums, 0, k - 1);


        System.out.println("CurrentNums: " + Arrays.toString(nums));

    }

    public static void reverseArr(int[]nums, int lp, int rp){
        while (lp < rp){
            int temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }

}
