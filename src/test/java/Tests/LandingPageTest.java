package Tests;

import Page.DarkSky.LandingPage;
import WebDriver.Web;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LandingPageTest extends Web {

    LandingPage lp = new LandingPage();
    //test 1
    @Test
    public void pageName(){
       Assert.assertEquals(lp.getTitle(), "Dark Sky - 1 City Hall, New York, NY");
        lp.getTemperature();

        //Scroll down page
        lp.scrollDownTo();

        // day temperature
        Assert.assertEquals(lp.dayOfWeek(), "Mon");

    }
    //test 2

}
