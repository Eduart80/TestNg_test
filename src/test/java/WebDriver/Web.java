package WebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Web {

    private static WebDriver driver;
    @BeforeMethod
    public void initDrive(){
        System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }

}