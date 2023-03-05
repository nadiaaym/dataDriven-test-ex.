package Lesson12_dataDrivenTesting;

import com.Lesson12_dataDrivenTesting.dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ex01_DataDrivenTesting {
    public WebDriver driver;
    @BeforeClass
    public void WebDriver(){
//      WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "data-provider", dataProviderClass = dataprovider.class)
    public void wikiTest(String key, String value) {
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(key);
        driver.findElement(By.tagName("button")).click();

        // WebElement mainTitle = driver.findElement(By.className("mw-page-title-main"));
        //String title = mainTitle.getText();
        //System.out.println("page title is "+ title);
        //Assert.assertEquals(title, searchText);

        String mainTitle = driver.findElement(By.className("mw-page-title-main")).getText();
        System.out.println("page title is "+ mainTitle);
        Assert.assertEquals(mainTitle,value);

        driver.get("http://wikipedia.org/");
    }


}
