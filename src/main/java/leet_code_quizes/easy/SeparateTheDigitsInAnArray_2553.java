package leet_code_quizes.easy;

import java.util.*;

public class SeparateTheDigitsInAnArray_2553 {

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};

        //System.out.println("SeparateDigits: " + Arrays.toString(separateDigits(separateDigits(nums))));
        /*System.out.println("SeparateDigitsUsingLinkedList: " +
                Arrays.toString(separateDigits(separateDigitsUsingLinkedList(nums))));*/

    }

    public static int[] separateDigits(int[] nums) {

        List<Integer> res = new ArrayList<>();

        for (int i : nums) {

            List<Integer> holder = new ArrayList<>();

            while (i > 0) {
                holder.add(i % 10);
                i /= 10;
            }

            Collections.reverse(holder);

            res.addAll(holder);

        }

        int[] resArr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }

        return resArr;
    }

    public static int[] separateDigitsUsingLinkedList(int[] nums) {
        LinkedList<Integer> res = new LinkedList<>();

        for (int i: nums){

        }

        int[] resArr = new int[res.size()];

        return resArr;
    }
}
