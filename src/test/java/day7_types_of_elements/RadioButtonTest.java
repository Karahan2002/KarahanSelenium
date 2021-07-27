package day7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class RadioButtonTest {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        //locating radio buttons
        WebElement button = driver.findElement(By.cssSelector("#blue"));
        WebElement button2 = driver.findElement(By.id("id"));
        //how to checj radio button is selected?
        System.out.println("button.isSelected() = " + button.isSelected());
        System.out.println("button2.isSelected() = " + button2.isSelected());

        //verify blue is selected red is not selected
        //blue --> true
        Assert.assertTrue(button.isSelected(),"verify that blue is selected");
        //red
        Assert.assertFalse(button2.isSelected(),"verify that red is not selected");

        //how to click red button?
        button2.click();
        Assert.assertTrue(button.isSelected(),"verify that blue is selected");
        //red
        Assert.assertFalse(button2.isSelected(),"verify that red is not selected");

        Thread.sleep(3000);
        driver.quit();
    }
}
