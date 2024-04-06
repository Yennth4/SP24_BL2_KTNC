package lab.Lab8.P2;

import com.SOF304.yennth.lab.Lab8.P2.Sach;
import com.SOF304.yennth.lab.Lab8.P2.SachService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SachServiceTest {

    private SachService sachService;

    @BeforeEach
    public void setUp() {
        sachService = new SachService();
    }

    @Test
    public void testThemSachValid1() {
        Sach sach = new Sach("01", "Sach1", 300, "TacGia1", 1);
        sachService.addSach(sach);
        assertEquals(1, sachService.getLists().size());
    }

    @Test
    public void testThemSachValid2() {
        Sach sach = new Sach("01", "Sach1", 300, "TacGia1", 1);
        Sach sach2 = new Sach("02", "Sach2", 125, "TacGia2", 3);
        sachService.addSach(sach);
        sachService.addSach(sach2);
        assertEquals(2, sachService.getLists().size());
    }

    @Test
    public void testThemSachInValid3() {
        Sach sach = new Sach("01", "Sach1", 300, "TacGia1", 1);
        Sach sach2 = new Sach("02", "Sach2", 125, "TacGia2", 3);
        sachService.addSach(sach);
        sachService.addSach(sach2);
        assertEquals(1, sachService.getLists().size());
    }

    @Test
    public void testThemSachInValid4() {
        Sach sach = new Sach("01", "Sach1", 300, "TacGia1", 1);
        sachService.addSach(sach);
        assertEquals(0, sachService.getLists().size());
    }

    @Test
    public void testThemSachInValidTenCoChuaKyTuDacBiet5() {
        Sach sach = new Sach("06", "bcvbcvc@!3123", 11, "ABC", 1);
        sachService.addSach(sach);
        assertEquals(1, sachService.getLists().size());
    }

    @Test
    public void testThemSachInValid6() {
        Sach sach = null;
        sachService.addSach(sach);
        assertEquals(1, sachService.getLists().size());
    }

    @Test
    public void testTimSachTheoTacGiaValid7() {
        List<Sach> result = sachService.timSachTheoTacGia("TacGia3");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTimSachTheoTacGiaValid8() {
        sachService.getLists().add(new Sach("1", "Sach1", 12, "TacGia1", 12));
        List<Sach> result = sachService.timSachTheoTacGia("TacGia1");
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
        assertEquals("Sach1", result.get(0).getTen());
    }

    @Test
    public void testTimSachTheoTacGiaInValid9() {
        List<Sach> result = sachService.timSachTheoTacGia("TacGia3");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTimSachTheoTacGiaInValid10() {
        sachService.getLists().add(new Sach("1", "Sach1", 12, "TacGia2", 12));
        sachService.getLists().add(new Sach("2", "Sach2", 22, "TacGia2", 1));
        List<Sach> result = sachService.timSachTheoTacGia("TacGia2");
        assertFalse(result.isEmpty());
        assertEquals(2, result.size());
        for (Sach sach : result) {
            assertEquals("TacGia2", sach.getTenTacGia());
        }
    }

    @Test
    public void testTimSachTheoTacGiaInValid11() {
        Sach sach2 = new Sach("01", "Sach1", 300, "TacGia1", 1);
        sachService.addSach(sach2);
        Sach sach = new Sach("02", "Sach1", 300, "TacGia@", 1);
        sachService.addSach(sach);
        List<Sach> result = sachService.timSachTheoTacGia("TacGia@");
        assertEquals("TacGia@", result);
    }

    @Test
    public void testTimSachTheoTacGiaInValid12() {
        Sach sach2 = new Sach("01", "Sach1", 300, "TacGia1", 1);
        sachService.addSach(sach2);
        Sach sach = new Sach("02", "Sach1", 300, "TacGia2", 1);
        sachService.addSach(sach);
        List<Sach> result = sachService.timSachTheoTacGia(null);
        assertEquals(null, result);
    }
}
