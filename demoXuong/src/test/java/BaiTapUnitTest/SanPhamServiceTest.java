package BaiTapUnitTest;

import com.SOF304.yennth.demoXuong.BaiTapUnitTest.SanPham;
import com.SOF304.yennth.demoXuong.BaiTapUnitTest.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SanPhamServiceTest {
    SanPhamService service;
    @BeforeEach
    public void setUp() {
        service = new SanPhamService();
    }

    // Them thanh cong voi soLuong hop le
    @Test
    public void addSanPhamValid() {
        SanPham sanPham1 = new SanPham("1" , "SP1" , "SanPham1" , 100.5f , "Den" , "M" , 30);
        service.addSanPham(sanPham1);
        Assertions.assertEquals(1 , service.getAll().size());
    }

    // Them that bai voi soLuong vuot qua 100
    @Test
    public void addSanPhamInValid() {
        SanPham sanPham2 = new SanPham("2" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 200);
        service.addSanPham(sanPham2);
        Assertions.assertEquals(0 , service.getAll().size());
    }

    // Them that bai voi soLuong hop le nho hon 0
    @Test
    public void updateSanPhamValid() {
        SanPham sanPham1 = new SanPham("2" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 40);
        service.addSanPham(sanPham1);
        SanPham sanPham1new = new SanPham("1" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 40);
        service.updateSanPham("SP2" , sanPham1new);
        SanPham sp = service.getAll().get(0);
        Assertions.assertEquals("1" , sp.getId());
    }

    @Test
    public void updateSanPhamInValid() {
        SanPham sanPham1 = new SanPham("2" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 40);
        service.addSanPham(sanPham1);
        SanPham sanPham1new = new SanPham("2" , "SP2" , "SanPham3" , 100.5f , "Trang" , "M" , 40);
        service.updateSanPham("SP2" , sanPham1new);
        Assertions.assertEquals("1" , service.getAll().get(0));
    }

    @Test
    public void deleteSanPhamValid() {
        SanPham sanPham1 = new SanPham("2" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 40);
        service.addSanPham(sanPham1);
        int sizeBeforeDelete = service.getAll().size();
        service.deleteSanPham("SP2");
        int sizeAfterDelete = service.getAll().size();
        Assertions.assertEquals(sizeBeforeDelete - 1 , sizeAfterDelete);
    }

    @Test
    public void deleteSanPhamInValid() {
        SanPham sanPham1 = new SanPham("2" , "SP2" , "SanPham2" , 100.5f , "Trang" , "M" , 40);
        service.addSanPham(sanPham1);
        int sizeBeforeDelete = service.getAll().size();
        service.deleteSanPham("SP2");
        int sizeAfterDelete = service.getAll().size();
        Assertions.assertEquals(sizeBeforeDelete , sizeAfterDelete);
    }

}