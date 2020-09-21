import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebAutomationSampleTest {
    private static Logger log = LogManager.getLogger(WebAutomationSampleTest.class.getName());
    WebDriver driver = null;
    //creating a instance veriable@BeforeTest //this will run before every test//
    public void openBwoweser(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Fatema Akter/IdeaProjects/webAutomation/driver/chromedriver.exe");
        driver = new ChromeDriver();

    }
 @Test
 public void contactusTest(){
    //1.open browser,
  // 2. type the url, validate the correct page
  // 3. click on contactus button,
   // 4. fill up required fileld
    // 5. press send button.
   //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");

  driver.get("https://fatemaakter1992.wixsite.com/portfolio");

      String homeTitle = driver.getTitle();
      log.info("Page Title: " + homeTitle);
      driver.findElement(By.id("DrpDwnMn03label")).click();
       String expectedTite = driver.getTitle();
      log.info("Page Title: " + expectedTite);

     driver.findElement(By.id("input_comp-kejs39sv")).sendKeys("Fatema Akter");
       //AtomicReference<Object> cache = new AtomicReference<Object>();
      //String expectedResult = cache.driver.findElement(By.xpath("//*[@id=\"comp-kejs39tv1\"]/button/span/class")).click();
      //String expectedResult = driver.findElement(By.xpath("//*[@id=\"comp-kejs39tv1\"]/button/span/class")).click();

     //*[@id="comp-kejs39tv1"]/button/span

        Assert.assertEquals("CONTACT | Mysite 1", expectedTite);
   }
    public void standBooksContactUsTest(){
        //open browser
        //type url
        //validate the landing page
        //click on contact us
        // validate you get a phone number to call
        //log.info("standBooks Contact Us test");
        //driver.get("https://www.strandbooks.com/");
        //String ladingPage = driver.getTitle();
        //log.info("Landing page title: " + ladingPage);

    }

    /*public static void main(String[] args) {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","C:/Users/Fatema Akter/IdeaProjects/webAutomation/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://fatemaakter1992.wixsite.com/portfolio");
    }*/
/*
    @AfterMethod //this will run after every test anoted method
    public void closeBrowser(){
        driver.quit();
    }*/

}
