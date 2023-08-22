package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfUniqueElements_1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int[] nums1 = {1,1,1,1,1};

        //System.out.println("SumOfUniqueElements: " + sumOfUnique(nums));
        System.out.println("SumOfUniqueElements: " + sumOfUniqueUsingTwoLoops(nums));

    }

    public static int sumOfUnique(int[] nums) {
        Set<Integer> mSet = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums){
            /*if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }*/
            mSet.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (mSet.size() == 0){
            return 0;
        }

        AtomicInteger sum = new AtomicInteger(0);

        map.forEach((k,v) ->{
            if (v == 1){
                  sum.addAndGet(k);
                 // sum.set(sum.get() + k);
                System.out.println(Config.ANSI_YELLOW + "IfElseCalled:: " + k);
            }
        });


        return sum.get();
    }

    public static int sumOfUniqueUsingTwoLoops(int[] nums) {
        int sum = 0, count = 0;

        for (int i = 0; i < nums.length; i++){
            count = 1;

            for (int j = 0; j < nums.length; j++){

                System.out.println(Config.ANSI_BLUE + "CurrentNumsOfIOutsideIf: " + nums[i]);
                System.out.println(Config.ANSI_GREEN + "CurrentNumsOfJOutsideIf: " + nums[j]);

                if (nums[i] == nums[j] && i != j){

                    System.out.println(Config.ANSI_RED + "CurrentNumsOfI: " + nums[i]);
                    System.out.println(Config.ANSI_YELLOW + "CurrentNumsOfJ: " + nums[j]);

                    count++;
                    break;
                }
            }

            if (count == 1){
                sum += nums[i];
            }
        }

        return sum;
    }
}
