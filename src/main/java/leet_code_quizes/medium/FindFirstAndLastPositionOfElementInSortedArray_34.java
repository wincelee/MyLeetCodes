package leet_code_quizes.medium;

import com.google.gson.Gson;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

    public static void main(String[] args) {

        int[] nums1 = {5,7,7,8,8,10};

        System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays.toString(searchRangeUsingList(nums1, 8)));
        //System.out.println("Nums1FirstAndLastPositionOfTarget: " + Arrays.toString(searchRangeUsingTwoPointers(nums1, 8)));

    }

    public static int[] searchRangeUsingList(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }

        if(list.isEmpty()){
            return new int[]{-1, -1};
        }

        return new int[]{list.get(0), list.get(list.size()-1)};

    }


    public static int[] searchRangeUsingTwoPointers(int[] nums, int target) {

        int[] res = new int[2];


        int lp = 0, rp = nums.length-1, firstPos =0, lastPos =0;

        boolean incLp = true, decRp = true;


        while (lp < rp){

            if(nums[lp] == target){
                firstPos=lp;
                incLp = false;
            }else{
                if (incLp){
                    lp++;
                }
            }

            if(nums[rp]==target){
                lastPos=rp;
                decRp = false;
            }else{
                if(decRp){
                    rp--;
                }
            }

        }

        System.out.println("FirstPos" + firstPos);
        System.out.println("LastPos" + lastPos);

        /*if(firstPos!=0 && lastPos!=0){
            return new int[]{firstPos, lastPos};
        }
*/
        return new int[]{-1, -1};

    }
}
