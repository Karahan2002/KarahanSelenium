package day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {
        //open chrome and navigate to http://practice.cybertekschool.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        //getting title with selenium
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        System.out.println("title = "+title);
        System.out.println("url = " + currentUrl);
        System.out.println("pageSource = " + pageSource);
        

    }
}
