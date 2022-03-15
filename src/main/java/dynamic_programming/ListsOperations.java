package dynamic_programming;

import classes.Person;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class ListsOperations {

    public static void main(String[] args) {

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("James", 300, "Male"));
        personsList.add(new Person("Jane", 500, "Female"));
        personsList.add(new Person("Valjakudze", 900, "Male"));
        personsList.add(new Person("Laika", 1200, "Female"));

        /*final double[] totalBalance = new double[1];

        personsList.forEach((Person person) -> {
            totalBalance[0] = totalBalance[0] + person.getBalance();
        });

        System.out.println(String.format("%s", String.valueOf(totalBalance)));*/

        personsList.forEach((Person person) -> {
            //System.out.println("balance " + person.getBalance());

        });

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

        System.out.println("PrintHashMap" + new GsonBuilder().setPrettyPrinting().create().toJson(hashMapList));

        /**double average = roster
         .stream()
         .filter(p -> p.getGender() == Person.Sex.MALE)
         .mapToInt(Person::getAge)
         .average()
         .getAsDouble();*/

        double totalBalance = personsList.stream().mapToDouble(Person::getBalance).sum();
        double totalBalanceMale = personsList.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Male"))
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


        System.out.println("TotalSumFromHashMap:" + sum + "\n" + "TotalSumFromHashMapUsingDouble:" + netWorthSum);

        System.out.println("TotalBalance:" + totalBalance);
        System.out.println("TotalBalanceMale:" + totalBalanceMale);
        System.out.println("TotalBalanceMaleUsingHashMap:" + totalBalanceMalesUsingHashMap);
        System.out.println("TotalBalanceFeMale:" + totalBalanceFemale);
        System.out.println("TotalBalanceGreaterThanOrEqualTo900:" + totalBalanceGreaterThanOrEqualTo900);

        System.out.println("MalesList:" + new GsonBuilder().setPrettyPrinting().create().toJson(malesList ));
        System.out.println("MalesListUsingHashMap:" + new GsonBuilder().setPrettyPrinting().create().toJson(malesListUsingHashMap ));
    }

}