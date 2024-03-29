package BTVN.Buoi07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        edgeDriver.get("https://kenta.vn/account/register");
        edgeDriver.findElement((By.id("last_name"))).sendKeys("Hai Yen");
        edgeDriver.findElement((By.id("first_name"))).sendKeys("Nguyen");
        WebElement rdoNu = edgeDriver.findElement((By.id("radio1")));
        rdoNu.click();
        edgeDriver.findElement((By.id("birthday"))).sendKeys("02/11/2004");
        edgeDriver.findElement((By.id("email"))).sendKeys("yennthph31906@fpt.edu.vn");
        edgeDriver.findElement((By.id("password"))).sendKeys("HaiYen123@");
        edgeDriver.findElement((By.className("btn"))).click();
    }

    @Test
    public void testDangNhap() {
        edgeDriver.get("https://kenta.vn/account/login");
        edgeDriver.findElement((By.id("customer_email"))).sendKeys("yennthph31906@fpt.edu.vn");
        edgeDriver.findElement((By.id("customer_password"))).sendKeys("HaiYen123@");
        edgeDriver.findElement((By.className("btn-signin"))).click();
    }
}
