package leet_code_quizes.medium;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {

    public static void main(String[] args) {

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1, 2};

        System.out.println("DuplicatesInNums1: " + findDuplicatesMyOwnMethodUsingHashMap(nums1));
        System.out.println("DuplicatesInNums2: " + findDuplicatesMyOwnMethodUsingHashMap(nums2));
        System.out.println("DuplicatesInNums1UsingArraySortAndForLoop: " +
                findDuplicatesMyOwnMethodUsingArraysSortAndForLoop(nums1));
        System.out.println("DuplicatesInNums2UsingArraySortAndForLoop: " +
                findDuplicatesMyOwnMethodUsingArraysSortAndForLoop(nums2));

        System.out.println("DuplicatesInNums1UsingIndexing: " +
                findDuplicatesUsingIndexing(nums1));

        System.out.println("DuplicatesInNums2UsingIndexing: " +
                findDuplicatesUsingIndexing(nums2));

    }

    public static List<Integer> findDuplicatesMyOwnMethodUsingHashMap(int[] nums) {

        List<Integer> resList = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                resList.add(nums[i]);
            }

            map.put(nums[i], i);
        }

        return resList;

    }

    public static List<Integer> findDuplicatesMyOwnMethodUsingArraysSortAndForLoop(int[] nums) {

        Arrays.sort(nums);

        List<Integer> resList = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                resList.add(nums[i]);
            }

        }

        return resList;

    }

    public static List<Integer> findDuplicatesUsingIndexing(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            System.out.println("IndexAbsoluteValue: " + index + "      Index: " + i);

            if (nums[index] < 0) {
                res.add(index + 1);

                System.out.println("NumsIndexLessThanZero" + nums[index]);
                System.out.println("ResList: " + new Gson().toJson(res));
            }

            System.out.println("Nums[Index]BeforeMinus: " + nums[index]);

            nums[index] = -nums[index];

            System.out.println("Nums[Index]AfterMinus: " + nums[index]);

        }

        return res;
    }
}
