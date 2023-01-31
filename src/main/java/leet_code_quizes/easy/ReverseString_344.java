package leet_code_quizes.easy;

import java.util.Arrays;

public class ReverseString_344 {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        int lp = 0, rp =s.length -1;

        while (lp < rp){
            char temp = s[lp];
            s[lp++] = s[rp];
            s[rp--] = temp;
        }

        System.out.println("ReversedS: " + Arrays.toString(s));
    }
}
