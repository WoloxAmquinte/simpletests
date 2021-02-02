package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserManagement;


/**
 * Class containing the stepsdefinitions related to homePage and navBarPage
 */
public class StepsHome {
    private HomePage homePage;
    private String pageInformation;

    public StepsHome() {
        this.homePage = new HomePage();
    }

    public String getPageInformation() {
        return pageInformation;
    }

    public void setPageInformation(String pageInformation) {
        this.pageInformation = pageInformation;
    }

    @Given("^that I enter the conduit site$")
    public void enterConduitSite() {
        homePage.enterTheWebsite();
    }

    @When("I get information from the page")
    public void iGetInformationFromThePage() {
        setPageInformation(BrowserManagement.getDriver().getPageSource());
    }

    @Then("the information on the page contains the title {string}")
    public void theInformationOnThePageContainsTheTitle(String title) {
        Assert.assertTrue(getPageInformation().contains(title));
    }
}
