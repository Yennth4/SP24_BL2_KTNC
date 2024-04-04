package Buoi09;

import com.SOF304.yennth.Buoi09.entity.XeOTO;
import com.SOF304.yennth.Buoi09.service.XeOTOService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOtoService {

    private XeOTOService listXe;

    @BeforeEach
    public void setUp() {
        listXe = new XeOTOService();
    }

    @Test
    public void addXeValid() {
        // Ten xe khong chua ki tu dac biet
        XeOTO xeOto = new XeOTO(1, "KIA Cerato", "KIA", "Cerato", 50000.0, 10, 2022, "Black");
        listXe.addXe(xeOto);
        assertEquals(1, listXe.getAll().size());
    }

    @Test
    public void addXeInValid() {
        // Ten xe khong chua ki tu dac biet
        XeOTO xeOto = new XeOTO(1, "@Toyota", "KIA", "Cerato", 50000.0, 10, 2022, "Black");

        Assert.assertThrows(IllegalArgumentException.class , () -> {
            listXe.addXe(xeOto);
        });
    }

    @Test
    public void searchTenXeValid() {
        XeOTO xeOto = new XeOTO(1, "KIA", "KIA 1", "Cerato", 50000.0, 10, 2022, "Black");
        XeOTO xeOto2 = new XeOTO(2, "KIA", "KIA 2", "Cerato", 50000.0, 10, 2022, "Black");
        listXe.addXe(xeOto);
        listXe.addXe(xeOto2);
        assertEquals(2, listXe.searchTenXe("KIA").size());
    }

    @Test
    public void searchTenXeInValid() {
        XeOTO xeOto = new XeOTO(1, "KIA", "KIA 1", "Cerato", 50000.0, 10, 2022, "Black");
        XeOTO xeOto2 = new XeOTO(2, "KIA", "KIA 2", "Cerato", 50000.0, 10, 2022, "Black");
        listXe.addXe(xeOto);
        listXe.addXe(xeOto2);
        assertEquals(2, listXe.searchTenXe("Toyota").size());
    }

    @Test
    public void searchHangXeValid() {
        XeOTO xeOto = new XeOTO(1, "KIA 1", "KIA", "Cerato", 50000.0, 10, 2022, "Black");
        XeOTO xeOto2 = new XeOTO(2, "KIA 2", "KIA", "Cerato", 50000.0, 10, 2022, "Black");
        listXe.addXe(xeOto);
        listXe.addXe(xeOto2);
        assertEquals(2, listXe.searchHangXe("KIA").size());
    }

    @Test
    public void searchHangXeInValid() {
        XeOTO xeOto = new XeOTO(1, "KIA 1", "KIA", "Cerato", 50000.0, 10, 2022, "Black");
        XeOTO xeOto2 = new XeOTO(2, "KIA 2", "KIA", "Cerato", 50000.0, 10, 2022, "Black");
        listXe.addXe(xeOto);
        listXe.addXe(xeOto2);
        assertEquals(2, listXe.searchHangXe("Toyota").size());
    }
}
