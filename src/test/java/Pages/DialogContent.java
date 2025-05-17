package Pages;

import Utilities.GWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage{

    public DialogContent(WebDriver driver) {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //User-register
    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "//span[text()='Create New Customer Account']")
    public WebElement FormPageTitle;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement FirstName;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement LastName;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement ConfirmPassword;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement SuccessMessage;

    @FindBy(xpath = "(//button[@data-action='customer-menu-toggle'])[1]")
    public WebElement DropdownMenu;

    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    public WebElement SignOutButton;

    //TC_705

    @FindBy(xpath = "//a[normalize-space(text())='Sign In']")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@name='login[username]']")
    public WebElement LoginEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement LoginPassword;

    @FindBy(xpath = "//button[@id='send2']")
    public WebElement SignButton;

    @FindBy(xpath = "//img[@alt='Hero Hoodie']")
    public WebElement SelectProduct;

    @FindBy(xpath = "//div[@option-id='169']")
    public WebElement SelectSize;

    @FindBy(xpath = "//div[@option-id='49']")
    public WebElement SelectColor;

    @FindBy(xpath = "//input[@class='input-text qty']")
    public WebElement SelectQty;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement AddToCart;

    @FindBy(xpath = "//div[@class='message-success success message']")
    public WebElement AdditionSuccessMessage;

    @FindBy(xpath = "//div[@data-block='minicart']//span[contains(@class, 'counter') and contains(@class, 'qty')]")
    public WebElement ClickToCart;

    @FindBy(xpath = "//span[text()='View and Edit Cart']")
    public WebElement ViewAndEditCart;

    @FindBy(xpath = "//a[@title='Remove item' and contains(@class, 'action-delete')]")
    public WebElement RemoveItem;

    @FindBy(xpath = "//a[text()='here']")
    public WebElement HereToContinue;

    @FindBy(xpath = "//img[@alt='Hero Hoodie']")
    public WebElement SelectNewProduct;

    @FindBy(xpath = "//div[@option-id='170']")
    public WebElement SelectNewSize;

    @FindBy(xpath = "//div[@option-id='52']")
    public WebElement SelectNewColor;

    @FindBy(xpath = "//input[@class='input-text qty']")
    public WebElement SelectNewQty;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement AddToCartAgain;

    @FindBy(xpath = "//div[@data-block='minicart']//span[contains(@class, 'counter') and contains(@class, 'qty')]")
    public WebElement ClickToCartAgain;

    @FindBy(xpath = "//span[text()='View and Edit Cart']")
    public WebElement ViewAndEditCartAgain;

    @FindBy(xpath = "//a[@title='Edit item parameters']")
    public WebElement EditItem;

    @FindBy(xpath = "//input[@class='input-text qty']")
    public WebElement EditQty;

    @FindBy(xpath = "//span[text()='Update Cart']")
    public WebElement UpdateCart;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement UpdateSuccessMessage;

    //TC_703

    @FindBy(xpath = "//li[@class='authorization-link']//a")
    public WebElement signHomePage;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signButton;

    @FindBy(xpath = "//*[@class='logged-in']")
    public WebElement accessSuccess;

    @FindBy(xpath = "//*[@role='add-address']")
    public WebElement addNewAddress;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//*[@id='country']//option[@value='TR']")
    public WebElement TR;

    @FindBy(xpath = "//*[@title='Street Address']")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@title='City']")
    public WebElement city;

    @FindBy(id = "zip")
    public WebElement postalCode;

    @FindBy(id = "telephone")
    public WebElement phoneNumber;

    @FindBy(id = "primary_billing")
    public WebElement buttonBillingAddress;

    @FindBy(id = "primary_shipping")
    public WebElement buttonShippingAddress;

    @FindBy(xpath = "//*[@title='Save Address']")
    public WebElement saveAddress;

    @FindBy(xpath = "//*[@role='alert']/div/div")
    public WebElement successMesage;

    @FindBy(xpath = "(//*[@data-th='Actions']/a/span)[1]")
    public WebElement edit1;

    @FindBy(xpath = "(//*[@data-th='Actions']/a/span)[3]")
    public WebElement edit2;

    @FindBy(xpath = "(//*[@data-th='Actions']/a)[2]")
    public WebElement delete;

    @FindBy(xpath = "(//*[@data-role='action'])[2]")
    public WebElement deleteOkButton;

    //TC707

    @FindBy(xpath = "//*[@id='search']")
    public WebElement search_SendKeysOnTheHomePage;

    @FindBy(xpath = "//*[@class='action search']")
    public WebElement searchButtonOnTheHomePage;

    @FindBy(xpath = "//*[@class='product-image-photo']")
    public WebElement imgLandoGymJacket;

    @FindBy(xpath = "//*[@class='page-title']/span")
    public WebElement prdctNameInsideImg;

    @FindBy(xpath = "//*[@itemprop='sku']")
    public WebElement skuMJ08;

    @FindBy(xpath = "//*[@class='message notice']/div")
    public WebElement searchNoResultsText;

    /// TC 704
    @FindBy(xpath = "//*[@id='accept-btn']//span")
    public WebElement cookie;
    @FindBy(xpath = "(//*[@class='greet welcome'])")
    public WebElement welcomeHeadText;

    //708 Wish List

    @FindBy(xpath = "//*[@name='login[username]']")
    public WebElement LogInEmail;

    @FindBy(xpath = "//*[@name='login[password]']")
    public WebElement LogInPassword;

    @FindBy(xpath = "//*[@id='send2']")
    public WebElement SignInButton2;

    @FindBy(xpath = "//*[contains(text(),'Welcome, Team5 Techno!')]")
    public WebElement WelcomeMessage;

    @FindBy(xpath = "//*[@class='action towishlist']")
    public WebElement addToWishList;

    @FindBy(xpath = "//*[@class='product-item-info']")
    public WebElement itemInList;

    @FindBy(xpath ="//*[@class='message-success success message']")
    public WebElement MessageForWishList;

    @FindBy(xpath = "(//*[@class='btn-remove action delete'])")
    public WebElement RemoveButton;

    @FindBy(xpath = "//*[contains(text(),'Lando Gym Jacket has been removed from your Wish List.')]")
    public WebElement MessageToRemove;






    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "FirstName": return this.FirstName;
            case "LastName": return this.LastName;
            case "Email": return this.Email;
            case "Password": return this.Password;
            case "ConfirmPassword": return this.ConfirmPassword;
            case "Email": return this.Email;
            case "Password": return this.Password;
            case "ConfirmPassword": return this.ConfirmPassword;
            case "cookie": return this.cookie;
            case "welcomeHeadText": return this.welcomeHeadText;


        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()));

    }
}