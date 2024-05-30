package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ZeroBankPage {

    public ZeroBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signinButton;

    @FindBy(id = "user_login")
    public WebElement loginBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy(id = "online-banking")
    public WebElement onlineBankingMoreButton;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsLink;

    @FindBy(partialLinkText = "Purchase Foreign Currency")
    public WebElement foreignCurrencyButton;

    @FindBy(id = "pc_currency")
    public WebElement currencyDdm;

    @FindBy(xpath = "//option[@value='EUR']")
    public WebElement euroZone;

    @FindBy(xpath = "//span[text()='1 euro (EUR) = 1.3862 U.S. dollar (USD)']")
    public WebElement euroRateText;

}
