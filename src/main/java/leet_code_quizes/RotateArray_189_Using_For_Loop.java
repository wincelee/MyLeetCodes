package leet_code_quizes;

public class RotateArray_189_Using_For_Loop {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        // [5, 6, 7, 1, 2, 3, 4]

        int k = 3;

        int numsLength = nums.length;

        if (k > numsLength){
            k = k % numsLength;
        }

        int[] temp = new int[numsLength];


        // System.arraycopy(nums, 0, temp, 0, numsLength);
        // you can achieve below loop using System.arrayCopy

        for (int i = 0; i < numsLength; i++){
            temp[i] = nums[i];
        }

        for (int i = 0; i < numsLength; i++){
            nums[(i+k) % numsLength] = temp[i];
        }

    }

}
