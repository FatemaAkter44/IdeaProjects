import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SampleTestTwo {
    private static Logger log = LogManager.getLogger(SampleTestTwo.class.getName());
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Akter\\IdeaProjects\\webAutomation\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.strandbooks.com/");
    }
    @Test
    public void landingPageTest(){

        String homeTitel = driver.getTitle();
        log.info("home page title: "+ homeTitel);
        Assert.assertEquals(homeTitel, "Strand Book Store");
        log.info("test passed");

    }

    @Test
    public void searchButtonTest(){
        driver.get("https://www.strandbooks.com/");

        //driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div[1]/div/div/form/input")).sendKeys("holy quran");
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div[1]/div/div/form/button/span/svg/path")).click();
        //String expectedResult = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/section[1]/div[3]/p")).getText();

        driver.findElement(By.id("search")).sendKeys("holy quran");


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div[2]/div/div[1]/div/div/form/button[2]/span/svg")).click();
        String expectedResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/section[1]/div[3]/p")).getText();

        String actualResult = "93 results";
        Assert.assertEquals(expectedResult,actualResult);
        log.info("result: passed");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
