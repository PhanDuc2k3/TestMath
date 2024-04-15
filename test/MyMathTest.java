import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    
    @Test
    public void testAdd() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, MyMath.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, MyMath.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, MyMath.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            MyMath.divide(6, 0);
        });
    }
}
