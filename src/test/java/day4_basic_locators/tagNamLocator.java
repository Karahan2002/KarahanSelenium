package day4_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class tagNamLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        //send keys to full name
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with tag name");
        //send keys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("manajer166@gmail.com");
        //lazy way to click button
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
        //close browser
        driver.quit();
    }
}
