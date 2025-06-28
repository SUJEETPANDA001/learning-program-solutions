import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(3, 5));
        assertEquals(-2, calculator.add(4, -6));
    }

    @Test
    public void testSubtract() {
        assertEquals(7, calculator.subtract(10, 3));
        assertEquals(-15, calculator.subtract(5, 20));
    }

    @Test
    public void testMultiply() {
        assertEquals(30, calculator.multiply(5, 6));
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
