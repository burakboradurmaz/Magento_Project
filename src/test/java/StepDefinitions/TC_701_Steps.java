package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TC_701_Steps {

    DialogContent dc = new DialogContent(GWD.getDriver());

    @Given("Navigate to Magento Website")
    public void navigateToMagentoWebsite() {
        GWD.getDriver().get(" https://magento.softwaretestingboard.com/ ");
    }

    @When("Click on Create an Account for user registration")
    public void clickOnCreateAnAccountForUserRegistration() {
        dc.myClick(dc.CreateAccountButton);
    }

    @And("User Should Be Form is Displayed")
    public void userShouldBeFormIsDisplayed() {
        Assert.assertTrue(dc.FormPageTitle.getText().contains("Create New Customer Account"));
    }

    @And("User Fills The Registration From With Valid Data")
    public void userFillsTheRegistrationFromWithValidData(DataTable dataTable) {
        List<List<String>>itemList=dataTable.asLists(String.class);

        for (int i=0;i<itemList.size();i++){
            WebElement element=dc.getWebElement(itemList.get(i).get(0));
            dc.mySendKeys(element,itemList.get(i).get(1));
        }
    }
    @And("User Click on Create an Account Button")
    public void UserClickonCreateanAccountButton() {
        dc.myClick(dc.SubmitButton);
    }

    @Then("User Should See the Message Registration Successfully")
    public void userShouldSeeTheMessageRegistrationSuccessfully() {
        Assert.assertTrue(dc.SuccessMessage.getText().contains("Thank you for registering with Main Website Store."));
    }

    @And("User Click on DropDown Menu")
    public void userClickOnDropDownMenu() {
        dc.myClick(dc.DropdownMenu);
    }

    @Then("User Logs Out by Click on the Sign Out")
    public void userLogsOutByClickOnTheSignOut() {
        dc.myClick(dc.SignOutButton);
    }
}
