package Buoi12;

import com.SOF304.yennth.Buoi12.entity.NhanVien;
import com.SOF304.yennth.Buoi12.service.NhanVienService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NhanVienServiceTest {

    NhanVienService list;
    NhanVien nhanVien;

    @BeforeEach
    public void setUp() {
        list = new NhanVienService();
    }

    @Test
    public void themValid() {
        nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen" , "yen@gmail.com" , "HN" , "Giam doc" , 100000);
        list.them(nhanVien);
        Assert.assertEquals(2, list.getAll().size());
    }

    @Test
    public void suaValid() {
        nhanVien = new NhanVien("NV1" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , 100);
        list.sua(nhanVien);
        Assert.assertEquals("Nguyen Hai Yen 2", list.getAll().get(0).getTen());
    }

    @Test
    public void xoaValid() {
        nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , 100000);
        list.them(nhanVien);
        list.xoa(nhanVien);
        Assert.assertEquals(1, list.getAll().size());
    }

    @Test
    public void xoaInValid1() {
//        nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , -1);
//        list.them(nhanVien);
//        list.xoa(nhanVien);
//        Assert.assertEquals(1, list.getAll().size());
        Assert.assertThrows(IllegalArgumentException.class , () -> {
            nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , -1);
            list.them(nhanVien);
            list.xoa(nhanVien);
        });
    }

    @Test
    public void xoaInValid2() {
        nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , 50000001);
        list.them(nhanVien);
        list.xoa(nhanVien);
        Assert.assertEquals(1, list.getAll().size());
        Assert.assertThrows(IllegalArgumentException.class , () -> {
            nhanVien = new NhanVien("NV2" , "Nguyen Hai Yen 2" , "yen@gmail.com" , "HN" , "Giam doc" , -1);
            list.them(nhanVien);
            list.xoa(nhanVien);
        });
    }
}
