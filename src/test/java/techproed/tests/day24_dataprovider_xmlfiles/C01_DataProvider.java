package techproed.tests.day24_dataprovider_xmlfiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_DataProvider {


    @DataProvider(name = "googleUrunler")
    public static Object[][] urunler() {
        return new Object[][]{
                {"laptop"}, {"iphone"}, {"mouse"}, {"keyboard"}
        };
    }

    @DataProvider(name = "amazonUrunler")
    public static Object[][] amazonUrunler() {
        return new Object[][]{

                {"laptop"}, {"iphone"}, {"mouse"}, {"keyboard"}
        };
    }

    @Test(dataProvider = "googleUrunler")
    public void test01(String data) {

        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider ile istediğimiz arac isimlerini aratalım
        GooglePage googlePage = new GooglePage();
        ReusableMethods.wait(2);  //Google page a cookies handle koy.
        googlePage.searchBox.sendKeys(data, Keys.ENTER);

        //sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test(dataProvider = "amazonUrunler")
    public void test02(String data) {

        //amazon sayfasına gidelim,
        //aramakutusunda dataprovider'dan gelen verileri aratalım
        //sayfayı kapatınız

//amazon sayfasına gidelim,
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        //aramakutusunda dataprovider'dan gelen verileri aratalım
        AmazonPage amazonPage = new AmazonPage();

        amazonPage.handleCaptcha();

//aramakutusunda dataprovider'dan gelen verileri aratalım
        amazonPage.searchBox.sendKeys(data, Keys.ENTER);

//sayfayı kapatınız
        Driver.closeDriver();


    }
}