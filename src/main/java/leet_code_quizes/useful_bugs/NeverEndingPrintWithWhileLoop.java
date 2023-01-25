package leet_code_quizes.useful_bugs;

public class NeverEndingPrintWithWhileLoop {

    public static void main(String[] args) {
        int x = 999999999;

        neverEndingPrintNumbers(x);
    }

    public static void neverEndingPrintNumbers(int x){
        String s = String.valueOf(x);

        int lp = 0, rp = s.length() -1;

        while (lp < rp){
            System.out.println("LP: " + lp);
            System.out.println("RP: " + rp);
            lp--;
            rp++;
        }
    }
}
