package leet_code_quizes.easy;

import classes.Config;

import java.util.Arrays;

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        int x = 121;

        x = x/10;

        System.out.println("x/10: " + x);

//        System.out.println("IsPalindrome: " + isPalindromeMyOwnMethod(x));
//        System.out.println(Config.ANSI_BLUE + "IsPalindromeOnlineMethod: " + isPalindromeRandomOnlineSolution(x));
        System.out.println(Config.ANSI_GREEN + "IsPalindromeCrazyImplementation: " +
                isPalindromeCrazyImplementation(x));


    }

    public static boolean isPalindromeMyOwnMethod(int x) {

        String s = String.valueOf(x);

        int sLength = s.length();

        int[] nums = new int[sLength];

        for (int i = 0; i < sLength; i++){
            nums[i] = s.charAt(i) - '0';
        }

        int lp = 0, rp = sLength - 1;

        while (lp < rp){

            if (nums[lp] != nums[rp]){
                return false;
            }
            lp++;
            rp--;
        }

        return true;
    }

    public static boolean isPalindromeRandomOnlineSolution(int x){
        String s = String.valueOf(x);

        int lp = 0, rp = s.length() -1;

        while (lp < rp){

            if (s.charAt(lp) != s.charAt(rp)){
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }

    public static boolean isPalindromeCrazyImplementation(int x){
        int original = x;
        int rev = 0;
        while(x>0){
            System.out.println(Config.ANSI_RED + "x%10: " + (x%10));
            System.out.println(Config.ANSI_YELLOW + "rv*10: " + (rev*10));
            rev = x%10 + rev*10;
            System.out.println("Rev: " + rev);
            x= x/10;
            System.out.println("x/10: " + x/10);
            System.out.println("\n");
        }
        return rev==original ? true : false;
    }
}
