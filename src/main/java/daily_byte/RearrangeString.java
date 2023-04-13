package daily_byte;

import classes.Config;

import java.util.Arrays;

public class RearrangeString {

    /* Given a string s and an integer array, indices, you must rearrange s according
    to the given indices. Once you have rearranged s successfully, the ith character in
    s should now be located at the indices[i] index.

            Note: s and indices will always be the same length.

            Ex: Given the following s and indices…

    s = "abc", indices = [2, 1, 0], return "cba" ('a' moves to the 2nd index, b stays at the
    first index, and c moves to the zeroth index).*/

    public static void main(String[] args) {

        String s = "abc";

        int sLength = s.length();

        int[] nums = {2, 1, 0};

        char[] sChar = new char[s.length()];

        for (int i = 0; i < nums.length; i++){

            for (int j = 0; j < sLength; j++){

                if (nums[i] == j){

                    sChar[i] = s.charAt(j);

                }
            }

        }

        System.out.println(Config.ANSI_YELLOW + "FinalString: " + Arrays.toString(sChar));

    }


}
