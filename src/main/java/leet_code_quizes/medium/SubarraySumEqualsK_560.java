package leet_code_quizes.medium;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarraySumEqualsK_560 {

    public static void main(String[] args) {

        int k1 = 2;
        int[] nums1 = {1,1,1};

        int k2 = 3;
        int[] nums2 = {1,2,3};

        int k3 = 5;
        int[] nums3 = {3, 9, -2, 4, 1, -7};

        System.out.println("Nums1 subArraySum: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySum(nums1, k1));
        System.out.println("Nums2 subArraySum: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySum(nums2, k2));
        System.out.println("Nums3 subArraySum: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySum(nums3, k3));

        System.out.println("\n");

        System.out.println("Nums1 subarraySumMyOwnMethod: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySumMyOwnMethod(nums1, k1));
        System.out.println("Nums2 subarraySumMyOwnMethod: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySumMyOwnMethod(nums2, k2));
        System.out.println("Nums3 subarraySumMyOwnMethod: CountNoOfSubArraysWhoseSumIsEqualToK :: " + subarraySumMyOwnMethod(nums3, k3));

    }

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i =0; i < nums.length; i++){

            sum+=nums[i];

            if (map.containsKey(sum-k)){
                count+=map.get(sum-k);

            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        // Using enhanced for loop below
        /*
         * for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);


        }*/

        return count;
    }

    public static int subarraySumMyOwnMethod(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        for (int i =0; i < nums.length; i++){

            sum+=nums[i];

            if (sum == k){
                count++;
            }

            if (map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        // Using enhanced for loop below
        /*
         * for (int num : nums) {

            sum += num;

            if (sum == k){
                count++;
            }

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);


        }*/

        return count;
    }
}
