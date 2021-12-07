package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SimpleSearchPageObject
{
    WebDriver driver;

    @FindBy(className = "_1g5dvk1")
    WebElement searchText;

    @FindBy(className = "_1q02lnp")
    WebElement searchtn;

    @FindBy(xpath = "//*[@id=\"home_root\"]/div[1]/nav/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]")
    WebElement dispalyItems;


    public SimpleSearchPageObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void enterSearchText(String searchitem)
    {
        searchText.sendKeys(searchitem);
    }
    public void clickonsearchbutton()
    {
        WebDriverWait waitlink=new WebDriverWait(driver,50);
        waitlink.until(ExpectedConditions.elementToBeClickable(searchtn));
        searchtn.click();
    }
    public void displaySearch()
    {
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Samsung']")));

        List<WebElement> list=driver.findElements(By.xpath("//span[text()='Samsung']"));

        if(list.size()>0)
        {
            System.out.println("list the no of samsung items"+list.size());
        }

    }


}
