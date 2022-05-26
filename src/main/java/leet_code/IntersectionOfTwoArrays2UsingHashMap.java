package leet_code;

import com.google.gson.Gson;

import java.util.*;

public class IntersectionOfTwoArrays2UsingHashMap {

    public static void main (String[] args) {

         int[] nums1 = {1,2,2,1};

         int[] nums2 = {2,2};

        System.out.println("ResultArray" + Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect (int[] nums1, int[] nums2){

        HashMap<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int num: nums1){

            Integer count = map.get(num);

            // count null
            // 1: 1
            // count null
            // 2: 1
            // 2: 3
            // 1: 2
            map.put(num, count == null ? 1 : count + 1);
        }

        for (int num: nums2){
            Integer count = map.get(num);

            if (count != null && count > 0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        int i = 0;

        int[] ans = new int[list.size()];

        for (int j: list){
            ans[i++] = j;
        }

        return  ans;


    }
}
