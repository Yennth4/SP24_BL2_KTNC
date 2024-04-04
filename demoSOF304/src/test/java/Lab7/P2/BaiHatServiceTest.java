package Lab7.P2;


import com.SOF304.yennth.lab.Lab7.P2.BaiHat;
import com.SOF304.yennth.lab.Lab7.P2.BaiHatService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaiHatServiceTest {
    private BaiHatService baiHatService = new BaiHatService();

    @Test
    public void testAddValid1() {
        BaiHat bh = new BaiHat("1", "Bai1", "casi1", 200, "nhacsi1");
        baiHatService.add(bh);
        assertEquals(1, baiHatService.getAll().size());
    }

    @Test
    public void testAddInValid2() {
        BaiHat bh2 = new BaiHat("2", "Bai2", "casi2", -100, "nhacsi2");
        baiHatService.add(bh2);
        assertEquals(0, baiHatService.getAll().size());
    }

    @Test
    public void testAddValid3() {
        BaiHat baiHat1 = new BaiHat("3", "Bai3", "casi3", 300, "nhacsi3");
        BaiHat baiHat2 = new BaiHat("4", "Bai4", "casi4", 400, "nhacsi4");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        assertEquals(2, baiHatService.getAll().size());
    }

    @Test
    public void testAddInValid4() {
        BaiHat baiHat1 = new BaiHat("5", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("5", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        assertEquals(1, baiHatService.getAll().size());
    }

    @Test
    public void testAddInValid5() {
//        Nem ra ngoai le phai la so nguyen duong
        BaiHat bh = new BaiHat("1", "Bai1", "casi1", -1, "nhacsi1");
        baiHatService.add(bh);
        assertEquals(1, baiHatService.getAll().size());
        assertThrows(IllegalArgumentException.class , () -> {
            baiHatService.add(new BaiHat("1", "Bai1", "casi1", -1, "nhacsi1"));
        });
    }

    //Delte xóa
    @Test
    public void testDeleteValid7() {
        BaiHat baiHat1 = new BaiHat("1", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("2", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        baiHatService.delete("1");
        assertEquals(1, baiHatService.getAll().size());
    }
    @Test
    public void testDeleteInValid8() {
        BaiHat baiHat1 = new BaiHat("1", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("2", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        baiHatService.delete("3");
        assertEquals(1, baiHatService.getAll().size());

    }
    @Test
    public void testDeleteInValid9() {
        BaiHat baiHat1 = new BaiHat("1", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("2", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        baiHatService.delete("-1");
        assertEquals(1, baiHatService.getAll().size());
    }
    @Test
    public void testDeletedValid10() {
        BaiHat baiHat1 = new BaiHat("1", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("2", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        baiHatService.delete("1");
        assertEquals(0, baiHatService.getAll().size());
    }

    @Test
    public void testDelete11Valid() {
        BaiHat baiHat1 = new BaiHat("1", "Bai5", "casi5", 500, "nhacsi5");
        BaiHat baiHat2 = new BaiHat("2", "Bai6", "casi6", 600, "nhacsi6");
        baiHatService.add(baiHat1);
        baiHatService.add(baiHat2);
        baiHatService.delete("1");
        baiHatService.delete("2");
        assertEquals(0, baiHatService.getAll().size());
    }


}
