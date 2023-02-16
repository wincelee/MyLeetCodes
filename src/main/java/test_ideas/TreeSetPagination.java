package test_ideas;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSetPagination {

    public static void main(String[] args) {
        TreeSet<Integer> redisOrderedList = new TreeSet<>();

        redisOrderedList.add(2);
        redisOrderedList.add(4);
        redisOrderedList.add(12);
        redisOrderedList.add(7);
        redisOrderedList.add(16);
        redisOrderedList.add(17);
        redisOrderedList.add(19);
        redisOrderedList.add(20);
        redisOrderedList.add(34);
        redisOrderedList.add(56);
        redisOrderedList.add(30);
        redisOrderedList.add(78);
        redisOrderedList.add(100);
        redisOrderedList.add(91);
        redisOrderedList.add(95);
        redisOrderedList.add(97);
        redisOrderedList.add(98);
        redisOrderedList.add(85);
        redisOrderedList.add(70);
        redisOrderedList.add(115);
        redisOrderedList.add(112);
        redisOrderedList.add(119);
        redisOrderedList.add(121);
        redisOrderedList.add(400);
        redisOrderedList.add(223);
        redisOrderedList.add(250);
        redisOrderedList.add(300);
        redisOrderedList.add(219);

        System.out.println("RedisOrderedList: " + new Gson().toJson(redisOrderedList));


        /*int pageSize = 10;
        int page = 3;

        List<Integer> finalList = redisOrderedList.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());*/


        List<Integer> finalList = redisOrderedList.stream().skip(10).limit(10).collect(Collectors.toList());

        System.out.println("FinalList: " + new Gson().toJson(finalList));


    }
}
