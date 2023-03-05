package Lesson02_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverManagerEx01 {

    String expectedTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
    @Test
public void WebDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://imdb.com");

        String title = driver.getTitle();
            System.out.println("title is: " + title);

            if(expectedTitle == title) {
                System.out.println("Title test passed");
            } else {
                System.out.println("Title test failled");
            }
        driver.navigate().refresh();
            //driver.quit();
    }
}
