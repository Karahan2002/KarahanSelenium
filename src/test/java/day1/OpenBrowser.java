package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("iphone");
        WebElement button = driver.findElement(By.id("nav-search-submit-button"));
        button.click();
        WebElement searchedText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String searchedInput = searchedText.getText();
        if(searchedInput.contains("iphone")){
            System.out.println("PASS");
            System.out.println("searched = "+searchedInput);
        }else{
            System.out.println("FAIL");
        }
        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'1-16 of over 1,000 results for')]"));
        String resultText = result.getText();
        if(resultText.equals("1-16 of over 1,000 results for")){
            System.out.println("PASS");
            System.out.println("result =  "+resultText);
        }else{
            System.out.println("FAIL");
        }
    }
}