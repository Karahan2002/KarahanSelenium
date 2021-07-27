package day12_properties_driver_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.WebDriverFactory;
import utilities.configurationReader;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{

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
class TestBase{
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
