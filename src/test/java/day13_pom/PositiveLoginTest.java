package day13_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;
import utilities.configurationReader;

import java.util.concurrent.TimeUnit;

public class PositiveLoginTest extends TestBase{
    @Test
    public void LoginAsDriver(){
        LoginPage loginPage = new LoginPage();
        String username = configurationReader.get("driver_username");
        String password = configurationReader.get("driver_password");
        //loginPage.usernameInput.sendKeys(username);
        //loginPage.passwordInput.sendKeys(password);
        //loginPage.loginBtn.click();

        loginPage.login(username,password);
    }
}