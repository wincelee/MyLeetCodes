package leet_code_quizes.easy;

import classes.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class GsonPriorityQueueBug {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);

        Queue<Integer> mQueue = new PriorityQueue<>();
        mQueue.offer(4);
        mQueue.offer(2);
        mQueue.offer(9);
        mQueue.offer(1);
        mQueue.offer(3);
        mQueue.offer(5);


        // When using PriorityQueue don't print using gson or Arrays.toString(priorityQueue.toArray())
        while (!mQueue.isEmpty()){
            System.out.println(Config.ANSI_YELLOW + "PrintingFromWhileLoop: " + mQueue.poll());
        }
    }
}
