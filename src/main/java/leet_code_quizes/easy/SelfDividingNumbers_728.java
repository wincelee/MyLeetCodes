package leet_code_quizes.easy;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_728 {

    public static void main(String[] args) {

        int left1 = 1;
        int right1 = 22;

        int left2 = 47;
        int right2 = 85;

        System.out.println("SelfDividingNumbersLeft1Right1: " + new GsonBuilder()
                .setPrettyPrinting().create().toJson(selfDividingNumbersMyOwnMethod(left1, right1)));
        System.out.println("SelfDividingNumbersLeft1Right1: " + new GsonBuilder()
                .setPrettyPrinting().create().toJson(selfDividingNumbersMyOwnMethod(left2, right2)));


        System.out.println("SelfDividingNumbersLeft1Right1OfficialSolution: " + new GsonBuilder()
                .setPrettyPrinting().create().toJson(selfDividingNumbersOfficialSolution(left2, right2)));

    }

    public static List<Integer> selfDividingNumbersMyOwnMethod(int left, int right) {

        List<Integer> res = new ArrayList<>();

        for (int i = left; i < right + 1; i++){

            String s = String.valueOf(i);

            int n = s.length();

            if(isSelfDividing(s, n, i)){
                res.add(i);
            }

        }

        return res;

    }

    public static boolean isSelfDividing(String s, int n, int i){
        for (int j = 0; j < n; j++){

            int k = s.charAt(j) - '0';

            // Another way of converting above to Integer
            // int k1 = Integer.parseInt(String.valueOf(Character.valueOf(s.charAt(j))));

            if (k == 0 || i % k > 1 || i % k == 1){
                return false;
            }

        }

        return true;
    }

    public static List<Integer> selfDividingNumbersOfficialSolution(int left, int right) {

        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            String s = String.valueOf(i);

            if (isSelfDividingOfficialSolution(s, i, s.length())) {
                res.add(i);
            }

        }

        return res;

    }

    public static boolean isSelfDividingOfficialSolution(String s, int i, int n) {

        for (Character c : s.toCharArray()) {
            int k = c - '0';
            if (k == 0 || i % k == 1 || i % k > 1) {
                return false;
            }
        }

        return true;

    }


}
