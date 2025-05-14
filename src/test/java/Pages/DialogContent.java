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


    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "FirstName": return this.FirstName;
            case "LastName": return this.LastName;
            case "Email": return this.Email;
            case "Password": return this.Password;
            case "ConfirmPassword": return this.ConfirmPassword;


        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()));

    }
}
