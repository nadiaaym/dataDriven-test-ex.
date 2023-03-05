package Lesson12_dataDrivenTesting;

import org.testng.annotations.DataProvider;

public class dataprovider {
    @DataProvider(name = "data-provider")

    public Object [][] getDataObject(){
            return new Object[][] {
            {"Automation", "Automation"},
            {"Israel","Israel"},
            {"blahblah","Search results"}
        };
    }
}
