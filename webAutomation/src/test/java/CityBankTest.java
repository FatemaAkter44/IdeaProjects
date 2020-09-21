/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CityBankTest {
    //private static Logger log = LogManager.getLogger(CityBankTest.class.getName());
    WebDriver driver = null;
    @BeforeMethod
    public void setBrowser(){
        //System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
        String key = "webdriver.chrome.driver";
        String value = "C:\\Users\\Fatema Akter\\IdeaProjects\\webAutomation\\driver\\chromedriver.exe";
        System.getProperty(key, value);
        driver = new ChromeDriver();
        //1. open browse and put the the url
        driver.get("https://online.citi.com/US/");
    }
    @Test
    public void contactUsTest(){
     //validate i am in currect page
     String hopePageTitle = driver.getTitle();
        System.out.println(hopePageTitle);
     //log.info("page title: " + hopePageTitle);
       // Assert.assertEquals(hopePageTitle, "");
    }
}
