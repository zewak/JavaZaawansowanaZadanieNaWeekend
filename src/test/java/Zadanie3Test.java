import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Zadanie3Test {

    @Test
    public void shouldReturnListWithoutDuplicates() {
        //given
        List<String> names = Arrays.asList("Tomek", "Damian", "Damian", "Kamil", "Karol", "Janusz", "Karol");
        Zadanie3 zadanie3 = new Zadanie3();
        List<String> expectedNames = Arrays.asList("Tomek", "Damian", "Kamil", "Karol", "Janusz");

        //when
        List<String> removedDuplicates = zadanie3.removeDuplicates(names);

        //then
        Assertions.assertEquals(expectedNames, removedDuplicates);
    }
}
