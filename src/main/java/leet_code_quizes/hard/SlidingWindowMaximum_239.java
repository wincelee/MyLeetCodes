package leet_code_quizes.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum_239 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;

        System.out.println("MaxSlidingWindowsNumsK1" +
                Arrays.toString(maxSlidingWindow(nums1, k1)));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> temp= new ArrayList<>();

        int lp = 0, rp = nums.length-1;

        while (lp < rp){
            int max = nums[lp];

            while (lp < k-1){
                if(nums[lp] > max){
                    max = nums[lp];
                    temp.add(nums[lp]);
                }else{
                    temp.add(max);
                }

                lp++;
            }
        }

        int[] res = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }

}


