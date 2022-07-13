package linkedIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSortNamesAlphabetically {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Joy");
        names.add("Mike");
        names.add("Catherine");
        names.add("David");
        names.add("Valjakutse");
        names.add("Mohammed");
        names.add("Jean");
        names.add("elena");
        names.add("rosa");
        names.add("charles");
        names.add("carmen");
        names.add("ivan");
        names.add("diana");
        names.add("omar");

        names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

        System.out.println("args = " + Arrays.deepToString(args));


    }
}
