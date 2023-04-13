package leet_code_quizes.easy;

import java.util.Arrays;

public class MoveZeroes_283 {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        moveZeroesMyOwnMethod(nums);

        //moveZeroesTwo(nums);

        System.out.println("AreElementsSame: " + areElementsSame(new int[]{1,1,3,6}));

    }

    public static void moveZeroesMyOwnMethod(int[] nums) {

        Arrays.sort(nums);

        int lp = 0;
        int rp = nums.length - 1;

        while (lp < rp){
            if(nums[lp] == 0 && nums[rp] != 0){
                int temp = nums[lp];
                nums[lp++] = nums[rp];
                nums[rp--] = temp;

            }
        }


        for (int i = 1; i < nums.length; i++){

            if(nums[i] == 0){
                reverseArray(nums, 0, i-1);
                break;
            }
        }

    }

    public static boolean areElementsSame(int[] nums){

        int firstElement = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[0] != nums[i]){
                return false;
            }

        }

        return true;

    }

    public static int[] reverseArray(int[] nums, int lp, int rp){

        while (lp < rp){
            int temp = nums[lp];
            nums[lp++] = nums[rp];
            nums[rp--] = temp;
        }

        return nums;
    }

    public static void moveZeroesTwo(int[] nums) {

        for (int i = 0; i < nums.length -1; i++){
            if(nums[i] == 0 && nums[i++] != 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }


        System.out.println("MovedZeroesArray: " + Arrays.toString(nums));

    }
}
