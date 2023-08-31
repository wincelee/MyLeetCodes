package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator_2788 {

    public static void main(String[] args) {

        List<String> words = List.of("one.two.three","four.five","six");
        char separator = '.';

        List<String> words2 = List.of("|||");
        char separator2 = '|';

        List<String> words3 = List.of("$easy$","$problem$");
        char separator3 = '$';

        System.out.println(Config.ANSI_CYAN + "SplitWordsBySeparator: " +
                splitWordsBySeparator(words, separator));

        /*System.out.println(Config.ANSI_CYAN + "SplitWordsBySeparator2: " +
                splitWordsBySeparator(words2, separator2));*/

        System.out.println(Config.ANSI_CYAN + "SplitWordsBySeparator: " +
                splitWordsBySeparator(words3, separator3));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {


        List<String> res = new ArrayList<>();

        for (String word: words){

            System.out.println(Config.ANSI_BLUE + "CurrentWord: " + word);

            int wLen = word.length();

            String chWord = "";

            for (int i = 0; i < wLen; i++){
                if (word.charAt(i) != separator) {
                    chWord += word.charAt(i);
                    System.out.println(Config.ANSI_RED + "CurrentChWord: " + chWord);

                    if (i == wLen -1){
                        if (chWord!=""){
                            res.add(chWord);
                        }
                    }
                } else {
                    System.out.println(Config.ANSI_GREEN + "CurrentChWordElseStatement: " + chWord);
                    if (chWord!=""){
                        res.add(chWord);
                    }
                    chWord = "";
                }
            }

            System.out.println(Config.ANSI_YELLOW + "CurrentList: " + new Gson().toJson(res));
        }

        return res;
    }
}
