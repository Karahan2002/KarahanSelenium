package day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title","title");
        System.out.println("Second Assertion");
        Assert.assertEquals("uRl","url");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close Browser");
    }
}
