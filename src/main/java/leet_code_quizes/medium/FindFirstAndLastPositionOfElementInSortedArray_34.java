package leet_code_quizes.medium;

import com.google.gson.Gson;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

    public static void main(String[] args) {

        int[] nums1 = {5,7,7,8,8,10};

        System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays.toString(searchRange(nums1, 8)));
        // System.out.println("Nums1FirstAndLastPositionOfTarget2: " + Arrays.toString(searchRange2(nums1, 8)));

    }

    public static int[] searchRange(int[] nums, int target) {

        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){


            if(nums[i]==target){
                positions.add(i);
            }
        }

        if (positions.isEmpty()){
            return new int[]{-1, -1};
        }


        if(positions.size() == 1){

            int[] res = new int[2];

            for(int i = 0; i < positions.size(); i++) {

                if(positions.size() == 1){
                    Arrays.fill(res, positions.get(i));
                }

                res[i] = positions.get(i);

            }

            return res;

        }

        int[] res = new int[positions.size()];

        for(int i = 0; i < positions.size(); i++) {


            res[i] = positions.get(i);

        }

        return res;
    }

    public static int[] searchRange2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target)){
                res.add(map.get(nums[i]));
            }

            map.put(nums[i], i);
        }

        System.out.println("ResList" + new Gson().toJson(res));

        if(res.isEmpty()){
            return new int[]{-1, -1};
        }

        int[] temp = new int[res.size()];

        for(int i = 0; i < res.size(); i++) {

            temp[i] = res.get(i);

        }

        return temp;

    }
}
