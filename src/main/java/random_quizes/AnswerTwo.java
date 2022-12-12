package random_quizes;

import java.util.Arrays;

public class AnswerTwo {

    public static void main(String[] args) {
        int[] nums = new int[]{6,8,5,12,1,10};

        System.out.println("Return:" + conditionsCheck(nums));
    }

    public static Integer conditionsCheck(int[] nums){
        int lp = 0;
        int rp = nums.length -1;

        while (lp < rp){
            if (nums[lp] % 2 == 1 && nums[rp] % 2 == 1){
                return 1;
            }else if(nums[lp] % 2 == 0 && nums[rp] % 2 == 0){
                return 1;
            }

            lp++;
            rp--;
        }

        return 0;
    }
}
