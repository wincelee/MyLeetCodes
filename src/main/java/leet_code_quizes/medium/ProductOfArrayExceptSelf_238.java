package leet_code_quizes.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};

        System.out.println("ProductExceptSelfNums1: " +
                Arrays.toString(productExceptSelf(nums1)));

        System.out.println("ProductExceptSelfNoArraysFillNums1: " +
                Arrays.toString(productExceptSelfNoArraysFill(nums1)));

        System.out.println("ProductExceptSelfWithArraysFillNums1: " +
                Arrays.toString(productExceptSelfNoArraysFill(nums1)));

        System.out.println("ProductExceptSelfBruteForceNums1: " +
                Arrays.toString(productExceptSelfBruteForce(nums1)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int runningProduct = 1;

        for(int i = 0; i < nums.length; i++){
            result[i] = runningProduct;
            runningProduct = runningProduct * nums[i];
        }

        runningProduct = 1;

        for (int i = nums.length -1; i >= 0; i--){
            result[i] = result[i] * runningProduct;
            runningProduct = runningProduct * nums[i];
        }

        return result;
    }

    public static int[] productExceptSelfNoArraysFill(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        int product = 1;
        for(int i = 0; i < n; i++) {
            res[i] = product;
            product *= nums[i];
        }

        product = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }

        return res;
    }

    public static int[] productExceptSelfWithArraysFill(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        Arrays.fill(res, 1);

        int product = 1;
        for(int i = 0; i < n; i++) {
            res[i] *= product;
            product *= nums[i];
        }

        product = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }

        return res;
    }

    public static int[] productExceptSelfBruteForce(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++){

            int product = 1;

            for (int j = 0; j < n; j++){
                if (i != j){
                    product = product * nums[j];
                }
            }

            res[i] = product;
        }


        return res;
    }


}
