package leet_code_quizes;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestWellPerformingInterval_1124 {

    public static void main(String[] args) {

        int[] hours = {9,9,6,0,6,6,9};

        longestWPI(hours);
    }

    public static int longestWPI(int[] hours) {

        int longestInterval = 0;
        List<Integer> tiringDays = new ArrayList<>();
        List<Integer> nonTiringDays = new ArrayList<>();

        for (int i =0; i < hours.length; i++){

            if(hours[i] > 8){
                tiringDays.add(hours[i]);
            }else{
                nonTiringDays.add(hours[i]);
            }

        }

        System.out.println("TiringDays" + new Gson().toJson(tiringDays));
        System.out.println("NonTiringDays" + new Gson().toJson(nonTiringDays));

        return longestInterval;

    }
}
