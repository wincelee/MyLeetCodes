package leet_code_quizes.hard;

import java.util.Arrays;

public class SuperWashingMachines_517 {

    public static void main(String[] args) {

        System.out.println("FindMinMovesMachinesOne: " + findMinMoves(new int[]{1,0,5}));

    }

    public static  int findMinMoves(int[] machines) {

        int count = 0;

        for (int i = 1; i < machines.length-1; i++){
            System.out.println("i: " + i);
            System.out.println("machines[i+1]: " + machines[i+1]);

            if(machines[i-1] > machines[i]){

            }
        }

        return 1;

    }
}
