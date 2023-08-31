package leet_code_quizes.easy;

public class NumberOfEmployeesWhoMetTheTarget_2798 {

    public static void main(String[] args) {

        int[] hours1 = {0,1,2,3,4};
        int target1 = 2;

        System.out.println("NumberOfEmployeesWhoMetTarget: " +
                numberOfEmployeesWhoMetTarget(hours1, target1));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour: hours){
            if (hour >= target){
                count++;
            }
        }

        return count;
    }
}
