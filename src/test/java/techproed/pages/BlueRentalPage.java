package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Login']")
    public WebElement loginButton;

    @FindBy(id = "formBasicEmail")
    public WebElement email;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(id = "dropdown-basic-button")
    public WebElement loginVerify;

    @FindBy(xpath = "//*[contains( text(),'User with email' )]")
    public WebElement negativeLoginVerify;

    @FindBy(partialLinkText = "Profile")
    public WebElement profile;

    @FindBy(xpath = "//em")
    public WebElement profileEmail;


    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;


}