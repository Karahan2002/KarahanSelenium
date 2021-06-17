package day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        //Opens new driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigates to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(2000);
        //closes the current tab
        driver.close();
        //opens new driver
        driver = new ChromeDriver();
        //navigates to http://practice.cybertekschool.com/open_new_tab
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        //closes all tabs
        driver.quit();
    }
}
