package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.ParentsPageObject;
import pageObjectModel.SimpleSearchPageObject;

public class BasePage
{
    public static WebDriver driver;
    public static ParentsPageObject parentsPageObject;
    public  static SimpleSearchPageObject simpleSearchPageObject;
    public static BasePage homePage;

    @Before
    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new BasePage();
        parentsPageObject = new ParentsPageObject(driver);
        simpleSearchPageObject = new SimpleSearchPageObject(driver);

    }

    public String getPageTitle()

    {
        return driver.getTitle();

    }


    @After
    public static void tearDown()
    {
       driver.close();
    }
}
