import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Zadanie4Test {

    @Test
    public void shouldSortNumbersInTab() {
        //given
        List<Integer> numbers = Arrays.asList(8, 3, 400, 900, 6543, 1, 65, 754, 21, 0);
        List<Integer> expectedNumbers = Arrays.asList(0, 1, 3, 8, 21, 65, 400, 754, 900, 6543);

        //when
        List<Integer> sortedNumbers = Zadanie4.bubbleSort(numbers);

        //then
        Assertions.assertArrayEquals(sortedNumbers.toArray(), expectedNumbers.toArray());
    }
    }

