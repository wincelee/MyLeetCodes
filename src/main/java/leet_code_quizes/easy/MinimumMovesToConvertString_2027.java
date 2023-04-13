package leet_code_quizes.easy;

import classes.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumMovesToConvertString_2027 {

    public static void main(String[] args) {
        String s = "XXX";
        String s2 = "XXOX";
        String s3 = "OOOO";
        String s4 = "OXOOX";
        String s5 = "OXOX";

        System.out.println(Config.ANSI_RED + "NoOfMoves: " + minimumMoves(s4));
    }

    public static int minimumMoves(String s) {

        int count = 0;

        int sLen = s.length();

        char[] chars = new char[sLen];

        for (int i = 0; i < sLen; i++){
            chars[i] = s.charAt(i);
        }

        int tempCount = 0;

        boolean isXAvailable = false;

        int xCount = 0;

        for (int i = 0; i < chars.length; i++){

            if(chars[i] == 'X'){
                chars[i] = 'O';
                isXAvailable = true;
                xCount++;
            }

            tempCount++;

            int n = (chars.length-1) -i;

            if (tempCount == 3){

                tempCount = 0;

                count++;

                if(xCount < 2){
                    count--;
                }

                if (n == 1 || n ==2){

                    count++;

                }
            }

        }

        if (!isXAvailable){
            count = 0;
        }


        System.out.println(Config.ANSI_GREEN + "PrintChars: " + new String(chars));

        return count;

    }
}
