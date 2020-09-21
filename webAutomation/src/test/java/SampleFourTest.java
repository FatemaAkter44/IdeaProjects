import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SampleFourTest {
    WebDriver driver =null;
    private static Logger log = LogManager.getLogger(SampleFourTest.class.getName());

    @BeforeMethod
    public void openBrowser(){
        String key = "webdriver.chrome.driver";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        String value = "C:\\Users\\Fatema Akter\\IdeaProjects\\webAutomation\\driver\\chromedriver.exe";
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.get("https://online.citi.com/US/login.do");

    }

    @Test
    public void titleTest(){
        String expectedTitle = driver.getTitle();
        String actualTitle = "Online Banking, Mortgages, Personal Loans, Investing | Citi.com";
        log.info("page title: " + expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("test passed");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}