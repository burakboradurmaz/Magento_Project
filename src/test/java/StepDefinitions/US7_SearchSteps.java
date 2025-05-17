package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US7_SearchSteps {
    DialogContent dc = new DialogContent(GWD.getDriver());

    @Given("The user navigates to the Magento website")
    public void theUserNavigatesToTheMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://magento.softwaretestingboard.com/"));

    }

    @When("User clicks the login button")
    public void userClicksTheLoginButton() {
        dc.myClick(dc.signHomePage);
    }

    @And("The user types username and password and clicks on the login button")
    public void theUserTypesUsernameAndPasswordAndClicksOnTheLoginButton() {
        dc.myClick(dc.signHomePage);
        dc.mySendKeys(dc.email, "tteam.5.techno@gmail.com");
        dc.mySendKeys(dc.password, "TeamFive5*");
        dc.myClick(dc.signButton);
    }

    @Then("The user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        dc.wait.until(ExpectedConditions.textToBePresentInElement(dc.accessSuccess, "Welcome"));
        Assert.assertTrue(dc.accessSuccess.getText().contains("Welcome"));
    }

    @Given("The user enters a valid SKU number {string} and searches")
    public void theUserEntersAValidSKUNumberAndSearches(String mJ08) {
        dc.mySendKeys(dc.search_SendKeysOnTheHomePage, mJ08);
        dc.myClick(dc.searchButtonOnTheHomePage);
    }

    @When("The user finds the product they are looking for and clicks on it")
    public void theUserFindsTheProductTheyAreLookingForAndClicksOnIt() {
        dc.myClick(dc.imgLandoGymJacket);
    }

    @Then("The user should verify that the correct product details are displayed")
    public void theUserShouldVerifyThatTheCorrectProductDetailsAreDisplayed() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.skuMJ08));
        Assert.assertTrue(dc.prdctNameInsideImg.getText().contains("Lando Gym Jacket"));
        Assert.assertTrue(dc.skuMJ08.getText().toLowerCase().contains("mj08"));
    }

    @When("The user enters an invalid SKU number {string} and searches")
    public void theUserEntersAnInvalidSKUNumberAndSearches(String invalid) {
        dc.mySendKeys(dc.search_SendKeysOnTheHomePage, invalid);
        dc.myClick(dc.searchButtonOnTheHomePage);
    }

    @Then("The user should see the {string} message")
    public void theUserShouldSeeTheMessage(String noResults) {
        Assert.assertTrue(dc.searchNoResultsText.getText().contains(noResults));
    }
}