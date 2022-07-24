package leet_code_quizes.easy;

import java.util.Arrays;

public class PlusOne_66 {

    public static void main(String[] args) {

        int[] digits = {1, 2, 3};
        int[] digits2 = {9, 9, 9};
        int[] digits3 = {0};

        System.out.println("IncrementingDigits: " + Arrays.toString(plusOne(digits)));
        System.out.println("IncrementingDigits2: " + Arrays.toString(plusOne(digits2)));
        System.out.println("IncrementingDigits3UsingPlusOneWithWhileLoop: " +
                Arrays.toString(plusOneUsingWhileLoop(digits3)));

    }

    public static int[] plusOne(int[] digits) {

        int digitsLength = digits.length;

        for (int i = digitsLength - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] += 1;
                // or
                // digits[i]++;
                return digits;
            }

            digits[i] = 0;

        }

        int[] temp = new int[digitsLength + 1];

        temp[0] = 1;

        return temp;

    }

    public static int[] plusOneUsingWhileLoop(int[] digits) {

        System.out.print("DigitsBeforeWhileLoop: " + Arrays.toString(digits));


        int digitsLength = digits.length;

        int lp = 0;
        int rp = digitsLength - 1;

        System.out.println("LeftPointer: " + lp);
        System.out.println("RightPointer: " + rp);

        while (lp < rp) {

            if (digits[rp] < 9) {

                digits[rp] += 1;

                return digits;

            }

            digits[rp] = 0;
            rp--;

        }


        int[] temp = new int[digitsLength + 1];

        temp[0] = 1;

        return temp;

    }
}
