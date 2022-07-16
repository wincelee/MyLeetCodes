package leet_code_quizes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] nums1 = {3,3};

        //int target = 9;
        int target = 6;

        System.out.println("TwoSumReturnIndexes: " + Arrays.toString(twoSumReturnIndexes(nums1, target)));
        System.out.println("TwoSumReturnElements: " + Arrays.toString(twoSumReturnElements(nums1, target)));
        System.out.println("AreThereElementsThatAddUpToTarget: " + twoSumReturnIfElementsInArrayAddUpToTarget(nums1, target));

    }

    public static int[] twoSumReturnIndexes(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i =0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }
            hashMap.put(nums[i],i);
        }

        return null;
    }

    public static int[] twoSumReturnElements(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{target-nums[i], nums[i]};
            }
            map.put(nums[i],i);
        }

        return null;
    }

    public static boolean twoSumReturnIfElementsInArrayAddUpToTarget(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }
}
