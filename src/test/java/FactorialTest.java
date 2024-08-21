import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(120, Main.calculateFactorial(5));
        assertEquals(1, Main.calculateFactorial(0));
        assertEquals(1, Main.calculateFactorial(1));
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateFactorial(-5);
        });

        String expectedMessage = "Number must be non-negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
