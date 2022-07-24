package leet_code_quizes.hard;

import com.google.gson.GsonBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Candy_135 {

    public static void main(String[] args) {

        int[] ratings1 = {1,0,2};

        candy(ratings1);

    }

    public static int candy(int[] ratings) {

        int candies = 0;

        int rLength = ratings.length;

        int[] leftArr = new int[rLength];
        int[] rightArr = new int[rLength];

        Arrays.fill(leftArr, 1);
        Arrays.fill(rightArr, 1);

        for (int i = 1; i < rLength; i++){

            if(ratings[i] > ratings[i-1]){
                 //leftArr[i] = leftArr[i] + (ratings[i-1] +1);
                leftArr[i] = leftArr[i-1] +1;
            }
        }

        for (int i = rLength-2; i >=0; i--){

            if (ratings[i] > ratings[i+1]){
                rightArr[i] = rightArr[i+1]+1;
            }
        }

        for (int i = 0; i < rLength; i++){
            candies = candies + Math.max(leftArr[i], rightArr[i]);
        }

        System.out.println("LeftArr: " + new GsonBuilder().setPrettyPrinting()
                .create().toJson(leftArr));

        System.out.println("RightArr: " + new GsonBuilder().setPrettyPrinting()
                .create().toJson(rightArr));

        System.out.println("Candies: " + candies);

        return candies;

    }

}
