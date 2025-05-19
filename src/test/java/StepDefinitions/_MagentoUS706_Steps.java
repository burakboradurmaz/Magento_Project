package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD_old;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class _MagentoUS706_Steps {
    LeftNav ln = new LeftNav(GWD_old.getDriver());
    DialogContent dc = new DialogContent(GWD_old.getDriver());

    @When("The user click on the element in Dialog")
    public void theUserClickOnTheElementInDialog(DataTable elements) {
        List<String> button = elements.asList();

        for (int i = 0; i < button.size(); i++) {
            dc.myClick(dc.getWebElement(button.get(i)));
        }
    }

    @And("User send the keys in Dialog")
    public void userSendTheKeysInDialog(DataTable inputFields) {
        List<List<String>> inputFieldAndText = inputFields.asLists();
        for (int i = 0; i < inputFieldAndText.size(); i++) {
            dc.mySendKeys(dc.getWebElement(inputFieldAndText.get(i).get(0)),
                    inputFieldAndText.get(i).get(1));
        }
    }

    @Then("The user should be to see the successMessage")
    public void theUserShouldBeToSeeTheSuccessMessage() {
        Assert.assertTrue(dc.tyText.isDisplayed());
    }
}
