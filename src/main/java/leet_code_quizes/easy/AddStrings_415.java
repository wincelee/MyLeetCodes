package leet_code_quizes.easy;

import java.util.Arrays;

public class AddStrings_415 {

    public static void main(String[] args) {

        String num1 = "11";
        String num2 = "123";

        System.out.println("AddStrings: " + addStrings(num1, num2));

    }

    public static String addStrings(String num1, String num2) {

        return String.valueOf(Double.parseDouble(num1) +
                Double.parseDouble(num2)).replace(".0", "");
    }
}
