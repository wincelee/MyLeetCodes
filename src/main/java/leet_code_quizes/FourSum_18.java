package leet_code_quizes;

import com.google.gson.Gson;

import java.util.*;

public class FourSum_18 {

    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        //int[] arr = {2,2,2,2,2};

        System.out.println("FourSumUsingHashSet: " + new Gson().toJson(fourSumUsingHashSet(arr, 0)));
        System.out.println("FourSumUsingListsOnly: " + new Gson().toJson(fourSumUsingListsOnly(arr, 0)));

    }

    public static List<List<Integer>> fourSumUsingHashSet(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> resSet = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n -3; i++){
            for (int j = i + 1; j < n -2; j++){
                int lp = j + 1;
                int rp = n - 1;
                while(lp < rp){
                    int sum = nums[i] + nums[j] + nums[lp] + nums[rp];

                    if (sum < target){
                        lp++;
                    }else if (sum > target){
                        rp--;
                    }else{
                        List<Integer> resList = new ArrayList<>();
                        resList.add(nums[i]);
                        resList.add(nums[j]);
                        resList.add(nums[lp]);
                        resList.add(nums[rp]);

                        resSet.add(resList);

                        lp++;
                        rp--;
                    }
                }
            }
        }

        return new ArrayList<>(resSet);
    }

    public static List<List<Integer>> fourSumUsingListsOnly(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> resList = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n -3; i++){
            for (int j = i + 1; j < n -2; j++){
                int lp = j + 1;
                int rp = n - 1;
                while(lp < rp){
                    int sum = nums[i] + nums[j] + nums[lp] + nums[rp];
                    if (sum < target){
                        lp++;
                    }else if (sum > target){
                        rp--;
                    }else{
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[lp]);
                        tempList.add(nums[rp]);

                        if (!resList.contains(tempList)){
                            resList.add(tempList);
                        }

                        lp++;
                        rp--;
                    }
                }
            }
        }

        return resList;

    }
}
