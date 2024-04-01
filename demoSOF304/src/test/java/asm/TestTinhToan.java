package asm;
import com.SOF304.yennth.asm.service.TinhToanService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTinhToan {

    TinhToanService service = new TinhToanService();

    @Test
    public void tinhTong1() {
        assertEquals(15, service.tinhTong( 5, 10));
    }

    @Test
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10 , 10));
    }

    @Test
    public void tinhTong6() {
        assertEquals(15, service.tinhTong(10 , 5));
    }

    @Test
    public void tinhTong7() {
        assertEquals(14, service.tinhTong(10 , 4));
    }

    @Test
    public void tinhTong8() {
        assertEquals(16, service.tinhTong(10 , 6));
    }

    @Test
    public void tinhTong9() {
        assertEquals(19, service.tinhTong(10 , 9));
    }

    @Test
    public void tinhTong10() {
        assertEquals(21, service.tinhTong(10 , 11));
    }

    @Test
    public void tinhTich1() {
        assertEquals(50, service.tinhTich( 5, 10));
    }

    @Test
    public void tinhTich2() {
        assertEquals(40, service.tinhTich(4, 10));
    }

    @Test
    public void tinhTich3() {
        assertEquals(60, service.tinhTich(6, 10));
    }

    @Test
    public void tinhTich4() {
        assertEquals(90, service.tinhTich(9, 10));
    }

    @Test
    public void tinhTich5() {
        assertEquals(100, service.tinhTich(10 , 10));
    }

    @Test
    public void tinhTich6() {
        assertEquals(50, service.tinhTich(10 , 5));
    }

    @Test
    public void tinhTich7() {
        assertEquals(40, service.tinhTich(10 , 4));
    }

    @Test
    public void tinhTich8() {
        assertEquals(60, service.tinhTich(10 , 6));
    }

    @Test
    public void tinhTich9() {
        assertEquals(90, service.tinhTich(10 , 9));
    }

    @Test
    public void tinhTich10() {
        assertEquals(110, service.tinhTich(10 , 11));
    }

    @Test
    public void tinhHieu1() {
        assertEquals(-5, service.tinhHieu( 5, 10));
    }

    @Test
    public void tinhHieu2() {
        assertEquals(-6, service.tinhHieu(4, 10));
    }

    @Test
    public void tinhHieu3() {
        assertEquals(-4, service.tinhHieu(6, 10));
    }

    @Test
    public void tinhHieu4() {
        assertEquals(-1, service.tinhHieu(9, 10));
    }

    @Test
    public void tinhHieu5() {
        assertEquals(0, service.tinhHieu(10 , 10));
    }

    @Test
    public void tinhHieu6() {
        assertEquals(5, service.tinhHieu(10 , 5));
    }

    @Test
    public void tinhHieu7() {
        assertEquals(6, service.tinhHieu(10 , 4));
    }

    @Test
    public void tinhHieu8() {
        assertEquals(4, service.tinhHieu(10 , 6));
    }

    @Test
    public void tinhHieu9() {
        assertEquals(1, service.tinhHieu(10 , 9));
    }

    @Test
    public void tinhHieu10() {
        assertEquals(-1, service.tinhHieu(10 , 11));
    }

    @Test
    public void testAverage() {
        double[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, service.trungBinhCong(numbers), 0.01);
    }

    @Test
    public void testTruyXuat1PhanTu() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, service.truyXuat1PhanTu(arr, 2));
    }
}
