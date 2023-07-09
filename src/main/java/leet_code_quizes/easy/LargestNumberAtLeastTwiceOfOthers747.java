package leet_code_quizes.easy;

public class LargestNumberAtLeastTwiceOfOthers747 {

    public static void main(String[] args) {

        int[] nums = {3,6,1,0};
        int[] nums1 = {0,0,0,1};
        int[] nums2 = {0,0,1,3};

        // System.out.println("DominantIndex: " + dominantIndex(nums));
        System.out.println("DominantIndex: " + dominantIndex(nums2));

    }

    public static int dominantIndex(int[] nums) {

        int initMax = 0, max = 0, maxPos = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                initMax = max;
                max = nums[i];
                maxPos = i;
            }
        }

        System.out.println("InitMax: " + initMax);
        System.out.println("Max: " + max);
        System.out.println("MaxPos: " + maxPos);


        if (initMax * 2 == max){
            return maxPos;
        }

        return -1;

    }
}
