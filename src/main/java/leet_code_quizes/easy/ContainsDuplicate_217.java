package leet_code_quizes.easy;

import java.util.*;

public class ContainsDuplicate_217 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println("Nums1: ContainsDuplicatesMyOwnMethod :: " + containsDuplicateMyOwnMethod(nums1));
        System.out.println("Nums2: ContainsDuplicatesMyOwnMethod :: " + containsDuplicateMyOwnMethod(nums2));
        System.out.println("Nums3: ContainsDuplicatesMyOwnMethod :: " + containsDuplicateMyOwnMethod(nums3));

        System.out.println("\n");

        System.out.println("Nums1: ContainsDuplicatesUsingArraySort :: " + containsDuplicateUsingArraysSort(nums1));
        System.out.println("Nums2: ContainsDuplicatesUsingArraySort :: " + containsDuplicateUsingArraysSort(nums2));
        System.out.println("Nums3: ContainsDuplicatesUsingArraySort :: " + containsDuplicateUsingArraysSort(nums3));

        System.out.println("\n");

        System.out.println("Nums1: ContainsDuplicatesUsingHashSet :: " + containsDuplicateUsingHashSet(nums1));
        System.out.println("Nums2: ContainsDuplicatesUsingHashSet :: " + containsDuplicateUsingHashSet(nums2));
        System.out.println("Nums3: ContainsDuplicatesUsingHashSet :: " + containsDuplicateUsingHashSet(nums3));

    }

    public static boolean containsDuplicateMyOwnMethod(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static boolean containsDuplicateUsingArraysSort(int[] nums) {

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;

        // Array sort method 2 below
        /*
        *Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;*/
    }

    public static boolean containsDuplicateUsingHashSet(int[] nums) {

        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if(mySet.contains(nums[i])){
                return true;
            }

            mySet.add(nums[i]);
        }

        // Below using enhanced for each loop
        /*
        *for(int num: nums){
            if (mySet.contains(num)){
                return true;
            }

            mySet.add(num);
        }*/

        return false;
    }
}
