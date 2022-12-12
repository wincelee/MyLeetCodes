package random_quizes;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnswerOne {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 8, 10, 12, 4, 1,6,8,7};

        List<Integer> res = new ArrayList<>();
        List<Integer> calIndexes = new ArrayList<>();

        for (int i = 0; i < nums.length;i++){
            if(i % 2 == 1){
                res.add(nums[i]);
            }else{

                calIndexes.add(nums[i]);

                int sum = calIndexes.stream().mapToInt(Integer::intValue).sum();

                res.add(sum);


            }
        }

        System.out.println("res: " + new Gson().toJson(res));

    }

}
