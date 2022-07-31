package leet_code_quizes.hard;

import java.util.Arrays;

public class TrappingRainWater_42 {

    public static void main(String[] args) {

        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};

        int[] height2 = {4,2,0,3,2,5};

        int[] height3 = {1, 0, 8, 5, 3, 9, 1, 1, 0, 4, 5};

        System.out.println("TrapUsingTwoPointers1: " + trapUsingTwoPointers(height1));
        System.out.println("TrapUsingTwoPointers2: " + trapUsingTwoPointers(height2));
        System.out.println("TrapUsingTwoPointers3: " + trapUsingTwoPointers(height3));
    }

    public static int trapUsingTwoPointers(int[] height) {

        int res = 0, lp = 0, rp = height.length-1, maxLevel = 0;

        while (lp < rp){
            // check if the left or the right has the lower level
            int lowerLevel = height[height[lp] < height[rp] ? lp++: rp--];

            maxLevel = Math.max(lowerLevel, maxLevel);

            res+=maxLevel - lowerLevel;

        }

        return res;
    }
}
