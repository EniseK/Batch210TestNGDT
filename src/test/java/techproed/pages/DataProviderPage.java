package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class DataProviderPage {
    public DataProviderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#age")
    public WebElement searchBox;

    @FindBy(xpath = "//*[.='Yaş doğrulandı!']")
    public WebElement positiveVerifyMessage;
}
