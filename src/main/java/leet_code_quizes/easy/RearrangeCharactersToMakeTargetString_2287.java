package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class RearrangeCharactersToMakeTargetString_2287 {

    public static void main(String[] args) {
        String s = "ilovecodingonleetcode", s2 = "abbaccaddaeea";
        String target = "code", target2 = "aaaaa";

        System.out.println("RearrangeCharacters: " + rearrangeCharacters(s, target));
    }

    public static int rearrangeCharacters(String s, String target) {

        int res = 0;

        LinkedList<Character> tList = new LinkedList<>();
        Set<Character> temp = new HashSet<>();

        Map<Integer, Character> tempMap = new HashMap<>();

        for (char c : target.toCharArray()) {
            tList.add(c);
        }

        for (int i = 1; i < s.length() - 1; i++) {


            if (tList.contains(s.charAt(i)) && tList.contains(s.charAt(i + 1))) {
                temp.add(s.charAt(i));
                temp.add(s.charAt(i + 1));

                System.out.println("TempList(i)(i+1): " + new Gson().toJson(temp));

                if (temp.size() == tList.size()) {
                    res++;
                    temp.clear();
                }

            } else if (tList.contains(s.charAt(i)) && tList.contains(s.charAt(i - 1))) {
                temp.add(s.charAt(i));
                temp.add(s.charAt(i - 1));

                System.out.println("TempList(i)(i-1): " + new Gson().toJson(temp));

                if (temp.size() == tList.size()) {
                    res++;
                    temp.clear();
                }

            } else if (temp.isEmpty()) {

                System.out.println(Config.ANSI_YELLOW + "TempListIsEmpty: " + new Gson().toJson(temp));

                if (tList.contains(s.charAt(i-1))){
                    System.out.println(Config.ANSI_GREEN + "CurrentCharAt(i-1): " + s.charAt(i-1) + ": " + (i-1));
                    tempMap.put((i-1), s.charAt(i-1));
                }else if (tList.contains(s.charAt(i))){
                    System.out.println(Config.ANSI_PURPLE + "CurrentCharAt(i): " + s.charAt(i) + ": " + (i));
                    tempMap.put(i, s.charAt(i));
                } else if (tList.contains(s.charAt(i+1))){
                    System.out.println(Config.ANSI_BLUE + "CurrentCharAt(i+1): " + s.charAt(i+1) + ": " + (i+1));
                    tempMap.put((i+1), s.charAt(i+1));
                }

                List<Character> charList = tempMap.values().stream().collect(Collectors.toList());

                if (charList.size() == tList.size()){
                    res++;
                    charList.clear();
                }

                /*if (tList.contains(s.charAt(i - 1)) || tList.contains(s.charAt(i))
                        || tList.contains(s.charAt(i + 1))) {

                    System.out.println("PreviousChar: " + s.charAt(i-1));
                    System.out.println("CurrentChar: " + s.charAt(i));
                    System.out.println("NextChar: " + s.charAt(i+1));

                    temp2.add(s.charAt(i - 1));
                    temp2.add(s.charAt(i));
                    temp2.add(s.charAt(i + 1));

                    System.out.println("TempListAfterAdding: " + new Gson().toJson(temp2));

                    if (temp2.size() == tList.size()) {
                        res++;
                        temp2.clear();
                    }
                }*/
            }

        }

        return res;
    }
}
