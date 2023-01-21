package leet_code_quizes.medium;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

    public static void main(String[] args) {

        int[] nums1 = {5, 7, 7, 8, 8, 10};


        //System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays.toString(searchRangeUsingList(nums1, 8)));
//        System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays
//                .toString(searchRangeUsingLeftPointerForLoopAndRightPointerForLoop(nums1, 8)));

        System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays
                .toString(searchRangeUsingBinarySearch(nums1, 8)));

    }

    public static int[] searchRangeUsingList(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
            if(nums[i]>target)
                break;
        }

        if (list.isEmpty()) {
            return new int[]{-1, -1};
        }

        return new int[]{list.get(0), list.get(list.size() - 1)};

    }


    public static int[] searchRangeUsingLeftPointerForLoopAndRightPointerForLoop(int[] nums, int target) {

        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res[0] = i;
            }
        }

        for (int i = nums.length - 1; i <= 0; i--) {
            System.out.println("Called" + Arrays.toString(nums) + ", target = " + target);
            if (nums[i] == target) {
                res[1] = i;
            }
        }

        return res;

    }

    public static int[] searchRangeUsingBinarySearch(int[] nums, int target) {
        return new int[]{find(nums, target, true), find(nums, target, false)};
    }

    private static int find(int[] nums, int target, boolean leftIfTrue) {
        int lp = 0;
        int rp = nums.length - 1;
        int index = -1;

        if (leftIfTrue) {
            while (lp <= rp) {
                System.out.println("LeftPointer: " + lp);
                System.out.println("RightPointer: " + rp);
                int mid = lp + (rp - lp) / 2;
                System.out.println("Mid: " + mid);


                //System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
                //System.out.println("mid using / 2   = " + ((low + high) / 2));

                System.out.println("5/7: " + 5/7);
                if (target <= nums[mid]) {
                    rp = mid - 1;
                } else {
                    lp = mid + 1;
                }
                if (target == nums[mid]) {
                    index = mid;
                }
            }
        } else {
            while (lp <= rp) {
                int mid = lp + (rp - lp) / 2;
                if (target >= nums[mid]) {
                    lp = mid + 1;
                } else {
                    rp = mid - 1;
                }
                if (target == nums[mid]) {
                    index = mid;
                }
            }
        }
        return index;
    }
}
