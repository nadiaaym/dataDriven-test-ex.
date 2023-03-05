package Lesson03_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locatorsEx1 {
    @Test
    public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://atidcollege.co.il/Xamples/ex_locators.html");
        driver.manage().window().maximize();

        WebElement locator1 = driver.findElement(By.id("locator_id"));
        System.out.println("locator1 - id: " + locator1);

        WebElement locator2 = driver.findElement(By.name("locator_name"));
        System.out.println("locator2 - name: " + locator2);

        WebElement locator3 = driver.findElement(By.tagName("p"));
        System.out.println("locator3 - tagName: " + locator3);

        WebElement locator4 = driver.findElement(By.className("locator_class"));
        System.out.println("locator4 - className: " + locator4);

        WebElement locator5 = driver.findElement(By.linkText("myLocator(5)"));
        System.out.println("locator5 - linkText: " + locator5);

        WebElement locator6 = driver.findElement(By.linkText("Find my locator (6)"));
        System.out.println("locator6 - linkText: " + locator6);

        WebElement locator7 = driver.findElement(By.xpath("//input[@type='submit']"));
        System.out.println("locator7 - xpath: " + locator7);

        //WebElement locator8 = driver.findElement(By.cssSelector("img[src$='png']"));
        //System.out.println("locator8 - cssSelector: " + locator8);

        WebElement locator8a = driver.findElement(By.cssSelector("button[class^='btn']"));
        System.out.println("locator8a - cssSelector: " + locator8a);






        driver.quit();
    }
}
