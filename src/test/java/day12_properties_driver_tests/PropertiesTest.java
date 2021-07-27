package day12_properties_driver_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;
import utilities.configurationReader;

public class PropertiesTest {
    @Test
    public void test1(){
        String browserType = configurationReader.get("browser");
        WebDriver driver = WebDriverFactory.getDriver(browserType);
        System.out.println("browserType = " + browserType);
        String url = configurationReader.get("url");
        System.out.println("url = " + url);
    }
    @Test
    public void OpenBrowserWithConfig(){
        WebDriver driver = WebDriverFactory.getDriver(configurationReader.get("browser"));
        driver.get(configurationReader.get("url"));

        String username = configurationReader.get("driver_username");
        String password = configurationReader.get("driver_password");
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);
    }
}
