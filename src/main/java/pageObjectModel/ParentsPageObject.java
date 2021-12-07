package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentsPageObject
{

    WebDriver driver;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookieBtn;

    @FindBy(className = "_tf5swf")
    WebElement searchBar;


    public void acceptCookies()
    {
        WebDriverWait waitlink=new WebDriverWait(driver,50);
        waitlink.until(ExpectedConditions.elementToBeClickable(cookieBtn));
        cookieBtn.click();

    }
    public void clickSearchBar()
    {

        searchBar.click();
    }

    public void isElementEqualToExpected ()
    {
        String errorMessage = "actual does not equal expected";
        //    return expect(element.getText(), errorMessage).to.equal(expectedText);
    }
    public ParentsPageObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public String getPageTitle()
    {
        // return driver.findElement(By.xpath("//h3[text()='Recommended For You']")).getText();
        String title=driver.getCurrentUrl();
        return title;

    }

    public void enter(String samsung)
    {
        enter(samsung);
    }
}

