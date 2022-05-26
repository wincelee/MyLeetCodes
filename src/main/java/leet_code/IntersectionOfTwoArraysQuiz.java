package leet_code;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysQuiz {

    public static void main(String[] args) {
        int[] nums1 = {7, 5, 3, 1,2, 9, 8};
        int[] nums2 = {1, 4, 2, 7};

        /*Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println("Sorted Nums 1" + Arrays.toString(nums1));
        System.out.println("Sorted Nums 2" + Arrays.toString(nums2));*/

        System.out.println("IntersectedArray" + Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2){

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] ans = new int[length1 * length2];

        int i =0, j = 0, k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < length1 && j < length2){
            if (nums1[i] < nums2[j]){
                i ++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else{
                ans[k++] = nums1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(ans, 0, k);
    }


}
