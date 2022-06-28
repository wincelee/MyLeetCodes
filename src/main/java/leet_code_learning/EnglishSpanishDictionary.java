package leet_code_learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnglishSpanishDictionary {

    public static void main(String[] args) {

        Map<String, String> engSpanDic = new HashMap<>();

        engSpanDic.put("Monday", "Lunes");
        engSpanDic.put("Tuesday", "Martes");
        engSpanDic.put("Wednesday", "Miércoles");
        engSpanDic.put("Thursday", "Jueves");
        engSpanDic.put("Friday", "Viernes");
        engSpanDic.put("Saturday", "Sàbado");
        engSpanDic.put("Sunday", "Domingo");

        System.out.println(engSpanDic.get("Monday"));
        System.out.println(engSpanDic.get("Tuesday"));
        System.out.println(engSpanDic.get("Wednesday"));
        System.out.println(engSpanDic.get("Thursday"));
        System.out.println(engSpanDic.get("Friday"));

        // print out all keys
        System.out.println("\n" + engSpanDic.keySet());

        // print out all values
        System.out.println("\n" + engSpanDic.values());

        // print the size of our dictionary
        System.out.println("\nDictionarySize: " + engSpanDic.size());

        // shopping list
        Map<String, Boolean> shoppingList = new HashMap<>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        // remove something from shopping list
        shoppingList.remove("Sugar");

        // update shopping list
        shoppingList.put("Bread", false);
        // or you can update using replace
        shoppingList.replace("Oreos", false);

        System.out.println("\n");
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Bread"));
        System.out.println("\n");

        // Print key-value pair
        System.out.println(shoppingList.toString());

        // Clear all items in the shopping list
        shoppingList.clear();

        // print shopping list again after clearing
        System.out.println(shoppingList.toString());

        // check if shopping list is empty
        System.out.println("IsShoppingListEmpty: " + shoppingList.isEmpty());
    }
}
