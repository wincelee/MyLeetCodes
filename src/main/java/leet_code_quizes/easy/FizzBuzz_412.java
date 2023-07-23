package leet_code_quizes.easy;

import classes.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz_412 {


    public static void main(String[] args) {
        int n = 3;
        int n2 = 15;

        System.out.println(Config.ANSI_CYAN + "FizzBuzz::: " + fizzBuzzMyOwnMethod(n2));
        System.out.println(Config.ANSI_YELLOW + "FizzBuzz::: " + fizzBuzzMyOwnMethodTwoWithOneMillisecond(n2));

    }

    public static List<String> fizzBuzzMyOwnMethod(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){

            list.add(String.valueOf(i));

            if (i % 5 == 0 && i % 3 == 0){
                list.add("FizzBuzz");
                list.remove(String.valueOf(i));
            }else {

                if (i % 3 == 0) {
                    list.add("Fizz");
                    list.remove(String.valueOf(i));
                }

                if (i % 5 == 0) {
                    list.add("Buzz");
                    list.remove(String.valueOf(i));
                }

            }

        }

        return list;
    }
    public static List<String> fizzBuzzMyOwnMethodTwoWithOneMillisecond(int n) {

        String[] res = new String[n];

        for (int i = 1; i <= n; i++){

            if (i % 5 == 0 && i % 3 == 0){
                res[i-1] = "FizzBuzz";
            }else {

                if (i % 3 == 0) {
                    res[i-1] = "Fizz";
                }

                if (i % 5 == 0) {
                    res[i-1] = "Buzz";
                }

            }

            if (res[i-1] == null){
                res[i-1] = String.valueOf(i);
            }

        }

        return Arrays.asList(res);

    }
}
