package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTheDifferenceOfTwoArrays_2215 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        System.out.println("FindDifference: " + new Gson().toJson(findDifference(nums1, nums2)));


    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>(difference(nums1, nums2)));
        res.add(new ArrayList<>(difference(nums2, nums1)));

        char[] ch = new char[]{'c', 'b', 'j'};

        int[] nums = {23, 20, 40, 56, 70};

        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());



        //return res;
        /*return Arrays.asList(new ArrayList<>(difference(nums1, nums2)),
                new ArrayList<>(difference(nums2, nums1)));*/

        /*return List.of(new ArrayList<>(difference(nums1, nums2)),
                new ArrayList<>(difference(nums2, nums1)));*/

        return Stream.of(new ArrayList<>(difference(nums1, nums2)),
                new ArrayList<>(difference(nums2, nums1))).collect(Collectors.toList());

        /*Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] != nums2[j]){
                    nums1Set.add(nums1[i]);
                }else {
                    nums1Set.remove(nums1[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < nums2.length; i++){
            for (int j = 0; j < nums1.length; j++){

                if (nums2[i] != nums1[j]){
                    nums2Set.add(nums2[i]);
                }else{
                    nums2Set.remove(nums2[i]);
                    break;
                }

            }
        }*/

    }

    public static Set<Integer> difference(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();

        for (int j : nums1) {
            for (int k : nums2) {
                if (j != k) {
                    set.add(j);
                } else {
                    set.remove(j);
                    break;
                }
            }
        }

        return set;
    }
}
