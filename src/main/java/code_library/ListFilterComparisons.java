package code_library;

import com.google.gson.Gson;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilterComparisons {

    public static void main(String[] args) {

        List<String> list1 = List.of("DX4555", "DY4897", "FG4333", "IH09992");
        List<String> list2 = List.of("DX4555", "DY4897", "FG4333", "IH09992", "LJ48833", "YTR3888");

        List<String> listNotCommon = list2.stream().filter(code -> !list1.contains(code)).toList();

        // list1.stream().distinct().collect(Collectors.toList())

        // to get only a list of particular fields and columns
        // List<String> rankDisplayList = universities.stream().map(University::getRank_display).toList();

        System.out.println("ListNotCommon: " + new Gson().toJson(listNotCommon));

    }
}
