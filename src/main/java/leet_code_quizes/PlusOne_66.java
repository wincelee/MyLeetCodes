package leet_code_quizes;

import java.util.Arrays;

public class PlusOne_66 {

    public static void main(String[] args) {

        //System.out.println("ArrayPlusOne" + Arrays.toString(plusOne(new int[]{1,2,3})));

        int[][] arr = {{1,2,3},
                {4,5,6}};

        int[] finalArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){

        }

        System.out.println("Print 2D Array" + Arrays.deepToString(arr));

    }

    public static int[] plusOne(int[] digits) {

        int temp = digits[digits.length-1]+1;

        digits[digits.length-1] = digits[temp];

        return digits;

    }
}
