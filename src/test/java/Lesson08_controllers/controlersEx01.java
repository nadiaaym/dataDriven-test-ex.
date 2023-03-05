package Lesson08_controllers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class controlersEx01 {
    @Test
    public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://atidcollege.co.il/Xamples/ex_controllers.html");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("nadia");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("aymbinderow");
        driver.findElement(By.xpath("//input[@value='Female']")).click();

        Select continent = new Select(driver.findElement(By.id("continents")));
        continent.selectByValue("europe");

        driver.findElement(By.id("submit")).click();

        //String currenturl = driver.getCurrentUrl();
        //System.out.println("current url: " + currenturl);


        //driver.quit();
    }
}
