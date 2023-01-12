package leet_code_quizes.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};

        System.out.println("MajorityElement: " + majorityElement(nums2));

    }

    public static int majorityElement(int[] nums) {

        int n = nums.length;

        if (n == 1){
            return 1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {

                map.put(num, (map.get(num) + 1));

                if (map.get(num) > n / 2) {
                    return num;
                }

            } else {

                map.put(num, 1);
            }

        }

        return 0;

    }
}
