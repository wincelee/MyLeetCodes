package leet_code_quizes.medium;

import java.util.Arrays;

public class IntegerReplacement_397 {

    public static void main(String[] args) {

        int n = 65535, counter = 0;


        while (n > 1){
            if (isEven(n)){
                n = n/2;
                counter++;
                System.out.println("PrintN: " + n);
                System.out.println("PrintCounter: " + counter);
                System.out.println("\n");
            }else{
                n= n+1;
                counter++;
                System.out.println("PrintN: " + n);
                System.out.println("PrintCounter: " + counter);
                System.out.println("\n");
            }
        }

    }

    private static boolean isEven(int n){
        return n % 2 == 0;
    }
}
