package priorityEx01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ex01 {
    WebDriverWait wait;
    @Test
    public void WebDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://priority-connect.online/webui/ZW015/#");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @class='loginlabel_textboxstyle']")));

        WebElement userName = driver.findElement(By.xpath("//input[@type='text' and @class='loginlabel_textboxstyle']"));

        userName.sendKeys(System.getenv("USERNAME"));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));

       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

       password.sendKeys("1234");
    }
}
