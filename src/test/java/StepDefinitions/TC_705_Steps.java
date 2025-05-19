package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_705_Steps {

    DialogContent dc = new DialogContent(GWD.getDriver());

    private WebDriverWait getWait() {
        return new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    }


    @And("The Button Should Be Clickable")
    public void theButtonShouldBeClickable() {
        Assert.assertTrue(dc.SignInButton.isDisplayed());
    }

    @And("Click on The SignIn Button")
    public void clickOnTheSignInButton() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(dc.SignInButton));
        getWait().until(ExpectedConditions.visibilityOf(dc.SignInButton));
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
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.SignButton));
        dc.myClick(dc.SignButton);
    }

    @And("Add to Cart Button Should be Clickable")
    public void addToCartButtonShouldBeClickable() {

        Assert.assertTrue(dc.SelectProduct.isDisplayed());
    }

    @Then("User Should Select a Product")
    public void userShouldSelectAProduct() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(dc.SelectProduct));
        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", dc.SelectProduct);
        GWD.quitDriver();
        dc.myClick(dc.SelectProduct);
    }

    @Then("Select Size, Color and Qty")
    public void selectSizeColorAndQty() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectSize));
        dc.myClick(dc.SelectSize);
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectColor));
        dc.myClick(dc.SelectColor);
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectQty));
        dc.mySendKeys(dc.SelectQty,"2");
    }

    @And("Click Add Item To Cart")
    public void clickAddItemToCart() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.AddToCart));
        dc.myClick(dc.AddToCart);
    }

    @And("Addition Success message should be displayed")
    public void additionSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.AdditionSuccessMessage.isDisplayed());
    }

    @Then("Click To Cart")
    public void clickToCart() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.ClickToCart));
        dc.myClick(dc.ClickToCart);
    }

    @And("Click To View and Edit Cart")
    public void clickToViewAndEditCart() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.ViewAndEditCart));
        dc.myClick(dc.ViewAndEditCart);
    }

    @Then("Remove Item")
    public void removeItem() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.RemoveButton));
        dc.myClick(dc.RemoveItem);
    }

    @And("Click Here to Continue Shopping")
    public void clickHereToContinueShopping() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.HereToContinue));
        dc.myClick(dc.HereToContinue);
    }

    @Then("User Should New Select a Product")
    public void userShouldNewSelectAProduct() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectNewProduct));
        dc.myClick(dc.SelectNewProduct);
    }

    @Then("Select new Size, new Color and new Qty")
    public void selectNewSizeNewColorAndNewQty() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectNewSize));
        dc.myClick(dc.SelectNewSize);
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectNewColor));
        dc.myClick(dc.SelectNewColor);
        wait.until(ExpectedConditions.elementToBeClickable(dc.SelectNewQty));
        dc.mySendKeys(dc.SelectNewQty,"1");
    }

    @And("Click Add Item To Cart Again")
    public void clickAddItemToCartAgain() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.AddToCartAgain));
        dc.myClick(dc.AddToCartAgain);
    }

    @Then("Click To Cart Again")
    public void clickToCartAgain() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.ClickToCartAgain));
        dc.myClick(dc.ClickToCartAgain);
    }

    @And("Click To View and Edit Cart Again")
    public void clickToViewAndEditCartAgain() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.ViewAndEditCartAgain));
        dc.myClick(dc.ViewAndEditCartAgain);
    }

    @Then("Edit Product")
    public void editProduct() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.EditItem));
        dc.myClick(dc.EditItem);
    }

    @And("Increase qty")
    public void IncreaseQty() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.EditQty));
        dc.mySendKeys(dc.EditQty,"2");
    }

    @And("Update Cart Button Should Be Clickable")
    public void updateCartButtonShouldBeClickable() {
        Assert.assertTrue(dc.UpdateCart.isDisplayed());
    }

    @And("Click on Update Cart")
    public void clickOnUpdateCart() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dc.UpdateCart));
        dc.myClick(dc.UpdateCart);
    }

    @And("And Success message should be displayed")
    public void andSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.UpdateSuccessMessage.isDisplayed());
    }
}