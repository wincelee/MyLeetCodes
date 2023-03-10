package code_signal;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;

public class FirstDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 3, 5, 3, 2};

        System.out.println("FirstDuplicate: " + firstDuplicate(nums));

    }

    public static int firstDuplicate(int[] nums) {
        int minIndex = 0;
        int element = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            if (map.containsKey(nums[i])){

                minIndex = i;

                if (i < minIndex){
                    minIndex = i;
                    element = nums[i];
                }


            }else {

                map.put(nums[i], i);
            }

        }

        System.out.println("MyMap: " + new Gson().toJson(map));

        return element;
    }
}
