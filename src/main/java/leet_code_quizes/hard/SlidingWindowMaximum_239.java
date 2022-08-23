package leet_code_quizes.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum_239 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;

        /*System.out.println("MaxSlidingWindowsNumsK1" +
                Arrays.toString(maxSlidingWindow(nums1, k1)));*/

        System.out.println("MaxSlidingWindows2NumsK1" +
                Arrays.toString(maxSlidingWindow2(nums1, k1)));

    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {

        List<Integer> resList = new ArrayList<>();

        int firstIndex = 0;

        for(int i =0; i < nums.length-k+1; i++){


            for(int j = firstIndex+1; j <= i + k -1; j++){

                /*if(nums[j] > tempMax){
                    max= nums[j];
                    resList.add(nums[j]);
                }*/

                if(nums[j] > tempMax){

                    resList.add(nums[j]);
                }

                System.out.println("ResList: " + resList);

            }

            System.out.println("LoopExited: " + true);
            firstIndex++;

        }

       int[] res = new int[resList.size()] ;

       for (int i = 0; i < resList.size(); i++){
           res[i] = resList.get(i);
       }

       return  res;

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
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


