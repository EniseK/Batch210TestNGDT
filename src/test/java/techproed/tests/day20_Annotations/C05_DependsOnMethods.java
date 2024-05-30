package techproed.tests.day20_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C05_DependsOnMethods {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(groups = "smoke")
    public void test01() {
        //amazona gidelim

        driver.get("https://amazon.com");
        //arama kutusuna selenium yazdiralim
        WebElement searhcbox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searhcbox.sendKeys("Selenium" + Keys.ENTER);
        // Assert.assertTrue(false);// dependsOnMethods sadece bagli oldugu testin sonucu pass olursa calisir yoksa ignore olur.

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        String resultText = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])")).getText();
        //sonuc yazisinin selenium icerdigini test edelim.

        Assert.assertTrue(resultText.contains("Selenium"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
