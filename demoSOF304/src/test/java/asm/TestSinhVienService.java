package asm;
import com.SOF304.yennth.asm.entity.SinhVien;
import com.SOF304.yennth.asm.service.SinhVienService;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSinhVienService {

    SinhVienService service = new SinhVienService();

    @Test
    public void testAddSinhVienIDLa5() {
        SinhVien sv1 = new SinhVien("5", "John Doe 1", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(1, service.getAll().size());
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienIDLa4() {
        SinhVien sv1 = new SinhVien("4", "John Doe 2", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienIDLa6() {
        SinhVien sv1 = new SinhVien("6", "John Doe 3", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienIDLa9() {
        SinhVien sv1 = new SinhVien("9", "John Doe 4", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienIDLa10() {
        SinhVien sv1 = new SinhVien("10", "John Doe 5", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienIDLa11() {
        SinhVien sv1 = new SinhVien("11", "John Doe 6", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienMaLopLa5() {
        SinhVien sv1 = new SinhVien("1", "John Doe 7", "ABC13", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienMaLopLa10() {
        SinhVien sv1 = new SinhVien("2", "John Doe 8", "ABC13ABC13", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienMaSVLa5() {
        SinhVien sv1 = new SinhVien("4", "John Doe 9", "ABC13", "K18", "SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testAddSinhVienMaSVLa10() {
        SinhVien sv1 = new SinhVien("5", "John Doe 10", "ABC13ABC13", "K18", "SV001SV001");
        service.addSinhVien(sv1);
        assertEquals(sv1, service.getAll().get(0));
    }

    @Test
    public void testTenlopContainsSpecialCharacters() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            SinhVien sv = new SinhVien("1", "John Doe", "ABC123", "K18", "SV001");
        });
    }

    @Test
    public void testSearchByMaSVValid() {
        SinhVien sv1 = new SinhVien("1", "John Doe", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);

        SinhVien sv2 = new SinhVien("2", "Jane Doe", "DEF456", "K19", "SV002");
        service.addSinhVien(sv2);
        List<SinhVien> result = service.searchByMaSV("SV001");
        assertEquals(1, result.size());
        assertEquals(sv1, result.get(0));
    }

    @Test
    public void testSearchByMaSVNotFound() {
        SinhVien sv1 = new SinhVien("1", "John Doe", "ABC123", "K18", "SV001");
        service.addSinhVien(sv1);
        List<SinhVien> result = service.searchByMaSV("SV002");
        assertEquals(0, result.size());
    }

    @Test
    public void testSearchByMaSVLa5() {
        SinhVien sv1 = new SinhVien("1", "John Doe", "ABC123", "K18", "SV123");
        service.addSinhVien(sv1);

        SinhVien sv2 = new SinhVien("2", "Jane Doe", "DEF456", "K19", "SV002");
        service.addSinhVien(sv2);

        List<SinhVien> result = service.searchByMaSV("SV123");
        assertEquals(1, result.size());
        assertEquals(sv1, result.get(0));
    }

    @Test
    public void testSearchByMaSVLa6() {
        SinhVien sv1 = new SinhVien("1", "John Doe", "ABC123", "K18", "SV1234");
        service.addSinhVien(sv1);

        SinhVien sv2 = new SinhVien("2", "Jane Doe", "DEF456", "K19", "SV002");
        service.addSinhVien(sv2);

        List<SinhVien> result = service.searchByMaSV("SV1234");
        assertEquals(1, result.size());
        assertEquals(sv1, result.get(0));
    }

    @Test
    public void testSearchByMaSVLa10() {
        SinhVien sv1 = new SinhVien("1", "John Doe", "ABC123", "K18", "SV12345678");
        service.addSinhVien(sv1);

        SinhVien sv2 = new SinhVien("2", "Jane Doe", "DEF456", "K19", "SV002");
        service.addSinhVien(sv2);

        List<SinhVien> result = service.searchByMaSV("SV12345678");
        assertEquals(1, result.size());
        assertEquals(sv1, result.get(0));
    }
}
