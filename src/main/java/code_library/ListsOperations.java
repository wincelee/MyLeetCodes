package code_library;

import classes.Item;
import classes.JsonStringResponse;
import classes.Person;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ListsOperations {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(1, "James", 300, "Male", true));
        personsList.add(new Person(2, "Jane", 500, "Female", false));
        personsList.add(new Person(3, "Valjakudze", 900, "Male", false));
        personsList.add(new Person(4, "Laika", 1200, "Female", true));

        HashMap<String, Object> jamesMap = new HashMap<>();
        jamesMap.put("name", "James");
        jamesMap.put("balance", 300);
        jamesMap.put("netWorth", 125.3610225512225585512);
        jamesMap.put("gender", "Male");

        HashMap<String, Object> janeMap = new HashMap<>();
        janeMap.put("name", "Jane");
        janeMap.put("balance", 500);
        janeMap.put("netWorth", 8956.2221555684553223);
        janeMap.put("gender", "FeMale");

        HashMap<String, Object> valjakudzeMap = new HashMap<>();
        valjakudzeMap.put("name", "Valjakudze");
        valjakudzeMap.put("balance", 900);
        valjakudzeMap.put("netWorth", 11512.3202365656565856);
        valjakudzeMap.put("gender", "Male");

        HashMap<String, Object> laikaMap = new HashMap<>();
        laikaMap.put("name", "Laika");
        laikaMap.put("balance", 1200);
        laikaMap.put("netWorth", 6955.23238895002225526565);
        laikaMap.put("gender", "FeMale");

        List<HashMap<String, Object>> hashMapList = new ArrayList<>();

        hashMapList.add(jamesMap);
        hashMapList.add(janeMap);
        hashMapList.add(valjakudzeMap);
        hashMapList.add(laikaMap);

        System.out.println(ANSI_YELLOW + "PrintHashMapList" + new GsonBuilder().setPrettyPrinting().create().toJson(hashMapList));

        double totalBalance = personsList.stream().mapToDouble(Person::getBalance).sum();

        double totalBalanceMale = personsList.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Male"))
                .mapToDouble(Person::getBalance).sum();

        double totalBalanceWorkingPersons = personsList.stream()
                .filter(Person::isPersonWorking)
                .mapToDouble(Person::getBalance).sum();

        double totalBalanceFemale = personsList.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Female"))
                .mapToDouble(Person::getBalance).sum();

        double totalBalanceGreaterThanOrEqualTo900 = personsList.stream()
                .filter(person -> person.getBalance() >= 900)
                .mapToDouble(Person::getBalance).sum();

        List<Person> malesList = personsList.stream().filter(person ->
                person.getGender().equalsIgnoreCase("Male")).toList(); //

        // double totalHashMapBalance = hashMapList.stream().mapToDouble(HashMap<String, Object>::).sum();

        int sum = hashMapList.stream().mapToInt(hashMap -> Integer.parseInt(hashMap.get("balance")
                .toString())).sum();

        double netWorthSum = hashMapList.stream().mapToDouble(hashMap -> Double.parseDouble(hashMap.get("netWorth")
                .toString())).sum();

        double totalBalanceMalesUsingHashMap = hashMapList.stream()
                .filter(hashMap -> hashMap.get("gender").toString().equalsIgnoreCase("Male"))
                .mapToDouble(hashMap -> Double.parseDouble(hashMap.get("balance")
                .toString())).sum();

        List<HashMap<String, Object>> malesListUsingHashMap = hashMapList.stream().filter(hashMap ->
                hashMap.get("gender").toString().equalsIgnoreCase("Male")).toList(); //


        System.out.println(ANSI_BLUE + "TotalSumFromHashMap:" + sum + "\n" + "TotalSumFromHashMapUsingDouble:" + netWorthSum);

        System.out.println(ANSI_BLUE + "TotalBalance:" + totalBalance);
        System.out.println(ANSI_BLUE + "TotalBalanceMale:" + totalBalanceMale);
        System.out.println(ANSI_BLUE + "TotalBalanceWorkingPersons:" + totalBalanceWorkingPersons);
        System.out.println(ANSI_BLUE + "TotalBalanceMaleUsingHashMap:" + totalBalanceMalesUsingHashMap);
        System.out.println(ANSI_BLUE + "TotalBalanceFeMale:" + totalBalanceFemale);
        System.out.println(ANSI_BLUE + "TotalBalanceGreaterThanOrEqualTo900:" + totalBalanceGreaterThanOrEqualTo900);

        System.out.println(ANSI_GREEN + "MalesList:" + new GsonBuilder().setPrettyPrinting().create().toJson(malesList ));
        System.out.println(ANSI_RED + "MalesListUsingHashMap:" + new GsonBuilder().setPrettyPrinting().create().toJson(malesListUsingHashMap ));

        // MaxList
        /*int maxPersonId = personsList.stream()
                .mapToInt().max().getAsInt();*/


        List<String> personsNamesUsingForEach = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger(0);

        personsList.forEach((person)->{
            personsNamesUsingForEach.add(person.getUsername());
            System.out.println("Person" + person.getUsername());
            counter.getAndIncrement();
        });

        List<String> personsNamesUsingStream = personsList.stream().map(Person::getUsername).toList();

        List<String> personsNamesUsingStream2 = personsList.stream().map(person ->
                person.getUsername()).collect(Collectors.toList());

        System.out.println(ANSI_BLUE + "PersonNamesListUsingStream" + new GsonBuilder()
                .setPrettyPrinting().create().toJson(personsNamesUsingStream));

        System.out.println(ANSI_BLUE + "PersonNamesListUsingForEach" + new GsonBuilder()
                .setPrettyPrinting().create().toJson(personsNamesUsingForEach));


        List<Item> itemList = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(JsonStringResponse.itemJsonString);

        AtomicInteger i = new AtomicInteger(0);

        jsonArray.forEach((array)->{

            JSONObject jsonObject = jsonArray.getJSONObject(i.get());

            Item item = new Item();
            item.setId(jsonObject.getString("id"));
            item.setTitle(jsonObject.getString("title"));
            item.setImageUrl(jsonObject.getString("imageUrl"));
            item.setSubTitle(jsonObject.getString("subTitle"));

            itemList.add(item);

            i.getAndIncrement();

        });


        /*List<String> personsNamesUsingStream2 = personsList.stream().map(person ->
                person.getUsername()).collect(Collectors.toList());*/

        /*List<Item> itemList2 = IntStream.range(0, jsonArray.length())
                .mapToObj(jsonArray::get)
                .map(mapItem -> ).toList();

        List<Item> itemList3 = jsonArray.toList().stream()
                .map(mapItem -> ).toList();

        List<String> itemTitles = IntStream.range(0, jsonArray.length())
                .mapToObj(jsonArray::get)
                .map(Object::toString).toList();*/

        System.out.println(ANSI_YELLOW + "ItemsList" + new GsonBuilder().setPrettyPrinting()
                .create().toJson(itemList));

        System.out.println(ANSI_YELLOW + "ItemTitlesUsingStream" + new GsonBuilder().setPrettyPrinting()
                .create().toJson(itemTitles));

        System.out.println(ANSI_BLUE + "PersonsListMaxBalance:" + totalBalanceFemale);

    }

}