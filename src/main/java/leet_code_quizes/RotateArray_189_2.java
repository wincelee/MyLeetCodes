package leet_code_quizes;

import java.util.Arrays;

public class RotateArray_189_2 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        // [5, 6, 7, 1, 2, 3, 4]

        int k = 10000;

        for(int i=0;i<k;i++){
            nums = rotateArray(nums);
        }

        System.out.println("Nums: " + Arrays.toString(nums));

    }

    public static int[] rotateArray(int[] nums2){
        int length = nums2.length-1;
        int lastIndex = nums2[length];
        for (int a=length;a>0;a--){
            nums2[a]=nums2[a-1];
        }
        nums2[0]=lastIndex;
        return nums2;
    }

}
