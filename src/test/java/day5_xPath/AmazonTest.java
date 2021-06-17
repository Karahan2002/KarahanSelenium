package day5_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class AmazonTest{
    /*
    * TASK
    * go to amazon.com
    * search for selenium
    * click search button
    * verify 1-48 of 304 results for "Java"
    * */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement input = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        input.sendKeys("Java");
        WebElement button = driver.findElement(By.xpath("//input[@value='Go']"));
        button.click();
        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String resultText = result.getText();
        System.out.println("resultText = "+resultText);
        String expectedResult = "1-48 of over 4,000 results for";
        if(expectedResult.equals(resultText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resultText);
        }
        driver.quit();
    }
}