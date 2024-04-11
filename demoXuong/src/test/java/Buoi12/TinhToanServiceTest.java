package Buoi12;

import com.SOF304.yennth.Buoi12.service.TinhToanService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TinhToanServiceTest {
    TinhToanService list;
    List<Integer> soNguyenAm;

    @BeforeEach
    public void setUp() {
        list = new TinhToanService();
    }

    @Test
    public void isTongSoChanValid() {
        Assert.assertEquals(6.0, list.tongSoChan(2.0, 4.0), 1.0);
    }

    @Test
    public void isTongSoChanInValid() {
        Assert.assertEquals(6.0, list.tongSoChan(2.1, 4.1), 1.0);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            list.tongSoChan(2.1, 4.1);
        });
    }

    @Test
    public void isSoNguyenAmValid() {
        int[] lists = {-5, 6, -7};
        soNguyenAm = list.isSoNguyenAm(lists);
        Assert.assertEquals(2, soNguyenAm.size());
    }

}
