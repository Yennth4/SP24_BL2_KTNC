package Buoi8;

import com.SOF304.yennth.Buoi8.enity.SinhVien;
import com.SOF304.yennth.Buoi8.service.SinhVienService;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * Phan vung tuong duong 5 unit test cho ADD , DELETE
 */
public class TestSinhVienService {

    private SinhVienService listSV = new SinhVienService();

    @Test
    public void addSinhVienValid() {
        SinhVien sinhVien = new SinhVien("3" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        Assert.assertEquals(1 , listSV.getAll().size());
    }

    @Test
    public void addSinhVienValid2() {
        SinhVien sinhVien = new SinhVien("5" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        Assert.assertEquals(1 , listSV.getAll().size());
    }
    @Test
    public void addSinhVienValid3() {
        SinhVien sinhVien = new SinhVien("8" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        Assert.assertEquals(1 , listSV.getAll().size());
    }
    @Test
    public void addSinhVienValid4() {
        SinhVien sinhVien = new SinhVien("15" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        Assert.assertEquals(1 , listSV.getAll().size());
    }
    @Test
    public void addSinhVienValid5() {
        SinhVien sinhVien = new SinhVien("20" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        Assert.assertEquals(1 , listSV.getAll().size());
    }

    @Test
    public void deleteSinhVienValid() {
        SinhVien sinhVien = new SinhVien("1" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        listSV.deleteSinhVien("1");
        Assert.assertEquals(0 , listSV.getAll().size());
    }

    @Test
    public void deleteSinhVienValid2() {
        SinhVien sinhVien = new SinhVien("3" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        listSV.deleteSinhVien("3");
        Assert.assertEquals(0 , listSV.getAll().size());
    }

    @Test
    public void deleteSinhVienValid3() {
        SinhVien sinhVien = new SinhVien("5" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        listSV.deleteSinhVien("5");
        Assert.assertEquals(0 , listSV.getAll().size());
    }

    @Test
    public void deleteSinhVienValid4() {
        SinhVien sinhVien = new SinhVien("8" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        listSV.deleteSinhVien("8");
        Assert.assertEquals(0 , listSV.getAll().size());
    }

    @Test
    public void deleteSinhVienValid5() {
        SinhVien sinhVien = new SinhVien("15" , "Nguyen Hai Yen" , 1 , "yen@gmail.com");
        listSV.addSinhVien(sinhVien);
        listSV.deleteSinhVien("15");
        Assert.assertEquals(0 , listSV.getAll().size());
    }

}
