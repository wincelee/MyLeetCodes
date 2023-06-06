package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MostFrequentEvenElement_2404 {

    public static void main(String[] args) {
        int[] nums1 = {0,1,2,2,4,4,1};
        int[] nums2 = {29,47,21,41,13,37,25,7};

        System.out.println("MostFrequentMyOwnMethodNums1: " + mostFrequentEvenMyOwnMethod(nums1));
        System.out.println("MostFrequentMyOwnMethodNums2: " + mostFrequentEvenMyOwnMethod(nums2));
    }

    public static int mostFrequentEvenMyOwnMethod(int[] nums) {

        Map<Integer, Integer> mMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                mMap.put(nums[i], mMap.getOrDefault(nums[i], 0) +1);
            }
        }

        if (mMap.isEmpty()){
            return -1;
        }

        // int maxRep = 0;

        PriorityQueue<Integer> mPriorityQueue = new PriorityQueue<>();

        AtomicInteger maxRep = new AtomicInteger(0);

        mMap.forEach((k,v)->{
            if (v >= maxRep.get()){
                maxRep.set(v);
                mPriorityQueue.offer(k);
            }
        });

        while (!mPriorityQueue.isEmpty()){
            System.out.println(Config.ANSI_BLUE + "CurrentElement: " + mPriorityQueue.poll());
        }

        //return mPriorityQueue.peek();

        return 1;
    }
}
