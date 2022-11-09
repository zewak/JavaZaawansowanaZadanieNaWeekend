import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Zadanie1Test {

    @Test
    public void shouldFindFirst4PerfectNumbers() {
        //given
        int numberOfPerfectNumbersToFind = 4;
        Zadanie1 zadanie1 = new Zadanie1();

        //when
        List<Integer> perfectNumbers = zadanie1.findNPerfectNumbers(numberOfPerfectNumbersToFind);

        //then
        Assertions.assertEquals(perfectNumbers.get(0), 6);
        Assertions.assertEquals(perfectNumbers.get(1), 28);
        Assertions.assertEquals(perfectNumbers.get(2), 496);
        Assertions.assertEquals(perfectNumbers.get(3), 812);
    }
}
