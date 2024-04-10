package Buoi11;
import com.SOF304.yennth.Buoi11.service.TinhToanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TinhToanServiceTest {

    TinhToanService checker = new TinhToanService();

    @Test
    public void testNumber() {
        assertTrue(checker.checkNumber(5));
        assertTrue(checker.checkNumber(0));
        assertFalse(checker.checkNumber(-5));
    }

    @Test
    public void testDiemTBValid() {
        assertTrue(checker.checkDiemTB(4));
        assertTrue(checker.checkDiemTB(5));
        assertTrue(checker.checkDiemTB(6));
        assertTrue(checker.checkDiemTB(7));
        assertTrue(checker.checkDiemTB(8));
        assertTrue(checker.checkDiemTB(9));
        assertTrue(checker.checkDiemTB(10));
    }

    @Test
    public void testDiemTBInValid() {
        assertTrue(checker.checkDiemTB(-1));
        assertTrue(checker.checkDiemTB(11));
    }
}
