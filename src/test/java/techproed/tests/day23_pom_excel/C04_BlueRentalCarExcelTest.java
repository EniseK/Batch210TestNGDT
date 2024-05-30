package techproed.tests.day23_pom_excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C04_BlueRentalCarExcelTest {

    @Test
    public void test01() {

        //BlueRentalCar Sayfasına gidelim

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Excel dosyamızdaki tüm email ve passwordler ile login olalım ve login olduğumuzu doğrulayalım

        String dosyaYolu = "src/test/java/techproed/resources/adminTestData.xlsx";
        String sayfaIsmi = "customer_info";
        ExcelReader excelReader = new ExcelReader(dosyaYolu, sayfaIsmi);
        BlueRentalPage blueRentalPage = new BlueRentalPage();

        for (int i = 1; i < excelReader.rowCount(); i++) {
            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);

            blueRentalPage.loginButton.click();

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);

            blueRentalPage.loginVerify.click();
            Assert.assertTrue(blueRentalPage.profile.isDisplayed());
            blueRentalPage.logOut.click();
            blueRentalPage.okButton.click();
            ReusableMethods.wait(1);


        }

    }
}
