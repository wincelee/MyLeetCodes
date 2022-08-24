package leet_code_quizes.easy;

import java.util.Arrays;

public class SortArrayByParity_905 {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        //System.out.println("sortArrayByParityResult: " + Arrays.toString(sortArrayByParity(nums)));
        System.out.println("sortArrayByParity2Result: " + Arrays.toString(sortArrayByParity2(nums)));

    }

    public static int[] sortArrayByParity(int[] nums){

        int leftIndex = 0, rightIndex = nums.length - 1;

        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && nums[leftIndex] % 2 == 0){
                System.out.println("----------------------------------");
                System.out.println("LeftIsCurrently: " + leftIndex);
                System.out.println("RightIsCurrently: " + rightIndex);
                System.out.println("nums[l] is currently: " + nums[leftIndex]);
                System.out.println("----------------------------------");
                leftIndex++;
            }
            while (leftIndex < rightIndex && nums[rightIndex] % 2 == 1){
                System.out.println("----------------------------------");
                System.out.println("LeftIsCurrently: " + leftIndex);
                System.out.println("RightIsCurrently: " + rightIndex);
                System.out.println("nums[r] is currently: " + nums[rightIndex]);
                System.out.println("----------------------------------");
                rightIndex--;
            }
            int temp = nums[leftIndex];

            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;

        }

        return  nums;
    }

    public static int[] sortArrayByParity2(int[] nums){

        // p1 is pointer 1
        // p2 is pointer
        int p1 = 0, p2 = nums.length - 1;

        // this pointer will continue executing as long as pointer 1 has not met pointer 2
        // while will stop when pointer 1 meets pointer 2
        while (p1 < p2){

            if(nums[p1] % 2 > nums[p2] % 2){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
            }

            if(nums[p1] % 2 == 0){
                p1++;
            }

            if (nums[p2] % 2 == 1){
                p2--;
            }

        }

        return nums;

    }
}
