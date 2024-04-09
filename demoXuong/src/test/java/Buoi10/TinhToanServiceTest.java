package Buoi10;

import com.SOF304.yennth.Buoi10.service.TinhToanService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TinhToanServiceTest {

    TinhToanService service;

    @BeforeEach
    public void setUp() {
        service = new TinhToanService();
    }

    @Test
    public void tinhTrungBinhValid1() {
        Assert.assertEquals(5.0, service.trungBinhCong(5.0, 5.0, 5.0), 1.0);
    }

    @Test
    public void tinhTrungBinhValid2() {
        Assert.assertEquals(6.0, service.trungBinhCong(6.0, 6.0, 6.0), 1.0);
    }

    @Test
    public void tinhTrungBinhValid3() {
        Assert.assertEquals(9.0, service.trungBinhCong(9.0, 9.0, 9.0), 1.0);
    }

    @Test
    public void tinhTrungBinhInValid4() {
        Assert.assertEquals(0.0, service.trungBinhCong(-1.0, 5.0, 5.0), 1.0);
        Assert.assertThrows(ArithmeticException.class, () -> {
            service.trungBinhCong(-1.0, 5.0, 5.0);
        });
    }

    @Test
    public void tinhTrungBinhValid5() {
        Assert.assertEquals(1.0, service.trungBinhCong(11.0, 11.0, 11.0), 1.0);
        Assert.assertThrows(ArithmeticException.class, () -> {
            service.trungBinhCong(11.0, 11.0, 11.0);
        });

    }

    @Test
    public void tinhThuongValid1() {
        Assert.assertEquals(0.5, service.tinhThuong(1, 2), 1.0);
    }

    @Test
    public void tinhThuongValid2() {
        Assert.assertEquals(0, service.tinhThuong(0, 2), 1.0);
    }

    @Test
    public void tinhThuongInValid3() {
        Assert.assertEquals(0.5, service.tinhThuong(-1, 2), 1.0);
    }

    @Test
    public void tinhThuongValid4() {
        Assert.assertEquals(-1.0, service.tinhThuong(1, -1), 1.0);
    }

    @Test
    public void tinhThuongInValid5() {
        Assert.assertEquals(0.5, service.tinhThuong(1, 0), 1.0);
        Assert.assertThrows(ArithmeticException.class, () -> {
            service.tinhThuong(1, 0);
        });

    }

}
