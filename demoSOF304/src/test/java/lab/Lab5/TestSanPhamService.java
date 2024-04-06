package lab.Lab5;

import com.SOF304.yennth.lab.Lab5.entity.SanPham;
import com.SOF304.yennth.lab.Lab5.service.SanPhamService;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestSanPhamService {
    SanPhamService list = new SanPhamService();

    @Test
    public void addValid() {
        SanPham sanPham = new SanPham("1" , "SP1" , "San Pham 1" , 100f , "Xanh" , "L" , 99 );
        list.addSanPham(sanPham);
        Assert.assertEquals(1 , list.getAll().size());
    }

    @Test
    public void addInValid() {
        SanPham sanPham = new SanPham("1" , "SP1" , "San Pham 1" , 100f , "Xanh" , "L" , 101 );
        list.addSanPham(sanPham);
        Assert.assertEquals(1 , list.getAll().size());
    }

    @Test
    public void updateValid() {
        SanPham sanPham = new SanPham("1" , "SP1" , "San Pham 1" , 100f , "Xanh" , "L" , 99 );
        list.addSanPham(sanPham);

        SanPham sanPham1 = new SanPham("1" , "SP2" , "San Pham 2" , 100f , "Xanh" , "L" , 99 );
        list.updateSanPham(sanPham1 , "1");
        Assert.assertEquals("SP2" , list.getAll().get(0).getMaSanPham());
    }

    @Test
    public void updateInValidTrungMa() {
        SanPham sanPham = new SanPham("1" , "SP1" , "San Pham 1" , 100f , "Xanh" , "L" , 99 );
        list.addSanPham(sanPham);

        SanPham sanPham1 = new SanPham("1" , "SP1" , "San Pham 2" , 100f , "Xanh" , "L" , 99 );
        list.updateSanPham(sanPham1 , "1");
        Assert.assertEquals("SP1" , list.getAll().get(0).getMaSanPham());
    }

    @Test
    public void updateInValidSP() {
        SanPham sanPham = new SanPham("1" , "SP1" , "San Pham 1" , 100f , "Xanh" , "L" , 99 );
        list.addSanPham(sanPham);

        SanPham sanPham1 = new SanPham("1" , "2" , "San Pham 2" , 100f , "Xanh" , "L" , 99 );
        list.updateSanPham(sanPham1 , "1");
        Assert.assertEquals("2" , list.getAll().get(0).getMaSanPham());
    }
}
