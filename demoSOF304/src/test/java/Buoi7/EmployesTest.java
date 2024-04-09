package Buoi7;

import com.SOF304.yennth.Buoi7.entity.Employes;
import com.SOF304.yennth.Buoi7.service.EmployesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class EmployesTest {

    EmployesService service;

    @BeforeEach
    public void setup() {
        service = new EmployesService();
    }

    @Test
    public void addValid() {
        Employes nhanvien = new Employes(1, "Nguyen", "Yen", "nguyenyen@gmail.com");
        service.addEmployes(nhanvien);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void addValid1() {
        Employes nhanvien = new Employes(1, "Nguyen", "Yen", "nguyenyen@gmail.com");
        service.addEmployes(nhanvien);
        Assert.assertTrue(service.getAll().size() == 1);
    }

    @Test
    public void updateValid() {
        Employes nhanvien = new Employes(1, "Nguyen", "Yen", "nguyenyen@gmail.com");
        service.addEmployes(nhanvien);
        Employes nhanvien1 = new Employes(1, "Nguyen1", "Yen", "thukim@gmail.com");
        service.updateEmployes(nhanvien1, 1);
        Assert.assertEquals("thukim@gmail.com", service.getAll().get(0).getEmail());
    }

    // xóa deleteBoolean
    @Test
    public void deleteValid() {
        Employes nhanvien = new Employes(1, "Nguyen", "Yen", "nguyenyen@gmail.com");
        service.addEmployes(nhanvien);
        boolean ketQua = service.deleteEmployes(1);
        Assert.assertTrue(ketQua);
        Assert.assertEquals(0, service.getAll().size());
    }

    @Test
    public void deleteInValid() {
        Employes nhanvien = new Employes(1, "Nguyen", "Yen", "nguyenyen@gmail.com");
        service.addEmployes(nhanvien);
        boolean ketQua = service.deleteEmployes(2);
        Assert.assertTrue(ketQua);
        Assert.assertEquals(0, service.getAll().size());
    }
}
