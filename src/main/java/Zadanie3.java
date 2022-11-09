import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lista imion może zawierać duplikaty, których chcemy uniknąć.
 * Napisz ciało metody removeDuplicates, która zwróci listę imion bez duplikatów
 */

public class Zadanie3 {


    private final List<String> imiona = Arrays.asList("Tomek", "Damian", "Damian", "Kamil", "Karol", "Janusz", "Karol");

    public static void main(String[] args) {

        List<String> names2 = Arrays.asList("Tomek", "Damian", "Damian", "Kamil", "Karol", "Janusz", "Karol");
        System.out.println(names2);
        System.out.println(removeDuplicates(names2));
    }

    public static List<String> removeDuplicates(List<String> names) {

        List<String> namesWithoutDuplicates = new ArrayList<>();

        for (String s : names) {
            if (!namesWithoutDuplicates.contains(s))
                namesWithoutDuplicates.add(s);

        }
        //     return new ArrayList<>();
        return namesWithoutDuplicates;
    }
}
