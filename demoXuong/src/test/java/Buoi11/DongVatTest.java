package Buoi11;
import com.SOF304.yennth.Buoi11.entity.DongVat;
import com.SOF304.yennth.Buoi11.service.DongVarService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DongVatTest {

    DongVarService list;

    @BeforeEach
    public void setUp() {
        list = new DongVarService();
    }

    @Test
    public void themValid() {
        DongVat dongVatNew = new DongVat("DV3", "Mao", "Meo", 10.0, "Nha", 10d);
        list.them(dongVatNew);
        Assert.assertEquals(3, list.getAll().size());
    }

    @Test
    public void themInValid1() {
        DongVat dongVatNew = new DongVat("DV1", "Mao", "Meo", 101.0, "Nha", 10d);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            list.them(dongVatNew);
        });
    }

    @Test
    public void themInValid2() {
        DongVat dongVatNew = new DongVat("DV1", "Mao", "Meo", 10.0, "Nha", 101d);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            list.them(dongVatNew);
        });
    }

    @Test
    public void themInValid3() {
        DongVat dongVatNew = new DongVat("DV1", "Mao", "Meo", -1.0, "Nha", 10d);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            list.them(dongVatNew);
        });
    }

    @Test
    public void themInValid4() {
        DongVat dongVatNew = new DongVat("DV1", "Mao", "Meo", 10.0, "Nha", -1.0);
        Assert.assertThrows(IllegalArgumentException.class , () -> {
            list.them(dongVatNew);
        });    }

    @Test
    public void suaValid() {
        DongVat dongVatNew = new DongVat("DV1", "Meoo", "Meo", 10.0, "Nha", 10d);
        list.sua(dongVatNew);
        Assert.assertEquals("Meoo", list.getAll().get(0).getTen());
    }

    @Test
    public void xoaValid() {
        DongVat dongVatNew = new DongVat("DV3", "Meoo 1", "Meo", 10.0, "Nha", 10d);
        list.them(dongVatNew);
        list.xoa(dongVatNew);
        Assert.assertEquals(2, list.getAll().size());
    }
}
