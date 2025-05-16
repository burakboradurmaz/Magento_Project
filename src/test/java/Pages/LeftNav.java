package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav(WebDriver driver) {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//*[@data-action='customer-menu-toggle'])[1]")
    public WebElement menu;

    @FindBy(xpath="(//*[@data-target='dropdown']//li//a)[1]")
    public WebElement myAccount;

    @FindBy(xpath="(//*[@class='nav item'])[5]/a")
    public WebElement addressBook;


    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {

        }

        return null;
    }


}
