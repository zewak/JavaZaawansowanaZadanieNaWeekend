import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Zaimplementuj BubbleSort
 * Napisz ciało metody, która dla dowolnej tablicy int[] zwróci tablicę posortowaną za pomocą algorytmu bubble sort
 * Opis bubble sort masz np tu: https://www.youtube.com/watch?v=xli_FI7CuzA lub tu: https://www.geeksforgeeks.org/bubble-sort/
 */

public class Zadanie4 {
    static List<Integer> numbers2 = Arrays.asList(8, 3, 400, 900, 6543, 1, 65, 754, 21, 0);

    public static void main(String[] args) {
        System.out.println(numbers2.get(2));
        System.out.println(numbers2);
        System.out.println("--SORTOWANIE-- ");

        List<Integer> sortNumber = new ArrayList<>(bubbleSort(numbers2));
        System.out.println(sortNumber);

    }

    public static List<Integer> bubbleSort(List<Integer> numbers) {

        List<Integer> sortedList = new ArrayList<>(numbers);

        for (int i = 0; i < sortedList.size()-1; i++) {
            for (int j = 0; j < sortedList.size()-1; j++) {
                if (sortedList.get(j) > sortedList.get(j+1)) {
                    Integer temp = sortedList.get(j+1);
                    //sortedList.get(j+1) = sortedList.get(j); // po staremu
                    //sortedList.get(j) = temp;                // po staremu
                    sortedList.remove(sortedList.get(j+1));
                    sortedList.add(j,temp);
                }

            }

        }
        return sortedList;

//        return new ArrayList<>();
    }
}
