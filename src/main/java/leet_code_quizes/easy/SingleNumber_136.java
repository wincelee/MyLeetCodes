package leet_code_quizes.easy;

import java.util.*;

public class SingleNumber_136 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};

        int a=10;

        int myValue = 10;
        int myValue2 = 5;


        System.out.println("MyValue: " + myValue++ + ++myValue);


        System.out.println("SingleNumber: " + singleNumberMySolution(nums));

    }

    public static int singleNumberMySolution(int[] nums) {

        Integer res = 0;

        Map<Integer, Boolean> map = new HashMap<>();

        for(Integer num: nums){

            if(map.containsKey(num)){
                map.put(num, true);
            }else{
                map.put(num, false);
            }

        }

        for (Map.Entry<Integer, Boolean> entry : map.entrySet())
        {
           if (Boolean.FALSE.equals(entry.getValue())){
               res = entry.getKey();
           }

        }


        return res;

    }
}
