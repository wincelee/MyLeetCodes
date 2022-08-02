package leet_code_quizes.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

    public static void main(String[] args) {

        int[] nums1 = {5,7,7,8,8,10};

        System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays.toString(searchRange(nums1, 8)));

    }

    public static int[] searchRange(int[] nums, int target) {

        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if(i==target){
                positions.add(i);
            }
        }

        int[] res = new int[positions.size()];

        for(int i = 0; i < positions.size(); i++) {

            res[i] = positions.get(i);

        }

        return res;
    }
}
