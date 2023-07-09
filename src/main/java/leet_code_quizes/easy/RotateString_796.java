package leet_code_quizes.easy;

public class RotateString_796 {

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println("StringIsEqual: " + rotateStringMyOwnMethod(s, goal));
    }

    public static boolean rotateStringMyOwnMethod(String s, String goal) {

        int counter = 0;

        counter++;
        String shiftedString = performShifts(s);


        if (goal.equals(shiftedString)){

            return true;
        }else{

            while (counter <= s.length()){
                counter++;
                shiftedString = performShifts(shiftedString);

                if (goal.equals(shiftedString)){
                    return true;
                }
            }

        }

        return false;
    }

    public static String performShifts(String s){

        char[] chArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            chArr[i] = s.charAt(i);
        }

        int lp = 0, rp = chArr.length-1;

        char temp = chArr[lp];

        for (int i = 0; i < chArr.length-1; i++){

            chArr[i] = chArr[i+1];
        }

        chArr[rp] = temp;

        return new String(chArr);
    }
}
