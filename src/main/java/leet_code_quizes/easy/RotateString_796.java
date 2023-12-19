package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateString_796 {

    public static void main(String[] args) {

        String s = "abcde";
//        String goal = "cdeab";
        String goal = "dceab";

        // System.out.println("StringIsEqual: " + rotateStringMyOwnMethod(s, goal, 2));

        System.out.println(rotateStringManuMethod(s, goal));
    }

    public static boolean rotateStringManuMethod(String s, String goal){
        char[] sArr = s.toCharArray();
        List<Character> charList = new ArrayList<>();

        for (char ch: sArr){
           charList.add(ch);
        }

        char[] gArr = goal.toCharArray();
        List<Character>  goalList = new ArrayList<>();

        for (char ch: gArr){
            goalList.add(ch);
        }

        for (char ch: goalList){
            if (!charList.contains(ch)){
                return false;
            }
        }

        return true;
    }

    public static String doRotation(String s){

        System.out.println(Config.ANSI_PURPLE + "CurrentString: "  + s);

        char[] sArr = s.toCharArray();

        System.out.println(Config.ANSI_BLUE + "CurrentSArr: " + new String(sArr));

        int lp = 0, rp = sArr.length - 1;

        while (lp < rp){
            char tmp = sArr[lp];
            sArr[lp++] = sArr[rp];
            sArr[rp--] = tmp;
        }

        return new String(sArr);

    }

    public static boolean isValidRotation(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }



        return false;
    }

    public static boolean rotateStringMyOwnMethod(String s, String goal, int rotations) {
        int rotate = rotations % s.length();
        char[] res = new char[s.length()];

        int insertAt = 0;
        while (insertAt < s.length()) {
            if (rotate == s.length()) {
                rotate = 0;
            }
            res[insertAt] = s.charAt(rotate);
            rotate++;
            insertAt++;
        }

        System.out.println(Arrays.toString(res));

        return new String(res).equals(goal);
    }
}
