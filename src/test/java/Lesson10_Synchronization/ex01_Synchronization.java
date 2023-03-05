package Lesson10_Synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ex01_Synchronization {

    WebDriverWait wait;
    @Test
    public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://atidcollege.co.il/Xamples/ex_synchronization.html");
        driver.manage().window().maximize();

        WebElement renderedButton = driver.findElement(By.id("rendered"));
        renderedButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
        WebElement afterRenderedButton = driver.findElement(By.id("finish2"));

        WebElement hiddenButton = driver.findElement(By.id("hidden"));
        hiddenButton.click();

        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("hidden")));

        //Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//br[text()='Element on page that is hidden']")));

        WebElement secondElement = driver.findElement(By.xpath("//br[text()='Element on page that is hidden']"));
        System.out.println(secondElement.getText());


        System.out.println(afterRenderedButton.getText());

    }
}
