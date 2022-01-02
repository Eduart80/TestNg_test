package Page;

import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage {

    public String readText(By locators){
        return Web.getDriver().findElement(locators).getText();
    }
    public String getName(){
       return Web.getDriver().getTitle();
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("window.scrollBy(0,900)");
    }
    public String day(By locator){
        return Web.getDriver().findElement(locator).getText();
    }
}
