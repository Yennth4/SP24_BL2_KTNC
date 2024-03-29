package BTVN.Buoi07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBTVNBuoi07 {

    EdgeDriver edgeDriver;

    public TestBTVNBuoi07() {
        edgeDriver = new EdgeDriver();
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void testDangKi() {
        edgeDriver.get("https://sevenam.vn/account/register");
        edgeDriver.findElement((By.id("FirstName"))).sendKeys("Yen");
        edgeDriver.findElement((By.id("LastName"))).sendKeys("Nguyen");
        edgeDriver.findElement((By.id("Email"))).sendKeys("nguyenthihaiyen9c4@gmail.com");
        edgeDriver.findElement((By.id("CreatePassword"))).sendKeys("HaiYen123@");
        edgeDriver.findElement((By.className("btn--full"))).click();
    }

    @Test
    public void testDangNhap() {
        edgeDriver.get("https://sevenam.vn/account/login");
        edgeDriver.findElement((By.id("CustomerEmail"))).sendKeys("nguyenthihaiyen9c4@gmail.com");
        edgeDriver.findElement((By.id("CustomerPassword"))).sendKeys("HaiYen123@");
        edgeDriver.findElement((By.className("btn--full"))).click();
    }
}
