package leet_code_quizes.medium;

import classes.Config;
import com.google.gson.Gson;

import java.util.*;

public class LargestNumber_179 {

    public static void main(String[] args) {

        int[] nums1 = {3, 30, 34, 5, 9};
        int[] nums2 = {10,2};

        System.out.println(Config.ANSI_GREEN + "LargestNumberNums1: " + largestNumber(nums1));
        System.out.println(Config.ANSI_BLUE + "LargestNumberNums2: " + largestNumber(nums2));

    }

    public static String largestNumber(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder());

        List<Integer> resultQ = new LinkedList<>();

        for (Integer num : nums) {

            int max = 0;

            if (num < 10) {
                set.add(num);
            } else {

                if (num > max) {
                    max = num;
                }

                String numString = String.valueOf(num);

                char[] ch = numString.toCharArray();

                int[] arr = new int[ch.length];

                for (int i = 0; i < ch.length; i++) {
                    arr[i] = ch[i] - '0';
                }

                int lp = 0;
                int rp = arr.length - 1;

                while (lp < rp) {
                    int temp = arr[lp];
                    arr[lp++] = arr[rp];
                    arr[rp--] = temp;
                }

                int res = 0;

                for (int i = 0; i < arr.length; i++) {
                    res = res * 10 + arr[i];
                }

                if (res > max){
                    max = res;
                }

                set2.add(max);

            }
        }

        Iterator<Integer> itr = set.iterator();
        Iterator<Integer> itr2 = set2.iterator();

        while (itr.hasNext()) {
            resultQ.add(itr.next());
        }

        while (itr2.hasNext()) {
            resultQ.add(itr2.next());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < resultQ.size(); i++){
            sb.append(resultQ.get(i));
        }


        System.out.println("PrintResult: " + new Gson().toJson(resultQ));

        System.out.println("SetOne: " + new Gson().toJson(set));
        System.out.println("SetTwo: " + new Gson().toJson(set2));

        return sb.toString();
    }

}
