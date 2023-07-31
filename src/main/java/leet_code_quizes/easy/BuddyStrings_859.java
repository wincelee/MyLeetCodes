package leet_code_quizes.easy;

public class BuddyStrings_859 {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "ba";

        System.out.println("BuddyStrings: " + buddyStrings(s1, s2));
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
}
