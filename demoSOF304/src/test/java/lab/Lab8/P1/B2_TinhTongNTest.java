package lab.Lab8.P1;

import com.SOF304.yennth.lab.Lab8.P1.B1_TrungBinhCong;
import com.SOF304.yennth.lab.Lab8.P1.B2_TinhTongN;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class B2_TinhTongNTest {

    private B2_TinhTongN tinhTongN = new B2_TinhTongN();

    @BeforeEach
    public void setUp() {
        tinhTongN = new B2_TinhTongN();
    }

    @Test
    public void testSumValid1() {
        assertEquals(15, tinhTongN.sumUpToN(5));
    }

    @Test
    public void testSumValid2() {
        assertEquals(0, tinhTongN.sumUpToN(0));
    }

    @Test
    public void testSumValid3() {
        assertEquals(500500, tinhTongN.sumUpToN(1000));
    }

    @Test
    public void testSumValid4() {
        assertEquals(1, tinhTongN.sumUpToN(1));
    }

    @Test
    public void testSumValid5() {
        assertEquals(36, tinhTongN.sumUpToN(8));
    }

    @Test
    public void testSumValid6() {
        assertEquals(45, tinhTongN.sumUpToN(9));
    }

    @Test
    public void testSumValid7() {
        assertEquals(28, tinhTongN.sumUpToN(7));
    }

    @Test
    public void testSumValid8() {
        assertEquals(3, tinhTongN.sumUpToN(2));
    }

    @Test
    public void testSumInValid9() {
        assertEquals(3, tinhTongN.sumUpToN(-1));
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongN.sumUpToN(-1);
        });
    }

    @Test
    public void testSumInValid10() {
        assertEquals(3, tinhTongN.sumUpToN(-100000));
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongN.sumUpToN(-100000);
        });

    }


}
