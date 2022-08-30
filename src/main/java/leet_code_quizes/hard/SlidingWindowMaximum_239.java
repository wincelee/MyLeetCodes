package leet_code_quizes.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum_239 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;

        int[] nums2 = {1, -1};
        int k2 = 1;

        /*System.out.println("MaxSlidingWindowsNumsK1" +
                Arrays.toString(maxSlidingWindow(nums1, k1)));*/

        /*System.out.println("MaxSlidingWindows2NumsK1" +
                Arrays.toString(maxSlidingWindow2(nums1, k1)));*/

        System.out.println("MaxSlidingWindows2Nums2K2" +
                Arrays.toString(maxSlidingWindowBruteForce(nums2, k2)));

        System.out.println("IntegerMinValue: " + Integer.MIN_VALUE);

    }

    public static int[] maxSlidingWindowBruteForce(int[]nums, int k){


        return new int[]{};
    }

    public static int[] maxSlidingWindowNotWorking2(int[] nums, int k) {

        List<Integer> resList = new ArrayList<>();

        int firstIndex = 0;

        int max = 0;

        for(int i =0; i < nums.length-k+1; i++){

            int tempMax = nums[i];

            System.out.println("TempMax: " + tempMax);

            for(int j = firstIndex; j <= i + k -1; j++){

                System.out.println("Called: " + true);

                if(nums[j] > tempMax){

                    tempMax = nums[j];

                }

            }


            firstIndex++;

            //max = Math.max(max, tempMax);

            resList.add(max);

        }

       int[] res = new int[resList.size()] ;

       for (int i = 0; i < resList.size(); i++){
           res[i] = resList.get(i);
       }

       return  res;

    }

    public static int[] maxSlidingWindowNotWorking(int[] nums, int k) {
        List<Integer> temp= new ArrayList<>();

        int lp = 0, rp = nums.length-1;

        while (lp < rp){
            int max = nums[lp];

            while (lp < k-1){

                System.out.println("Max: " + max);

                if(nums[lp] > max){
                    max = nums[lp];
                    temp.add(nums[lp]);
                    System.out.println("nums[lp] > max Reached: " + true + " :"+ nums[lp]);
                }else{
                    temp.add(max);
                    System.out.println("nums[lp] < max Reached: " + true + " :" + nums[lp]);
                }


                lp++;

                System.out.println("LeftPointer: " + lp);
            }
        }

        int[] res = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }

}


