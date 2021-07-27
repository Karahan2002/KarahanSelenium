package day10_actions_js;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class HoverTest {
    WebDriver driver;
    @BeforeMethod
    public void estUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void TtearDown() throws InterruptedException{
        //Thread.sleep(2000);
        //driver.quit();
    }
    /*
        hover over each image in the website
        verify each name: user text is displayed
     */
    @Test
    public void test1() throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        //hover over to element
        Thread.sleep(2000);
        actions.moveToElement(img1).perform();

        WebElement text1 = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text1.isDisplayed(),"verify that text1 is displayed");
    }
    /*
        hover over each image in the website
        verify each name: user text is displayed
     */
    @Test
    public void test2() throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/hovers");

        for(int i=1; i<=3;i++) {
            String xpathImage = "(//img)["+i+"]";
            WebElement img1 = driver.findElement(By.xpath(xpathImage));
            System.out.println(xpathImage);

            Actions actions = new Actions(driver);
            //hover over to element
            Thread.sleep(2000);
            actions.moveToElement(img1).perform();

            String textXpath = "//h5[.='name: user"+i+"']";
            WebElement text1 = driver.findElement(By.xpath(textXpath));
            System.out.println(textXpath);
            Assert.assertTrue(text1.isDisplayed(),"verify that text"+i+" is displayed");
        }

    }

}
