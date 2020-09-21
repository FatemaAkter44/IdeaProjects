import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MuslimUmmahWebsiteTest {
    //public static Logger log = LogManager.getLogger(MuslimUmmahWebsiteTest.class.getName());
   // WebDriver driver = null;
   /* @BeforeMethod
    public void openBrowesr(){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Akter\\IdeaProjects\\webAutomation\\driver\\chromedriver.exe");
        //System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://muslimummah.org/");*/
    //}
    @Test
    public void contactUsTest(){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Akter\\IdeaProjects\\webAutomation\\driver\\chromedriver.exe");
        //System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.citi.com/US/login.do");
        //open browser, put url, validate landing page, click contact us button, invalid info for all field and press send
        //String landingPageTitle = driver.getTitle();
        //log.info("landing page: " + landingPageTitle);
    }
}
