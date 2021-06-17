package day7_testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAfterMethod {
    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS");
        System.out.println("executed one time before the class");
    }
    @Test
    public void test1(){
        System.out.println("First Test Case");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("Second Test Case");
    }
    @Test
    public void test3(){
        String expectedTitle = "Cyb";
        String actualTitle = "Cybertek";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");
    }
    @Test
    public void test4(){
        //verify email contains @ signs
        System.out.println("tset 4");
        String email = "manajer166@gmail.com";
        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }
    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that 0 is not greater than 1");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("--BEFORE METHOD--");
        System.out.println("WebDriver, Opening Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("--AFTER METHOD--");
        System.out.println("Closing Browser, Quit");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("--AFTER CLASS--");
        System.out.println("Some Reporting Code Here");
    }
}
