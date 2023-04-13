package leet_code_quizes.easy;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeCandies_575 {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 3};
        int[] nums3 = {6, 6, 6, 6};

         System.out.println("DistributeCandiesNums1: " + distributeCandiesTimeLimitExceeds(nums1));
        System.out.println("DistributeCandiesNums2: " + distributeCandiesTimeLimitExceeds(nums2));
        System.out.println("DistributeCandiesNums3: " + distributeCandiesTimeLimitExceeds(nums3));

    }

    public static int distributeCandiesTimeLimitExceeds(int[] candyType) {

        List<Integer> list = new ArrayList<>();

        for (int num : candyType) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        return list.stream().limit(candyType.length / 2).toList().size();

    }
}
