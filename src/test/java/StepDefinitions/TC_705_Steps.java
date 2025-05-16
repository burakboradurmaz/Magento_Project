package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_705_Steps {

    DialogContent dc = new DialogContent(GWD.getDriver());

    @Given("Navigate to Magento Website")
    public void navigateToMagentoWebsite() {
        GWD.getDriver().get(" https://magento.softwaretestingboard.com/ ");
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("softwaretestingboard"));
    }

    @And("The Button Should Be Clickable")
    public void theButtonShouldBeClickable() {
        Assert.assertTrue(dc.SignInButton.isDisplayed());
    }

    @And("Click on The SignIn Button")
    public void clickOnTheSignInButton() {
        dc.myClick(dc.SignInButton);
    }

    @When("Enter Email as {string} and Password as {string}")
    public void enterEmailAsAndPasswordAs(String Email, String Password) {
        dc.mySendKeys(dc.LoginEmail,Email);
        dc.mySendKeys(dc.LoginPassword,Password);
    }

    @And("The Button Should Be Displayed")
    public void theButtonShouldBeDisplayed() {
        Assert.assertTrue(dc.SignButton.isDisplayed());
    }

    @And("Click SignIn Button")
    public void clickSignInButton() {
        dc.myClick(dc.SignButton);
    }

    @And("Add to Cart Button Should be Clickable")
    public void addToCartButtonShouldBeClickable() {
        Assert.assertTrue(dc.SelectProduct.isDisplayed());
    }

    @Then("User Should Select a Product")
    public void userShouldSelectAProduct() {
        dc.myClick(dc.SelectProduct);
    }

    @Then("Select Size, Color and Qty")
    public void selectSizeColorAndQty() {
        dc.myClick(dc.SelectSize);
        dc.myClick(dc.SelectColor);
        dc.mySendKeys(dc.SelectQty,"2");
    }

    @And("Click Add Item To Cart")
    public void clickAddItemToCart() {
        dc.myClick(dc.AddToCart);
    }

    @And("Addition Success message should be displayed")
    public void additionSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.AdditionSuccessMessage.isDisplayed());
    }

    @Then("Click To Cart")
    public void clickToCart() {
        dc.myClick(dc.ClickToCart);
    }

    @And("Click To View and Edit Cart")
    public void clickToViewAndEditCart() {
        dc.myClick(dc.ViewAndEditCart);
    }

    @Then("Remove Item")
    public void removeItem() {
        dc.myClick(dc.RemoveItem);
    }

    @And("Click Here to Continue Shopping")
    public void clickHereToContinueShopping() {
        dc.myClick(dc.HereToContinue);
    }

    @Then("User Should New Select a Product")
    public void userShouldNewSelectAProduct() {
        dc.myClick(dc.SelectNewProduct);
    }

    @Then("Select new Size, new Color and new Qty")
    public void selectNewSizeNewColorAndNewQty() {
        dc.myClick(dc.SelectNewSize);
        dc.myClick(dc.SelectNewColor);
        dc.mySendKeys(dc.SelectNewQty,"1");
    }

    @And("Click Add Item To Cart Again")
    public void clickAddItemToCartAgain() {
        dc.myClick(dc.AddToCartAgain);
    }

    @Then("Click To Cart Again")
    public void clickToCartAgain() {
        dc.myClick(dc.ClickToCartAgain);
    }

    @And("Click To View and Edit Cart Again")
    public void clickToViewAndEditCartAgain() {
        dc.myClick(dc.ViewAndEditCartAgain);
    }

    @Then("Edit Product")
    public void editProduct() {
        dc.myClick(dc.EditItem);
    }

    @And("Increase qty")
    public void ıncreaseQty() {
        dc.mySendKeys(dc.EditQty,"2");
    }

    @And("Update Cart Button Should Be Clickable")
    public void updateCartButtonShouldBeClickable() {
        Assert.assertTrue(dc.UpdateCart.isDisplayed());
    }

    @And("Click on Update Cart")
    public void clickOnUpdateCart() {
        dc.myClick(dc.UpdateCart);
    }

    @And("And Success message should be displayed")
    public void andSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.UpdateSuccessMessage.isDisplayed());
    }
}