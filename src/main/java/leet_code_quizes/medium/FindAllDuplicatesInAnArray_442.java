package leet_code_quizes.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {

    public static void main(String[] args) {

        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1,2};

        System.out.println("DuplicatesInNums1: " + findDuplicatesMyOwnMethodUsingHashMap(nums1));
        System.out.println("DuplicatesInNums2: " + findDuplicatesMyOwnMethodUsingHashMap(nums2));

    }

    public static List<Integer> findDuplicatesMyOwnMethodUsingHashMap(int[] nums) {

        List<Integer> resList = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i =0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                resList.add(nums[i]);
            }

            map.put(nums[i], i);
        }

        return resList;

    }
}
