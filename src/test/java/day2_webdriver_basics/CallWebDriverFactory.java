package day2_webdriver_basics;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("title = " + title);
    
    }
}
