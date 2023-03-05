package Lesson02_WebDriver;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsBasic_ex01 {
    @Test
    public void webDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");

        WebElement logo;
        WebElement logo1;
        System.out.println(
                "logo id is:" + (logo = driver.findElement(By.id("selenium_logo")))
        );

        System.out.println(
                "logos className is: "+ (logo1 =  driver.findElement(By.className("navbar-logo")))
        );

        Object List;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("there are " + links.size() + " links");

        driver.quit();
    }
}
