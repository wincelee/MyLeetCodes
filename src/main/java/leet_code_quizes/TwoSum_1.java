package leet_code_quizes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {

    public static void main(String[] args) {
        //int[] nums = {2,7,11,15};
        int[] nums = {3,3};

        //int target = 9;
        int target = 6;

        System.out.println("TwoSum: " + Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i =0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }
            hashMap.put(nums[i],i);
        }

        return null;
    }
}
