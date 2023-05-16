package leet_code_quizes.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements_347 {

    public static void main(String[] args) {

        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;

        System.out.println("TopKFrequentNums1: " + Arrays.toString(topKFrequent(nums1, k1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){

            }
        }

        return new int[]{1,2};
    }
}
