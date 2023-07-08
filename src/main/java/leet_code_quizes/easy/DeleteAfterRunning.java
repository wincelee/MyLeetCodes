package leet_code_quizes.easy;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteAfterRunning {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("FindDisappearedNumbers: " + new Gson()
                .toJson(findDisappearedNumbers(nums)));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            res.add(nums[i]);
        }

        return new ArrayList<>(res);
    }
}
