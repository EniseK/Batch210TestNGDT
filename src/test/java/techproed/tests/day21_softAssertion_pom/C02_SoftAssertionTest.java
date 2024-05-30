package techproed.tests.day21_softAssertion_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C02_SoftAssertionTest {
    @Test
    public void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- amazon anasayfaya gidin
        driver.get("https://amazon.com");

        // 2- title'in Amazon icerdigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("rAmazon"), "title Amazon icermiyor");

        // 3- Arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(), "arama kutusu erisilebilir degil");

        // 4- arama kutusuna selenium yazip aratin
        aramaKutusu.sendKeys("selenium" + Keys.ENTER);

        // 5- arama yapildigini test edin
        WebElement sonucYazisiWebemeneti = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        softAssert.assertTrue(sonucYazisiWebemeneti.isDisplayed(), "sonuc yazisi weblementi gorulmedi");

        // 6- arama sonucunun selenium icerdigini test edin
        softAssert.assertTrue(sonucYazisiWebemeneti.getText().contains("slenium"), "arama sonucu selenium icermiyor");

        softAssert.assertAll();
    }
}