package learning.java_stream_map;

import classes.Config;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaFlatMapToExample {

    public static void main(String[] args) {

        // Here I am going to combine to array lists using Stream.of and flatMapToInt

        var arr1 = new int[]{5,10,34};
        var arr2 = new int[]{16, 3, 98};

        var arrFinal = Stream.of(arr1, arr2)
                .flatMapToInt(IntStream::of);

        System.out.println(Config.ANSI_YELLOW + "Final Array: " + arrFinal);
    }
}
