package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {

    public static void main(String[] args) {
        System.out.println(generateParentheses(3));

        //generateParentheses(3);
    }

    public static List<String> generateParentheses(int n){

        List<String> outputList = new ArrayList<>();

        backTrack(outputList, "", 0,0, n);

        return outputList;
    }

    public static void backTrack(List<String> outputList, String currentString, int open, int close, int n){

        // only add to the output list when currentString length is
        // equal to n * 2 which is the number of parentheses to be generated
        // we are multiplying by 2 because it's a pair

        /* if for example currentString.length() == 0  means it's less n * 2
        (which is 3*2=6) then don't add current string to output list condition is false,
        if the length for example currentString.length() == 6 then add to output list and return
        because condition is true*/

        if (currentString.length() == n * 2){
            outputList.add(currentString);
            return;
        }

        /* For open lets start with 0
        * 0 is less than n which means call backTrack method
        *
        *   > add "(" to currentString
        *   > add 1 to open
        *   > don't do anything to close
        *
        * Do this as long as open is less than n
        * */
        if (open < n) {

           // System.out.println("\n\noutputListForOpenMark = " + outputList + ", currentString = " + currentString + ", openMark = " + open + ", closeMark = " + close + ", n = " + n);

            // We have an empty current string
            backTrack(outputList, currentString + "(", open + 1, close, n);

        }

        /* For close lets start with 0
        *  if close is less than open then
        *
        *   > add ")" to currentString
        *   > don't do anything to 1
        *   > add 1 to close
        *
        * */
        if (close < open){

            // System.out.println("\n\noutputListForCloseMark = " + outputList + ", currentString = " + currentString + ", open = " + open + ", close = " + close + ", n = " + n);

            backTrack(outputList, currentString + ")", open, close +1, n);

        }
    }
}
