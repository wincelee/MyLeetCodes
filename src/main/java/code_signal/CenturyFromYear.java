package code_signal;

import java.util.Arrays;
import java.util.Map;

public class CenturyFromYear {

    public static void main(String[] args) {
        int year1 = 2001;

        System.out.println("CenturyForYearOne: " + solution(year1));


    }

    public static int solution(int year) {
        int count = 0;

        while (year > 100){

            year -= 100;
            count++;
        }

        if (year > 0){
            count++;
        }

        return count;
    }
}
