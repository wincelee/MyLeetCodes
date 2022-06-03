package leet_code;

import java.util.Arrays;

public class SortArrayByParity_905 {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        System.out.println("sortArrayByParityResult: " + Arrays.toString(sortArrayByParity(nums)));

    }

    public static int[] sortArrayByParity(int[] nums){

        int l = 0, r = nums.length - 1;

        System.out.println("nums[4] before while loop is currently: " + nums[4]);

        while (l < r){
            while (l < r && nums[l] % 2 == 0){
                System.out.println("----------------------------------");
                System.out.println("LeftIsCurrently: " + l);
                System.out.println("RightIsCurrently: " + r);
                System.out.println("nums[l] is currently: " + nums[l]);
                System.out.println("----------------------------------");
                l++;
            }
            while (l < r && nums[r] % 2 == 1){
                System.out.println("----------------------------------");
                System.out.println("LeftIsCurrently: " + l);
                System.out.println("RightIsCurrently: " + r);
                System.out.println("nums[r] is currently: " + nums[r]);
                System.out.println("----------------------------------");
                r--;
            }
            int temp = nums[l];

            nums[l] = nums[r];
            nums[r] = temp;

        }

        return  nums;
    }
}
