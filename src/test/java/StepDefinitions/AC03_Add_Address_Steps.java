package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AC03_Add_Address_Steps {

    LeftNav ln = new LeftNav(GWD.getDriver());
    DialogContent dc = new DialogContent(GWD.getDriver());


    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://magento.softwaretestingboard.com/"));
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.myClick(dc.signHomePage);
        dc.mySendKeys(dc.email, "tteam.5.techno@gmail.com");
        dc.mySendKeys(dc.password, "TeamFive5*");
        dc.myClick(dc.signButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(dc.accessSuccess));
        Assert.assertTrue(dc.accessSuccess.getText().contains("Welcome"));
    }

    @And("Navigate to My Account")
    public void navigateToMyAccount() {
        dc.myClick(ln.menu);
        dc.myClick(ln.myAccount);
    }

    @And("Navigate to Address Book")
    public void navigateToAddressBook() {
        dc.myClick(ln.addressBook);
    }

    @When("Write the phone number as {string}")
    public void writeThePhoneNumberAs(String name) {
        dc.myClick(dc.addNewAddress);
        dc.mySendKeys(dc.phoneNumber, name);

    }

    @Then("Select the country")
    public void selectTheCountry() {
        dc.myClick(dc.country);
        dc.myClick(dc.TR);
    }

    @When("Write street address as {string}")
    public void writeStreetAddressAs(String name) {
        dc.mySendKeys(dc.streetAddress, name);

    }

    @Then("Write city as {string}")
    public void writeCityAs(String name) {
        dc.mySendKeys(dc.city, name);
    }

    @Then("Write postal code as {string}")
    public void writePostalCodeAs(String name) {
        dc.mySendKeys(dc.postalCode, name);

    }

    @Then("Click the save button")
    public void clickTheSaveButton() {
        dc.myClick(dc.buttonBillingAddress);
        dc.myClick(dc.buttonShippingAddress);
        dc.myClick(dc.saveAddress);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(dc.successMesage));
        Assert.assertTrue(dc.successMesage.getText().contains("You"));
    }


    @When("Click the delete button on an existing address")
    public void clickTheDeleteButtonOnAnExistingAddress() {
        dc.myClick(dc.delete);
        dc.myClick(dc.deleteOkButton);
    }

    @When("Click the edit button on an existing address")
    public void clickTheEditButtonOnAnExistingAddress() {
        dc.myClick(dc.edit1);
        dc.myClick(dc.buttonBillingAddress);
        dc.myClick(dc.saveAddress);
    }
}
