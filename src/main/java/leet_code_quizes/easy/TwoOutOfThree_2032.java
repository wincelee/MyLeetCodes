package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.*;

public class TwoOutOfThree_2032 {

    public static void main(String[] args) {
        // int[] nums1 = {1,1,3,2}, nums2 = {2,3}, nums3 = {3};
         int[] nums1 = {3,1}, nums2 = {2,3}, nums3 = {1,2};

        System.out.println("List: " + new Gson().toJson(twoOutOfThreeUsingSet(nums1, nums2, nums3)));

    }

    public static List<Integer> twoOutOfThreeUsingSet(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> res = new HashSet<>();

        for (int i: nums1){

            for (int j: nums2){
                if (i == j){
                    res.add(j);
                }

                for (int k: nums3){
                    if (i == k){
                        res.add(k);
                    }

                    if (j == k){
                        res.add(k);
                    }
                }
            }
        }

        return new ArrayList<>(res);

    }

}
