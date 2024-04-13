import com.yennth.PH31906_13042024_Final.TinhToanService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TinhToanTest {

    TinhToanService service = new TinhToanService();

    @Test
    public void tinhToanInValid() {
        Assert.assertTrue(service.kiemTraSoNhap(10));
    }

    @Test
    public void tinhToanInValid2() {
        Assert.assertTrue(service.kiemTraSoNhap(5));
    }

    @Test
    public void tinhToanValid3() {
        Assert.assertTrue(service.kiemTraSoNhap(15));
    }

    @Test
    public void tinhToanInValid4() {
        Assert.assertTrue(service.kiemTraSoNhap(20));
    }

    @Test
    public void tinhToanValid5() {
        Assert.assertTrue(service.kiemTraSoNhap(25));
    }

    @Test
    public void isSoSanhValid() {
        Assert.assertEquals(3 , service.soNguyenBeNhat(3 , 4, 5));
    }

    @Test
    public void isSoSanhValid2() {
        Assert.assertEquals(3 , service.soNguyenBeNhat(3 , 5, 4));
    }

    @Test
    public void isSoSanhValid3() {
        Assert.assertEquals(4 , service.soNguyenBeNhat(6 , 4, 7));
    }

    @Test
    public void isSoSanhValid4() {
        Assert.assertEquals(6 , service.soNguyenBeNhat(7 , 9, 6));
    }

    @Test
    public void isSoSanhValid5() {
        Assert.assertEquals(6 , service.soNguyenBeNhat(6, 6, 8));
    }
}
