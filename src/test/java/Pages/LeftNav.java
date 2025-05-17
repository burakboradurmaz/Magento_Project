package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "(//*[@class='authorization-link'])[1]//a")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='ui-id-3']")
    public WebElement headMenuWhatsNewButton;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li")
    public List<WebElement> topMenu;

    //___________________Women____________________________//
    @FindBy(xpath = "(//*[text()='Women'])[1]")
    public WebElement headMenuWomenButton;

    @FindBy(xpath = "(//*[text()='Tops'])[1]")
    public WebElement subMenuWomenTopButton;

    @FindBy(xpath = "(//*[text()='Jackets'])[1]")
    public WebElement subMenuWomenJacketsButton;

    @FindBy(xpath = "(//*[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement headMenuHoodiesButton;

    @FindBy(xpath = "(//*[text()='Tees'])[1]")
    public WebElement subMenuWomenTeesButton;

    @FindBy(xpath = "(//*[text()='Bras & Tanks'])[1]")
    public WebElement subMenuWomenBrasButton;


    //_____________________Men__________________________//
    @FindBy(xpath = "//*[text()='Men']")
    public WebElement headMenuMenButton;

    @FindBy(xpath = "(//*[text()='Tops'])[2]")
    public WebElement subMenuMenTopButton;

    @FindBy(xpath = "(//*[text()='Jackets'])[2]")
    public WebElement subMenuMenJacketsButton;

    @FindBy(xpath = "(//*[text()='Hoodies & Sweatshirts'])[2]")
    public WebElement subMenuMenHoodiesButton;

    @FindBy(xpath = "(//*[text()='Tees'])[2]")
    public WebElement subMenuMenTeesButton;

    @FindBy(xpath = "(//*[text()='Tanks'])[1]")
    public WebElement subMenuMenTanksButton;


    @FindBy(xpath = "(//*[text()='Pants'])[2]")
    public WebElement subMenuMenPantsButton;

    @FindBy(xpath = "(//*[text()='Shorts'])[2]")
    public WebElement subMenuMenShortsButton;

    @FindBy(xpath = "(//*[text()='Bottoms'])[2]")
    public WebElement subMenuMenBottomsButton;

    //___________________Gear____________________________//
    @FindBy(xpath = "//*[text()='Gear']")
    public WebElement headMenuGearButton;

    @FindBy(xpath = "//*[text()='Bags']")
    public WebElement subMenuGearBagsButton;

    @FindBy(xpath = "//*[text()='Fitness Equipment']")
    public WebElement subMenuGearFitnessButton;

    @FindBy(xpath = "//*[text()='Watches']")
    public WebElement subMenuGearWatchesButton;




    //_____________________Training__________________________//
    @FindBy(xpath = "//*[text()='Training']")
    public WebElement headMenuTrainingButton;

    @FindBy(xpath = "//*[text()='Video Download']")
    public WebElement subMenuTrainingDownloadButton;

    //_____________________Sale__________________________//
    @FindBy(xpath = "//*[text()='Sale']")
    public WebElement headMenuSaleButton;

    //_____________________whatsNew__________________________//
    @FindBy(xpath = "//*[@id='ui-id-3']//span")
    public WebElement whatsNewButton;

    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "signInButton": return this.signInButton;
            case "headMenuWhatsNewButton": return this.headMenuWhatsNewButton;
            case "headMenuWomenButton": return this.headMenuWomenButton;
            case "subMenuWomenTopButton": return this.subMenuWomenTopButton;
            case "subMenuWomenJacketsButton": return this.subMenuWomenJacketsButton;
            case "headMenuHoodiesButton": return this.headMenuHoodiesButton;
            case "subMenuWomenTeesButton": return this.subMenuWomenTeesButton;
            case "subMenuWomenBrasButton": return this.subMenuWomenBrasButton;
            case "headMenuMenButton": return this.headMenuMenButton;
            case "subMenuMenTopButton": return this.subMenuMenTopButton;
            case "subMenuMenJacketsButton": return this.subMenuMenJacketsButton;
            case "subMenuMenHoodiesButton": return this.subMenuMenHoodiesButton;
            case "subMenuMenTeesButton": return this.subMenuMenTeesButton;
            case "subMenuMenTanksButton": return this.subMenuMenTanksButton;
            case "subMenuMenPantsButton": return this.subMenuMenPantsButton;
            case "subMenuMenShortsButton": return this.subMenuMenShortsButton;
            case "subMenuMenBottomsButton": return this.subMenuMenBottomsButton;
            case "headMenuGearButton": return this.headMenuGearButton;
            case "subMenuGearBagsButton": return this.subMenuGearBagsButton;
            case "subMenuGearFitnessButton": return this.subMenuGearFitnessButton;
            case "subMenuGearWatchesButton": return this.subMenuGearWatchesButton;
            case "headMenuTrainingButton": return this.headMenuTrainingButton;
            case "subMenuTrainingDownloadButton": return this.subMenuTrainingDownloadButton;
            case "headMenuSaleButton": return this.headMenuSaleButton;
            case "whatsNewButton": return this.whatsNewButton;
        }

        return null;
    }


}
