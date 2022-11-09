import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zadanie5Test {

    @Test
    public void shouldReturnTrue_WhileAgeIs18() {
        //given
        int age = 18;
        Zadanie5 zadanie5 = new Zadanie5();

        //when
        boolean result = zadanie5.isAdult(age);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalse_WhileAgeIs17() {
        //given
        int age = 17;
        Zadanie5 zadanie5 = new Zadanie5();

        //when
        boolean result = zadanie5.isAdult(age);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrue_WhileAgeIs100() {
        //given
        int age = 100;
        Zadanie5 zadanie5 = new Zadanie5();

        //when
        boolean result = zadanie5.isAdult(age);

        //then
        Assertions.assertTrue(result);
    }
}
