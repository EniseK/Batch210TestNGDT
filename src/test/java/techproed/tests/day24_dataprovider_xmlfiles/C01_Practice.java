package techproed.tests.day24_dataprovider_xmlfiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_Practice {
    @DataProvider(parallel = true)
    public static Object[][] Amazon() {
        return new Object[][]{

                {"bicycle"}, {"trolley"}, {"unicycle"}, {"trike"}, {"ebike"}, {"wagon"}
        };
    }
    //amazon sayfasına gidelim,
    //aramakutusunda dataprovider'dan gelen verileri aratalım
    //sayfayı kapatınız


    @Test(dataProvider = "Amazon")
    public void testAmazon(String data) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        AmazonPage amazonPage = new AmazonPage();

        amazonPage.handleCaptcha();

        amazonPage.searchBox.sendKeys(data);
    }


}
