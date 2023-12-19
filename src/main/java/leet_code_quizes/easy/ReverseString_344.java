package leet_code_quizes.easy;

import classes.Config;

import java.util.Arrays;

public class ReverseString_344 {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        // Sol 1: Array.reverse
        // Sol 2: Two pointer approach
        // sol 3: Two pointer in place approach

        // Attempt sol 2
        int lp = 0, rp = s.length - 1;

        while (lp < rp){
            char tmp = s[lp];

            s[lp++] = s[rp];
            s[rp--] = tmp;

        }

        System.out.println(s);
    }
}
