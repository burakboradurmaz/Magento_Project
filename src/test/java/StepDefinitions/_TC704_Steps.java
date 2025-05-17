package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWDParameter;
import Utilities.GWD_old;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _TC704_Steps {
    LeftNav ln = new LeftNav(GWD_old.getDriver());
    DialogContent dc = new DialogContent(GWD_old.getDriver());

    @Given("Navigate to Homepage")
    public void navigateToHomepage() {
        GWDParameter.getDriver().get("https://magento.softwaretestingboard.com");

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.cookie)).click();
        ln.myClick(ln.signInButton);
        dc.mySendKeys(dc.email, "batch7team5@gmail.com");
        dc.mySendKeys(dc.password, "1q2w3e4raA.");
        dc.signButton.click();
        Assert.assertTrue(dc.wait.until(ExpectedConditions.visibilityOf(dc.welcomeHeadText)).isDisplayed());

    }

    @When("The user should be able to see Tab Menu")
    public void theUserShouldBeAbleToSeeTabMenu() {
        for (int i = 0; i < ln.topMenu.size(); i++) {
            ln.wait.until(ExpectedConditions.visibilityOf(ln.topMenu.get(i)));
        }
    }

    @And("Hover the element")
    public void hoverTheElement(DataTable buttons) {
        List<String> button = buttons.asList();
        Actions actions = new Actions(GWDParameter.getDriver());
        for (int i = 0; i < button.size(); i++) {
            ln.wait.until(ExpectedConditions.elementToBeClickable(ln.getWebElement(button.get(i))));
            Action action = actions.moveToElement(ln.getWebElement(button.get(i))).release().build();
            action.perform();
        }
    }


    @And("Click to sub menu element")
    public void clickToSubMenuElement(DataTable buttons) {
        List<String> buttonList = buttons.asList();
        for (String btn : buttonList) {
            WebElement element = ln.getWebElement(btn);
            ln.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }
    }

    @And("The user should be able see the Text")
    public void theUserShouldBeAbleSeeTheText(DataTable inputFields) {
        List<List<String>> inputFieldAndText = inputFields.asLists();
        for (int i = 0; i < inputFieldAndText.size(); i++) {
            dc.verifyMessageContainsText(dc.getWebElement(inputFieldAndText.get(i).get(0)),
                    inputFieldAndText.get(i).get(1));
        }
    }
}