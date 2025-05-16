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








    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {

        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()));

    }
}
