package Buoi08;

import com.SOF304.yennth.Buoi08.service.SanPhamService;
import com.SOF304.yennth.Buoi08.entity.SanPham;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SanPhamServiceTest {

    private SanPhamService service;

    @BeforeEach
    public void setUp() {
        service = new SanPhamService();
        service.addSanPham(new SanPham("1", "MXSP1", "SanPham 1", "Xanh", "L", "Duoi ca", 200d, 100));
        service.addSanPham(new SanPham("2", "MXSP2", "SanPham 2", "Do", "XXL", "Duoi ca 1", 100d, 100));
    }

    @Test
    public void testAddValidSanPham() {
        SanPham sanPham = new SanPham("3", "MXSP3", "SanPham 3", "Xanh", "XL", "Duoi ca 2", 150d, 50);
        service.addSanPham(sanPham);
        List<SanPham> list = service.getAll();
        Assert.assertEquals(3, list.size());
        Assert.assertTrue(list.contains(sanPham));
    }

    @Test
    public void testAddInvalidSanPham() {
        // Giá và số lượng âm
        SanPham sanPham = new SanPham("4", "MXSP4", "SanPham 4", "Do", "M", "Duoi ca 3", -50d, -10);
        try {
            service.addSanPham(sanPham);
        } catch (IllegalArgumentException e) {
            // Chờ ngoại lệ được ném
            Assert.assertEquals("Giá và số lượng không được âm", e.getMessage());
        }
        Assert.assertEquals(2, service.getAll().size());
    }

    @Test
    public void testAddInvalidMaSP() {
        // Mã sản phẩm không bắt đầu bằng MX
        SanPham sanPham = new SanPham("5", "SP5", "SanPham 5", "Vang", "S", "Duoi ca 4", 80d, 30);
        try {
            service.addSanPham(sanPham);
        } catch (IllegalArgumentException e) {
            // Chờ ngoại lệ được ném
            Assert.assertEquals("Mã sản phẩm phải bắt đầu bằng 'MX'", e.getMessage());
        }
        Assert.assertEquals(2, service.getAll().size()); // Không thêm sản phẩm mới
    }

    @Test
    public void testUpdateValidSanPham() {
        // Cập nhật một sản phẩm đã tồn tại
        SanPham sanPham = new SanPham("1", "MXSP1", "SanPham Updated", "Den", "M", "Duoi ca updated", 250d, 150);
        service.updateSanPham("1", sanPham);
        Assert.assertEquals(sanPham, service.getAll().get(0));
    }

    @Test
    public void testUpdateInValidSanPhamAm() {
        // Cập nhật với giá và số lượng âm
        SanPham sanPham = new SanPham("1", "MXSP1", "SanPham Updated", "Den", "M", "Duoi ca updated", -250d, -150);
        try {
            service.updateSanPham("1", sanPham);
        } catch (IllegalArgumentException e) {
            // Chờ ngoại lệ được ném
            Assert.assertEquals("Giá và số lượng không được âm", e.getMessage());
        }
        Assert.assertNotEquals(sanPham, service.getAll().get(0)); // Không cập nhật sản phẩm
    }

    @Test
    public void testUpdateInValidSanPhamLaChu() {
        // Cập nhật với giá và số lượng âm
        SanPham sanPham = new SanPham("1", "MXSP1", "SanPham Updated", "Den", "M", "Duoi ca updated", 1d, 1);
        try {
            service.updateSanPham("1", sanPham);
        } catch (IllegalArgumentException e) {
            // Chờ ngoại lệ được ném
            Assert.assertEquals("Giá và số lượng phải là số", e.getMessage());
        }
        Assert.assertNotEquals(sanPham, service.getAll().get(0)); // Không cập nhật sản phẩm
    }

    @Test
    public void testRemoveValidSanPham() {
        // Xóa một sản phẩm đã tồn tại
        service.removeSanPham("1");
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void testRemoveInvalidSanPham() {
        // Xóa một sản phẩm không tồn tại
        service.removeSanPham("3");
        Assert.assertEquals(2, service.getAll().size()); // Số lượng sản phẩm không thay đổi
    }}
