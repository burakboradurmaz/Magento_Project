package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD_old;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _TC702_Steps {

    LeftNav ln = new LeftNav(GWD_old.getDriver());
    DialogContent dc = new DialogContent(GWD_old.getDriver());
    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        GWD_old.getDriver().get("https://magento.softwaretestingboard.com");
    }


    @And("Click on the signIn button")
    public void clickOnTheSignInButton() {
        dc.wait.until(ExpectedConditions.urlContains(""));
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.cookie)).click();
        ln.myClick(ln.signInButton);
    }


    @When("Enter valid username as {string} and password as {string}")
    public void enterValidUsernameAsAndPasswordAs(String username, String password) {
        dc.mySendKeys(dc.email,username);
        dc.mySendKeys(dc.Password,password);

    }

    @And("Click on the login button")
    public void clickOnTheLoginButton() {
        dc.myClick(dc.loginButtonSignInButton);
    }

    @Then("The user should be logged successfully")
    public void theUserShouldBeLoggedSuccessfully() {
        Assert.assertTrue(dc.wait.until(ExpectedConditions.visibilityOf(dc.welcomeHeadText)).isDisplayed());
    }


    @When("The user enters email and password")
    public void theUserEntersEmailAndPassword(DataTable usernameAndPassword) {
        List<List<String>> inputFieldAndText = usernameAndPassword.asLists();
        for (int i = 0; i < inputFieldAndText.size(); i++) {
            dc.mySendKeys(dc.getWebElement(inputFieldAndText.get(i).get(0)),
                    inputFieldAndText.get(i).get(1));
        }

    }
    @And("Click  the login button")
    public void clickTheLoginButton() {
        dc.myClick(dc.loginButtonSignInButton);
    }


    @Given("User enters the correct password")
    public void userEntersTheCorrectPassword() {
        dc.mySendKeys(dc.Password,"1q2w3e4raA.");
    }

    @Then("The user should be to see the email error message")
    public void theUserShouldBeToSeeTheEmailErrorMessage() {
        Assert.assertTrue(dc.emailError.isDisplayed());
    }

    @Given("User enters invalid email and  the correct password")
    public void userEntersInvalidEmailAndTheCorrectPassword() {
        dc.mySendKeys(dc.Email,"1batch7team5@gmail.com");
        dc.mySendKeys(dc.Password,"1q2w3e4raA.");
    }

    @Then("The user should be to see the incorrect Error message")
    public void theUserShouldBeToSeeTheIncorrectErrorMessage() {
        Assert.assertTrue(dc.incorrectError.isDisplayed());
    }

    @Given("User enters the correct email")
    public void userEntersTheCorrectEmail() {
        dc.mySendKeys(dc.Email,"batch7team5@gmail.com");
    }

    @Given("User enters valid email and  the invalid password")
    public void userEntersValidEmailAndTheInvalidPassword() {
        dc.mySendKeys(dc.Email,"batch7team5@gmail.com");
        dc.mySendKeys(dc.Password,"1q2w3e4raA1.");
    }

    @Then("The user should be to see the password error message")
    public void theUserShouldBeToSeeThePasswordErrorMessage() {
        Assert.assertTrue(dc.passwordError.isDisplayed());
    }
}
