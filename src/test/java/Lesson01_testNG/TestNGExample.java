package Lesson01_testNG;

import org.testng.annotations.*;

public class TestNGExample
{
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod");
    }
    @Test
    public void test01()
    {
        System.out.println("test01");
    }
    @Test
    public void atest02()
    {
        System.out.println("test02");
    }
}
