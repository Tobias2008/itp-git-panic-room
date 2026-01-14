
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void divide_works2() {
        assertEquals(15, Calculator.divide(150, 10));
    }

    @Test
    void divide_by_Zero_works() {
        assertEquals(null, Calculator.divide(150, 0));
    }
}
