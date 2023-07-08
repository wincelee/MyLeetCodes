package leet_code_quizes.easy;

public class DetectCapital_520 {

    public static void main(String[] args) {

        String s1 = "USA";
        String s2 = "FlaG";
        String s3 = "Leetcode";

        System.out.println("DetectCapitalLetters: " + detectCapitalUseMyOwnMethod(s2));

    }

    public static boolean detectCapitalUseMyOwnMethod(String word) {

        // check if all letters are uppercase
        // check if all letters are lowercase
        // check if the first letter is uppercase
        boolean isFirstCharUpper = false;
        boolean isAllCharLower = false;
        boolean isAllCharUpper = false;

        for (int i = 0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                isFirstCharUpper = true;
                break;
            }
        }

        for (int i = 0; i < word.length(); i++){
            if (isFirstCharUpper){
                if (!Character.isUpperCase(word.charAt(i))){
                    isAllCharUpper = false;
                }else{
                    isAllCharUpper = true;
                }
            }else{
                if (Character.isLowerCase(word.charAt(i))){
                    isAllCharLower = true;
                }else{
                    isAllCharUpper = false;
                }
            }

        }

        if (isAllCharUpper){
            return true;
        }

        if (isAllCharLower){
            return true;
        }

        if (isFirstCharUpper){
            return true;
        }

        return false;
    }
}
