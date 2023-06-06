package leet_code_quizes.easy;

import classes.Config;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class NRepeatedElementInSize2NArray_961 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};

        System.out.println(Config.ANSI_BLUE + "RepeatedNTimes: " + repeatedNTimesMyOwnMethod(nums));
        System.out.println(Config.ANSI_YELLOW + "RepeatedNTimesUsingHashSet: " +
                repeatedNTimesUsingHashSet(nums));

        System.out.println(Config.ANSI_GREEN + "RepeatedNTimesUsingSort: " +
                repeatedNTimesUsingSort(nums));
    }

    public static int repeatedNTimesMyOwnMethod(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        /*for (int num: nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }*/

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        AtomicInteger maxK = new AtomicInteger(0);
        AtomicInteger maxV = new AtomicInteger(0);


        map.forEach((k, v) -> {

            if (v > maxV.get()) {
                maxV.set(v);
                maxK.set(k);
            }

        });

        return maxK.get();
    }

    public static int repeatedNTimesUsingHashSet(int[] nums) {

        /**
         * nums.length = 2 * n and exactly one element of nums is
         * repeated n times. It means no one element except we're searching
         * cannot appear more than 1 time. If any element of nums appears
         * two or more times then it is the element that is repeated n times.
         */

        Set<Integer> mSet = new HashSet<>();

        for (int num: nums){
            if (!mSet.add(num)){
                return num;
            }
        }

        return 0;
    }

    public static int repeatedNTimesUsingSort(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length -1; i++){
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }

        return 0;
    }
}
