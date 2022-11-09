import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
 * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
 * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
 * <p>
 * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci tablicy int[]
 */

public class Zadanie1 {

    public static void main(String[] args) {
        List<Integer> perfectNumbers = Arrays.asList(6,28,496,812);
        System.out.println(perfectNumbers);
        Zadanie1 zad1 =new Zadanie1();
        System.out.println(zad1.findNPerfectNumbers(4));
    }

    public List<Integer> findNPerfectNumbers(int n) {
      //  List<Integer> perfectNumbers = Arrays.asList(6,28,496,812);
      //  return new ArrayList<>();
        Integer i = 2;
        List<Integer> perfectNumbers = new ArrayList<>();
        while (perfectNumbers.size() < n) {
            //perfectNumbers.add(i);
            if (isPerfect(i))
              perfectNumbers.add(i);
            i++;
        }

        return perfectNumbers;
    }


    public boolean isPerfect(int number) {
          //  int iloczyn = 1;
            int suma = 0;
            for(int i : dzielniki(number))
                suma+= i;

            return suma == number;
        }

    private static List<Integer> dzielniki(int n){ // tworzymy metodę, która zwraca listę dzielników danej liczby(poza nią samą)
        ArrayList<Integer> list = new ArrayList<Integer>(); // korzystamy z ArrayList, która pozwala na dynamiczne dodawanie i usuwanie elementów
        list.add(1); // dzielnikiem każdej liczby jest 1, dodajemy więc od razu do listy
        for(int i = 2; i <= n/2; i++) { // iterujemy przez wszystkie liczby mniejsze lub równe jej połowie (liczby większe od połowy nie będą już dzieliły jej bez reszty)
            if(n % i == 0) { // jeżeli iterowana liczba dzieli n bez reszty
                list.add(i); // to dodajemy do listy
            }
        }
        return list;
    }
}


