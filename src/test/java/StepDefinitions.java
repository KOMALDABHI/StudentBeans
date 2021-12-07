import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions
{
    String expectedHomePageTitle = "https://www.studentbeans.com/uk";
    String actualHomePageTitle;

    @Given("i should be navigate to url {string}")
    public void i_should_be_navigate_to_url(String url)
    {
        System.out.println("url is " + url);
        BasePage.parentsPageObject.navigateToUrl(url);

    }
    @Then("i should be navigate to home page")
    public void i_should_be_navigate_to_home_page()
    {
        BasePage.parentsPageObject.acceptCookies();
        actualHomePageTitle = BasePage.parentsPageObject.getPageTitle();
        Assertions.assertEquals(expectedHomePageTitle,actualHomePageTitle);
    }
    @When("i should be open the search bar")
    public void i_should_be_open_the_search_bar()
    {
        BasePage.parentsPageObject.clickSearchBar();

    }
    @And("i should be enter {string}")
    public void i_should_be_enter(String Text)
    {
        BasePage.simpleSearchPageObject.enterSearchText(Text);
    }

    @Then("i should be display a search listing for {string}")
    public void i_should_be_display_a_search_listing_for(String samsung) throws InterruptedException {
        BasePage.simpleSearchPageObject.displaySearch();
    }

}
