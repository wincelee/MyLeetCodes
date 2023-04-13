package coding_game;

import java.util.Arrays;

public class ClosestToZero {

    public static void main(String[] args) {
        int[] nums = {7, -10, 13, 8, 4, -7, -12, -3, 3, -9, 6, -1, -6, 7};

        System.out.println("ComputeClosestZero: " + computeClosestZero(nums));

    }

    public static int computeClosestZero(int[] ts){

        if(ts.length == 0){
            return 0;
        }

        int min = ts[0];

        for (int i = 0; i < ts.length; i++){

            if (Math.abs(ts[i]) < min){
                min = Math.abs(ts[i]);
            }
        }

        return min;
    }

}
