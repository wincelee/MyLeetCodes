package leet_code_quizes;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransposeMatrix_867 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {4, 5, 6}};

        List<Character> charList = new ArrayList<>();

        char[] arr = {'b','a','a','b','a','b'};

        char currChar = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (currChar > arr[i -1]){
                System.out.println(currChar + ">" + arr[i-1] + ":" + "true");
            }else{
                System.out.println(currChar + ">" + arr[i-1] + ":" + "false");
                charList.add(arr[i]);
            }
        }

        System.out.println("CharList: " + new Gson().toJson(charList));

        System.out.println("TransposeUsingTwoLoops" + Arrays.deepToString(transposeUsingTwoLoops(matrix2)));
 
       /* System.out.println("ArrayBeforeTransposing: " + Arrays.deepToString(matrix));
        System.out.println("ArrayAfterTransposing: " + Arrays.deepToString(transpose(matrix)));*/

    }

    public static int[][] transposeUsingTwoLoops(int[][] matrix) {

        int iLength = matrix.length;
        int jLength = matrix[0].length;

        int[][] testArr = {{1,2,3},
                {4,5,6}};



        int[][] temp = new int[jLength][iLength];

        for (int i =0 ; i < iLength; i++){

            System.out.println("IArrayElement" + Arrays.toString(matrix[i]));

            for(int j = 0; j < jLength; j++){
                System.out.println("JArrayElement: " + matrix[i][j] + " JArrayIndex: " + j);
                temp[j][i] = matrix[i][j];
                System.out.println("J I: " + temp[j][i]);
                System.out.println("TempArray: " + Arrays.deepToString(temp));
            }
        }

        return temp;

    }

    public static int[][] transposeHardCoding(int[][] matrix) {

        int[][] temp = new int[matrix.length][matrix[0].length];

        temp[0][0] = matrix[0][0];
        temp[0][1] = matrix[1][0];
        temp[0][2] = matrix[2][0];

        temp[1][0] = matrix[0][1];
        temp[1][1] = matrix[1][1];
        temp[1][2] = matrix[2][1];

        temp[2][0] = matrix[0][2];
        temp[2][1] = matrix[1][2];
        temp[2][2] = matrix[2][2];

        return temp;

    }


}
