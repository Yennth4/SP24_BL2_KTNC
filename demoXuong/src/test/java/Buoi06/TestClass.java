package Buoi06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestClass {

//    ChromeDriver chromeDriver;
//    public void setup() {
//        System.out.println("Test NG");
//        // Dang nhap
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//    }
//
//    public void setup2() {
//        System.out.println("Test NG 2");
//        // Open cua so trinh duyet - GET
//    }

    @Test
    public void run() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://127.0.0.1:5500/index.html");

        // 1 button
//        WebElement btn = chromeDriver.findElement((By.className("btn-click")));
//        btn.click();

        List<WebElement> listWebElement = chromeDriver.findElements(By.className("btn-click"));
        for (int i = 0; i < listWebElement.size(); i++) {
            listWebElement.get(i).click();
        }
    }

    //
//        Assertions.assertEquals("Click here !" , btn.getText());
    // CRUD
}

//    @Test
//    public void runAfter () {
//        chromeDriver.quit();
//    }
//    private void sleep(int time) {
//        try {
//            Thread.sleep(time);
//        } catch (Exception e) {
//            System.out.println("Loi roi !!! " + e.getMessage());
//        }
//    }}
