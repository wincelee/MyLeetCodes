package code_library;

import classes.Config;
import com.google.gson.GsonBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOperations {

    public static void main(String[] args) {

        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellneous", 90);

        // Sort Map by values in ascending order
        Map<String, Integer> sortedMapAsc = budget
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        // Sort Map by values in descending order
        Map<String, Integer> sortedMapDesc = budget
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println(Config.ANSI_BLUE + "SortedMapUsingValuesAscendingOrder:: " +
                new GsonBuilder().setPrettyPrinting().create().toJson(sortedMapAsc));

        System.out.println(Config.ANSI_GREEN + "SortedMapUsingValuesDescendingOrder:: " +
                new GsonBuilder().setPrettyPrinting().create().toJson(sortedMapDesc));


    }
}
