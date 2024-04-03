package Buoi8;
import com.SOF304.yennth.Buoi8.service.TinhToanService;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestTinhToanService {

    TinhToanService service = new TinhToanService();

    @Test()
    public void phepTruValid() {
        Assert.assertEquals(1 , service.tinhHieu(3,2));
    }

    @Test
    public void phepChiaValid() {
        Assert.assertEquals(3 , service.tinhChia(3,1));
    }

    @Test
    public void phepChiaInValid() {
        // Nem ra ngoai le
        service.tinhChia(3,0);
    }

    @Test
    public void testXepLoaiDiem_F() {
        Assert.assertEquals("F", service.xepLoaiDiem(0));
        Assert.assertEquals("F", service.xepLoaiDiem(20));
        Assert.assertEquals("F", service.xepLoaiDiem(40));
    }

    @Test
    public void testXepLoaiDiem_B() {
        Assert.assertEquals("B", service.xepLoaiDiem(41));
        Assert.assertEquals("B", service.xepLoaiDiem(60));
        Assert.assertEquals("B", service.xepLoaiDiem(70));
    }

    @Test
    public void testXepLoaiDiem_A() {
        Assert.assertEquals("A", service.xepLoaiDiem(71));
        Assert.assertEquals("A", service.xepLoaiDiem(90));
        Assert.assertEquals("A", service.xepLoaiDiem(100));
    }

    @Test()
    public void testXepLoaiDiemInvalidScore() {
        // Nem ra ngoai le
        service.xepLoaiDiem(-10);
    }

    @Test
    public void testTinhTrungBinhCongValid() {
        Assert.assertEquals(5.0, service.tinhTrungBinhCong(5, 5, 5));
    }

    @Test
    public void testTinhTongTu1DenN() {
        Assert.assertEquals(15, service.tinhTongTu1DenN(5));
    }
}
