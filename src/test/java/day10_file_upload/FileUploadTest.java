package day10_file_upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class FileUploadTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        //locating choose file button
        WebElement choseFile = driver.findElement(By.name("file"));
        //sending file with sendKeys method
        choseFile.sendKeys("/home/yakup/Desktop/file.txt");
        //clicking upload button
        driver.findElement(By.id("file-submit")).click();
        //getting the file name from the browser
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        //verify the name is file.txt
        Assert.assertEquals(actualFileName,"file.txt");
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement chooseFile = driver.findElement(By.name("file"));

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/file.txt";
        String fullPath = projectPath+filePath;
        System.out.println(fullPath);

        driver.findElement(By.id("file-submit")).click();
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualFileName,"file.txt");
    }

}
