package Lesson08_assertsAndVerivications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class assertsEx01 {
    @Test
    public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://atidcollege.co.il/Xamples/bmi");
        driver.manage().window().maximize();


        WebElement weight = driver.findElement(By.id("weight"));
        weight.sendKeys("60");

        WebElement hight = driver.findElement(By.id("hight"));
        hight.sendKeys("165");

        driver.findElement(By.id("calculate_data")).click();

        String actualBmi = driver.findElement(By.id("bmi_result")).getAttribute("value");

        System.out.println("actual Bmi is: " + actualBmi);

        assertEquals(driver.findElement(By.id("bmi_result")).getAttribute("input"),"22");
    }
}
