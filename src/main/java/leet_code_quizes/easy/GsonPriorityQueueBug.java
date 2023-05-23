package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class GsonPriorityQueueBug {

    public static void main(String[] args) {

        Queue<Integer> mQueue = new PriorityQueue<>();
        mQueue.offer(4);
        mQueue.offer(2);
        mQueue.offer(9);
        mQueue.offer(1);
        mQueue.offer(3);
        mQueue.offer(5);

        System.out.println(Config.ANSI_CYAN + "MyPriorityQueue: " +
                new GsonBuilder().setPrettyPrinting().create().toJson(mQueue));

        System.out.println(Config.ANSI_CYAN + "MyPriorityQueueWithoutPrettyPrint: " +
                new Gson().toJson(mQueue));

        while (!mQueue.isEmpty()){
            System.out.println(Config.ANSI_YELLOW + "PrintingFromWhileLoop: " + mQueue.poll());
        }
    }
}
