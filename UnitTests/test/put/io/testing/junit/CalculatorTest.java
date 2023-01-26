package put.io.testing.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;

    @BeforeAll
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void testAdd() {
        int result1 = cal.add(2, 3);
        int result2 = cal.add(5, 7);
        assertEquals(5, result1);
        assertEquals(12, result2);
    }

    @Test
    public void testMultiply() {
        int result1 = cal.multiply(2, 3);
        int result2 = cal.multiply(5, 7);
        assertEquals(6, result1);
        assertEquals(35, result2);
    }

    @Test
    public void testAddPositiveNumbers() {
        int result1 = cal.addPositiveNumbers(7, 5);
        assertEquals(12, result1);
        assertThrows(IllegalArgumentException.class, () -> cal.addPositiveNumbers(-2, 3));
    }

}