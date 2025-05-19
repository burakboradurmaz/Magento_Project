package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Utilities.GWD.getDriver;

public class TC_708_Steps {
    DialogContent dc = new DialogContent(GWD.getDriver());
    LeftNav lf = new LeftNav(GWD.getDriver());


   // @Given("Navigate to Magento Website")
   // public void navigateToMagentoWebsite() {
     //   GWD.getDriver().get("https://magento.softwaretestingboard.com/");

    //}

    @And("Click Sign In button")
    public void clickSignInButton() {
        lf.myClick(lf.SignInButton);

    }

    @When("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String email, String password) {
        dc.mySendKeys(dc.LogInEmail, email);
        dc.mySendKeys(dc.LogInPassword, password);
        dc.myClick(dc.SignInButton2);
    }

    @And("Verify that Welcome message is displayed")
    public void verifyThatWelcomeMessageIsDisplayed() {
        Assert.assertTrue(dc.WelcomeMessage.isDisplayed(), "Welcome message is not displayed.");
    }


    @Given("The user is on the product page of an item he likes")
    public void theUserIsOnTheProductPageOfAnItemHeLikes() {
        lf.mySendKeys(lf.searchPlace, "Lando Gym Jacket");
        lf.myClick(lf.searchButton);
    }

    @When("Click on the My Wish List link")
    public void clickOnTheMyWishListLink() {
        dc.myClick(dc.addToWishList);
    }


    @Then("Verify that the product is added to the wish list")
    public void verifyThatTheProductIsAddedToTheWishList() {
        dc.verifyMessageContainsText(dc.MessageForWishList, "Lando Gym Jacket has been added to your Wish List");
    }

    @When("Navigate to the My Account page")
    public void navigateToTheMyAccountPage() {

        lf.myClick(lf.myAccountt);
    }

    @And("Click on the My Wish List link again")
    public void clickOnTheMyWishListLinkAgain() {

        lf.myClick(lf.myWishList);
    }

    @Then("Verify that the product is in the wish list")
    public void verifyThatTheProductIsInTheWishList() {
        dc.itemInList.isDisplayed();
        Assert.assertTrue(dc.itemInList.isDisplayed(),"The item is not added.");

    }


    @When("The user hovers over {string}")
    public void theUserHoversOver(String productName) {
        WebElement product = getDriver().findElement(By.linkText(productName));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(product).perform();

    }

    @Then("The Remove from Wish List icon appears and click")
    public void theRemoveFromWishListIconAppearsAndClick() {
        dc.RemoveButton.isDisplayed();
        dc.myClick(dc.RemoveButton);
    }


    @And("Verify that the product is removed from the wish list")
    public void verifyThatTheProductIsRemovedFromTheWishList() {
        dc.verifyMessageContainsText(dc.MessageToRemove, "Lando Gym Jacket has been removed from your Wish List.");
    }


}