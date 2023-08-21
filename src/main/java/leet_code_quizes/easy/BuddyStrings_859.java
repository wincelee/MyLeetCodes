package leet_code_quizes.easy;

public class BuddyStrings_859 {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "ba";
        String s11 = "abcde", s22 = "abdce";

        // System.out.println("BuddyStrings: " + buddyStrings(s1, s2));
        System.out.println("BuddyStrings: " + buddyStringsTwo(s1, s2));
    }

    public static boolean buddyStrings(String s, String goal) {

        char[] chArr = s.toCharArray();

        int lp = 0, rp = chArr.length -1;

        while (lp < rp){
            char temp = chArr[lp];
            chArr[lp++] = chArr[rp];
            chArr[rp--] = temp;
        }

        return new String(chArr).equals(goal);
    }
    public static boolean buddyStringsTwo(String s, String goal) {

        char[] chArr = s.toCharArray();

        for (int i = 0; i < s.length()-1; i++){
            //performLeftToRight();
        }

        return new String(chArr).equals(goal);
    }

    public static char[] performLeftToRight(char[] chArr, int i, int j){



        /*for (int i = 0; i < chArr.length -1; i++){
            char temp = chArr[i];
            chArr[i] = chArr[i+1];
        }*/

        return chArr;
    }
}
