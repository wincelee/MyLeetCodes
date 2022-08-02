package leet_code_quizes.easy;

import java.util.Stack;

public class ValidParentheses_20 {

    public static void main(String[] args) {


        String s1 ="()"; // true
        String s2 ="(]"; // false
        String s3 ="}}"; // false
        String s4 ="([}}])"; // false
        String s5 ="())"; // false

        System.out.println("isValidParenthesesString1: " + isValid(s1));
        System.out.println("isValidParenthesesString2: " + isValid(s2));
        System.out.println("isValidParenthesesString3: " + isValid(s3));
        System.out.println("isValidParenthesesString4: " + isValid(s4));
        System.out.println("isValidParenthesesString5: " + isValid(s5));

    }

    public static boolean isValid(String s) {

        if(s.length() % 2 == 1){
            return false;
        }

        Stack<Character> myStack = new Stack<>();

        for(char c: s.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                myStack.push(c);
            }else if(c==')' && !myStack.isEmpty() && myStack.peek() == '('){
                myStack.pop();
            }else if(c==']' && !myStack.isEmpty() && myStack.peek() == '['){
                myStack.pop();
            }else if(c=='}' && !myStack.isEmpty() && myStack.peek() == '{'){
                myStack.pop();
            }
            // For cases like "([}}])"
            else{
                return false;
            }

        }

        return myStack.isEmpty();
    }
}
