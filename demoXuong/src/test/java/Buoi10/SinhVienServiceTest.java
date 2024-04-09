package Buoi10;

import com.SOF304.yennth.Buoi10.entity.SinhVien;
import com.SOF304.yennth.Buoi10.service.SinhVienService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SinhVienServiceTest {

    SinhVienService sinhVienService;
    List<SinhVien> listSinhVien;

    @BeforeEach
    public void setUp() {
        sinhVienService = new SinhVienService();
        listSinhVien = sinhVienService.getAll();
    }

    @Test
    public void themSinhVienValid() {
        // KQ mong muon
        int kqMongMuon = 4;

        // KQ thuc te
        SinhVien sinhVienMoi = new SinhVien("SV4", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        int kqThucTe = listSinhVien.size();
        Assert.assertEquals(kqMongMuon, kqThucTe);
    }

    @Test
    public void themSinhVienValid2() {
        SinhVien sinhVienMoi = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(4, listSinhVien.size());
    }

    @Test
    public void themSinhVienValid3() {
        SinhVien sinhVienMoi = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        SinhVien sinhVienMoi2 = new SinhVien("SV8", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        sinhVienService.themSinhVien(sinhVienMoi2);
        Assert.assertEquals(5, listSinhVien.size());
    }

    @Test
    public void themSinhVienInValid4() {
        // Fail
        SinhVien sinhVienMoi = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        SinhVien sinhVienMoi2 = new SinhVien("SV8", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        sinhVienService.themSinhVien(sinhVienMoi2);
        Assert.assertEquals(4, listSinhVien.size());
    }

    @Test
    public void themSinhVienInValid5() {
        // Fail
        SinhVien sinhVienMoi = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(5, listSinhVien.size());
    }

    // Bat ngoai le
    @Test
    public void themSinhVienInValid6() {
        // Ma trung
        SinhVien sinhVienMoi = new SinhVien("SV1", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(4, listSinhVien.size());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.themSinhVien(new SinhVien("SV1", "Nguyen Hai Yen", 24, 10f, 5, "CNTT"));
        });
    }

    @Test
    public void themSinhVienInValid7() {
        // Tuoi khong hop le
        SinhVien sinhVienMoi = new SinhVien("SV5", "Nguyen Hai Yen", 13, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(4, listSinhVien.size());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.themSinhVien(new SinhVien("SV5", "Nguyen Hai Yen", 13, 10f, 5, "PTPM"));
        });
    }

    @Test
    public void themSinhVienInValid8() {
        // Tuoi khong hop le  , tuoi > 100
        SinhVien sinhVienMoi = new SinhVien("SV5", "Nguyen Hai Yen", 101, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(4, listSinhVien.size());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.themSinhVien(new SinhVien("SV5", "Nguyen Hai Yen", 101, 10f, 5, "PTPM"));
        });
    }

    @Test
    public void themSinhVienInValid9() {
        // Chuyen Nganh khong hop le
        SinhVien sinhVienMoi = new SinhVien("SV6", "Nguyen Hai Yen", 18, 10f, 5, "CNTT");
        sinhVienService.themSinhVien(sinhVienMoi);
        Assert.assertEquals(4, listSinhVien.size());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.themSinhVien(new SinhVien("SV6", "Nguyen Hai Yen", 18, 10f, 5, "CNTT"));
        });
    }

    @Test
    public void suaSinhVienValid() {
        SinhVien sinhVienCu = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienCu);

        SinhVien sinhVienMoi = new SinhVien("SV7", "Nguyen Hai Yen", 28, 10f, 5, "PTPM");
        sinhVienService.suaSinhVien(sinhVienMoi);
        Assert.assertEquals(28, listSinhVien.get(3).getTuoi());
    }

    @Test
    public void xoaSinhVienValid() {
        SinhVien sinhVienCu = new SinhVien("SV7", "Nguyen Hai Yen", 24, 10f, 5, "PTPM");
        sinhVienService.themSinhVien(sinhVienCu);
        sinhVienService.xoaSinhVien("SV7");
        Assert.assertEquals(3, listSinhVien.size());
    }
}
