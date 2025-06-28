import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testBasicAssertions() {
        assertEquals(10, 5 + 5);
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        assertTrue(10 > 5);
        assertFalse(5 > 10);
        assertNull(null);
        assertNotNull(new Object());

        String s1 = "hello";
        String s2 = "hello";
        assertSame(s1, s2);
    }

    @Test
    public void testAdvancedAssertions() {
        assertEquals(0.333, 1.0/3.0, 0.001);
        try {
            int result = 10 / 0;
            fail("Should have thrown ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
}
