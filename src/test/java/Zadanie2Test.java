import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zadanie2Test {

    @Test
    public void shouldFindComplementaryChain() {
        //given
        String dnaChain = "GAGAAACGGGA";
        Zadanie2 zadanie2 = new Zadanie2();
        String expectedChain = "nie wiem o co chodzi";

        //when
        String complementaryChain = zadanie2.findComplementaryChain(dnaChain);

        //then
        Assertions.assertEquals(expectedChain, complementaryChain);
    }
}
