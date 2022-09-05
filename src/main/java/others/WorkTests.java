package others;

import classes.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class WorkTests {



    public static void main(String[] args) {

        List<HashMap<String, Object>> myList = new ArrayList<>();

        myList.add(new HashMap<>(Map.of("id", 1,
                "busId","4-3323309834",
                "busName","27Tr Solaris Single Deck",
                "currentSpeed",67,
                "passengersNo",80,
                "speedLimit",80,
                "dataDateTime","2022-08-27 05:22:46")));

        myList.add(new HashMap<>(Map.of("id",2,
                "busId","4-3323309834",
                "busName","27Tr Solaris Single Deck",
                "currentSpeed",56,
                "passengersNo",11,
                "speedLimit",80,
                "dataDateTime","2022-08-27 07:12:10")));

        myList.add(new HashMap<>(Map.of(
                "id",3,
                "busId","4-3323309834",
                "busName","27Tr Solaris Single Deck",
                "currentSpeed",31,
                "passengersNo",15,
                "speedLimit",80,
                "dataDateTime","2022-08-26 03:12:10")));

        myList.add(new HashMap<>(Map.of(
                "id",3,
                "busId","4-3323309834",
                "busName","27Tr Solaris Single Deck",
                "currentSpeed",78,
                "passengersNo",15,
                "speedLimit",80,
                "dataDateTime","2022-08-26 03:12:10")));

        myList.add(new HashMap<>(Map.of(
                "id",7,
                "busId","4-3323309834",
                "busName","27Tr Solaris Single Deck",
                "currentSpeed",49,
                "passengersNo",57,
                "speedLimit",80,
                "dataDateTime","2022-08-26 04:34:10")));


        System.out.println(Config.ANSI_CYAN + "MyListToJsonPrint: " +
                new GsonBuilder().setPrettyPrinting().create().toJson(myList));

    }
}
