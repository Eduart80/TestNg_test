package Page.DarkSky;

import Page.BasePage;
import org.openqa.selenium.By;

import java.util.Objects;

public class LandingPage extends BasePage {

    //locators
   By currTemp2 = By.xpath("//div[@id='title']/span/span[2]/span");
   By weekDay = By.xpath("//div[@id='week']/a[2]/span[1]/span[2]");



    //methods
    public String getTitle() {
       String name = getName();
        if(name != null){
            System.out.println("Page Title: "+name);
            return name;
        }else{
            System.out.println("Title not there");
            return null;
        }
    }
    public void getTemperature(){
       String temp = readText(currTemp2);
        System.out.println(temp);
    }
    public void scrollDownTo(){
        scrollDown();
    }
    public String dayOfWeek(){
       String dayIs = day(weekDay);
        System.out.println("Day is: "+dayIs);
       return dayIs;
    }

}
