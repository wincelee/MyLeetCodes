package leet_code_quizes.medium;

import classes.Config;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_46 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);

        System.out.println(Config.ANSI_BLUE + "MyList: " + new Gson().toJson(list));
    }

    public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){

        System.out.println(Config.ANSI_YELLOW + "TempList: " + new Gson().toJson(tempList));
        System.out.println(Config.ANSI_CYAN + "TempListSize: " + tempList.size());

        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));

            System.out.println(Config.ANSI_PURPLE + "TempListSizeIsEqualToNumsLength: " + "True");

        } else{
            for (int num : nums) {

                System.out.println(Config.ANSI_RED + "num: " + num);

                if (tempList.contains(num)) {

                    System.out.println(Config.ANSI_GREEN + "TempListContainsNum: " + "True");
                    continue; // element already exists, skip
                }
                tempList.add(num);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
