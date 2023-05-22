package leet_code_quizes.medium;

import classes.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TopKFrequentElements_347 {

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;

        int[] nums2 = {4,1,-1,2,-1,2,3};
        int k2 = 2;

        System.out.println("TopKFrequentElementNums1K1: " + Arrays
                .toString(topKFrequentMyWorkings(nums1, k1)));

        System.out.println(Config.ANSI_GREEN + "TopKFrequentElementNums2K2: " + Arrays
                .toString(topKFrequentMyWorkings(nums2, k2)));

    }

    public static int[] topKFrequentMyWorkings(int[] nums, int k) {

        if(nums.length == k){
            return nums;
        }

        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Map<Integer, Integer> sortedMap = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        List<Integer> tempList = new ArrayList<>();

        AtomicInteger counter = new AtomicInteger(0);

        sortedMap.forEach((key, value) -> {

            if (value >= counter.get()) {

                counter.set(value);
                tempList.add(key);
            }

        });

        Collections.reverse(tempList);

        int[] res = new int[Math.min(k, tempList.size())];

        for (int i = 0; i < res.length; i++){
            res[i] = tempList.get(i);
        }

        return res;
    }
}
