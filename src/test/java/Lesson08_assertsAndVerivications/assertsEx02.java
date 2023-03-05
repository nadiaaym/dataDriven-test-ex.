package Lesson08_assertsAndVerivications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class assertsEx02 {

    @Test
    public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://atidcollege.co.il/Xamples/bmi");
        driver.manage().window().maximize();

        WebElement calculateButton = driver.findElement(By.xpath("//input[@id='calculate_data' and @type='button']"));
        System.out.println(calculateButton.getSize());
        System.out.println(calculateButton.getLocation());
        assertTrue(calculateButton.isEnabled());
        assertTrue(calculateButton.isDisplayed());
        assertFalse(calculateButton.isSelected());


    }
}
