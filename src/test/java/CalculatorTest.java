import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator(1, 1);

    @Test
    void addition() {
        // Tak to powinno wyglądać
        // Given
        int a = 1;
        int b = 1;

        // When
        final int result = calculator.add(a, b);

        // Then
        assertEquals(2, result);
    }

    @Test
    void substraction() {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    void substractionNotEqials() {
        assertNotEquals(3, calculator.subtract(2, 1));
    }

    @Test
    void multiplication() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    void division() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    @DisplayName(" dzielenie przez 0")
    void divisionByZero() {
        Exception e = assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
        assertEquals("Dzielenie przez 0", e.getMessage());
    }

    @Test
    void arrayTest() {
        // given
        int[] testArray = {1, 2, 3, 4, 5};

        // when
        int[] result = calculator.array;

        // then
        assertArrayEquals(testArray, result);
    }


    @BeforeEach
    void setup() {
        System.out.println("test start");
    }


}
