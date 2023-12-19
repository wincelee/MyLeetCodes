package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class MissingNumber_268 {

    public static void main(String[] args) {

        int[] nums = {3,0,1};


        System.out.println("MissingNumber: " + missingNumber(nums));
        System.out.println("MissingNumberZeroMilliSez: " + missingNumberZeroMilliSec(nums));
    }

    public static int missingNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length+1; i++){
            set.add(i);
        }

        for (int num : nums) {
            set.remove(num);
        }

        return set.stream().findFirst().get();
    }

    public static int missingNumberZeroMilliSec(int[] nums) {
        int expectedL = nums.length;
        // formula = n*(n+1) / 2;
        int expectedSum = (expectedL * (expectedL + 1)) / 2;

        int sum = 0;
        int counter = 0;
        while(counter<nums.length) {
            sum+=nums[counter];
            counter++;
        }

        return expectedSum - sum;
    }
}
