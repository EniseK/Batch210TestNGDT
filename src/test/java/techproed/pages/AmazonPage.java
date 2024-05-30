package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonPage {
    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu clasttaki ogeleri
     driver ile eslestirir, Bu sayde classtaki webelementlere erismek icin @FindBy
     gibi PageFactory'e yardimci notasyonlar kullanilabilir bir hale gelir
     */
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Try different image']")
    public WebElement captchaHandling;

    public void handleCaptcha() {
        ReusableMethods.click(captchaHandling);
    }
}
