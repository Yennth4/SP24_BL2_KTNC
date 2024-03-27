package Buoi07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassBuoi07 {
    EdgeDriver edgeDriver = new EdgeDriver();

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void run() {
        edgeDriver.get("https://yody.vn/");
        WebElement btnDangKi = edgeDriver.findElement((By.className("register")));
        btnDangKi.click();
        edgeDriver.findElement((By.id("first_name"))).sendKeys("HaiYenXinh");
        edgeDriver.findElement((By.id("phone"))).sendKeys("0848373898");
        edgeDriver.findElement((By.id("iptEmail"))).sendKeys("nguyenthihaiyen9c4@gmail.com");
        edgeDriver.findElement((By.id("password"))).sendKeys("HaiYen4");
        edgeDriver.findElement((By.id("btnSubmit"))).click();
    }

    @Test
    public void dangNhap() {
        edgeDriver.get("https://yody.vn/");
        WebElement btnDangNhap = edgeDriver.findElement((By.className("login")));
        btnDangNhap.click();
        edgeDriver.findElement((By.id("customer_email"))).sendKeys("nguyenthihaiyen9c4@gmail.com");
        edgeDriver.findElement((By.id("customer_password"))).sendKeys("HaiYen4");
        edgeDriver.findElement((By.className("btn-login"))).click();
    }

    @Test
    public void doiMatKhau() {
        dangNhap();
//        JavascriptExecutor js = (JavascriptExecutor) edgeDriver;
//        js.executeScript("window.location.href = 'https://yody.vn/account';");
        edgeDriver.findElement((By.className("title-info"))).click();
        edgeDriver.findElement((By.id("OldPass"))).sendKeys("HaiYen4");
        edgeDriver.findElement((By.id("changePass"))).sendKeys("HaiYen");
        edgeDriver.findElement((By.id("confirmPass"))).sendKeys("HaiYen");
        edgeDriver.findElement((By.className("button-default"))).click();
    }
}
