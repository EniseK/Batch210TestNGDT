package techproed.tests.day22_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_PageKullanimi {

    @Test
    public void test01() {
        //amazona gidelim
        //arama kutusunda selenium aratalim

        Driver.getDriver().get("https://amazon.com");

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.searchBox.sendKeys("selenium", Keys.ENTER);
    }

    @Test
    public void testPractice() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPracticePage amazonPracticePage = new AmazonPracticePage();

        amazonPracticePage.aramaKutusu.sendKeys("selenium");
    }
}
