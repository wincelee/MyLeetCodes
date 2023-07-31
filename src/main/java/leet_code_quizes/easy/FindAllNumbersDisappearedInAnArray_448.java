package leet_code_quizes.easy;

import com.google.gson.Gson;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray_448 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1};

        System.out.println("FindDisappearedNumbersNums1: " + new Gson().toJson(findDisappearedNumbers(nums)));
        System.out.println("FindDisappearedNumbersNums2: " + new Gson().toJson(findDisappearedNumbers(nums2)));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < nums.length+1; i++){
            set.add(i);
        }

        for (int num: nums){

//            if (set.contains(num)){
//                set.remove(num);
//            }
            // below code simplifies above code
            set.remove(num);
        }

        return new ArrayList<>(set);
    }
}
