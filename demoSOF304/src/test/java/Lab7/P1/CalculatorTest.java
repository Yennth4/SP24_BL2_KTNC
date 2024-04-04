package Lab7.P1;

import com.SOF304.yennth.lab.Lab7.P1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Bai 1
    @Test
    public void divideValid1() {
        int kq = calculator.divide(6, 3);
        assertEquals(2, kq );
    }

    @Test
    public void divideValid2() {
        int kq = calculator.divide(-6, -3);
        assertEquals(2, kq );
    }

    @Test
    public void divideValid3() {
        int kq = calculator.divide(-6, 3);
        assertEquals(-2, kq );
    }

    @Test
    public void divideValid4() {
        // Nem ra ngoai le
        assertEquals(0 , calculator.divide(6, 0));
        assertThrows(ArithmeticException.class , () -> {
            calculator.divide(6, 0);
        });
    }

    @Test
    public void divideValid5() {
        int kq = calculator.divide(0, 5);
        assertEquals(0, kq );
    }

    // Bai 2
    @Test
    public void multiplyValid1() {
        int kq = calculator.multiply(4, 5);
        assertEquals(20, kq );
    }
    @Test
    public void multiplyValid2() {
        int kq = calculator.multiply(-3, 5);
        assertEquals(-15, kq );
    }
    @Test
    public void multiplyValid3() {
        int kq = calculator.multiply(0, 7);
        assertEquals(0, kq );
    }

    @Test
    public void multiplyValid4() {
        int kq = calculator.multiply(0, 0);
        assertEquals(0, kq );
    }

    @Test
    public void multiplyValid5() {
        int kq = calculator.multiply(5, -7);
        assertEquals(-35, kq );
    }

}
