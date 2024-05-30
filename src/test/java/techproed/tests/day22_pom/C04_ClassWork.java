package techproed.tests.day22_pom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C04_ClassWork {

    @Test
    public void test01() {

        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        //Sayfadan cikis yap ve cikis yapildigini test et
        //sayfayı kapatınız

//https://testcenter.techproeducation.com/index.php?page=form-authentication

        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));

        //Page object Model kullanarak sayfaya giriş yapildigini test edin

        TestCenterPage testCenterPage = new TestCenterPage();

        testCenterPage.userName.sendKeys(ConfigReader.getProperty("testCenterUserName"));
        testCenterPage.password.sendKeys(ConfigReader.getProperty("testCenterPassword"));
        testCenterPage.submitButton.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(testCenterPage.logoutButton.isDisplayed());

        testCenterPage.logoutButton.click();

        softAssert.assertEquals(Driver.getDriver().getTitle(), "Login");
        softAssert.assertAll();

        Driver.closeDriver();

    }
}
