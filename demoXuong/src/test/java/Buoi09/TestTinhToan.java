package Buoi09;

import com.SOF304.yennth.Buoi09.service.TinhToanService;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTinhToan {

    private TinhToanService service;

    @BeforeEach
    private void setUp() {
        service = new TinhToanService();
    }

    @Test
    public void tinhTrungBinhCongValid() {
        Assert.assertEquals(5.0 , service.tinhTrungBinhCong(5.0, 5.0 , 5.0) , 0.1);
    }

    @Test
    public void tinhTrungBinhCongInValid() {
        Assert.assertEquals(4.0 , service.tinhTrungBinhCong(5.0, 5.0 , 5.0) , 0.1);
    }

    @Test
    public void soNguyenDuongNValid() {
        Assert.assertEquals(6 , service.soNguyenDuongN(7));
    }

    @Test
    public void soNguyenDuongNInValid() {
        Assert.assertEquals(6 , service.soNguyenDuongN(-1));
    }
}
