package leet_code_quizes.easy;

import java.util.Arrays;

public class TransposeMatrix_867 {

    public static void main(String[] args) {
        int[][] nums1 = {{2, 4, -1},{-10, 5, 11},{18, -7, 6}};
        int[][] nums2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums3 = {{1,2,3},{4,5,6}};

        System.out.println("TransposeNums1: " + Arrays.deepToString(transpose(nums1)));
        System.out.println("TransposeNums2: " + Arrays.deepToString(transpose(nums2)));
        System.out.println("TransposeNums3: " + Arrays.deepToString(transpose(nums3)));

    }

    public static int[][] transpose(int[][] matrix) {

        int rLength = matrix.length;
        int cLength = matrix[0].length;

        int[][] temp = new int[cLength][rLength];

        for (int i =0; i < rLength; i++){
            for(int j = 0; j < cLength; j++){
                temp[j][i] = matrix[i][j];
            }
        }

        return temp;
    }
}
