package techproed.tests.day23_pom_excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C05_Data_Provider {
    /*
        DataProvdier: TestNg de excel kullanmaksizin DataDriven Test yapabilmek DataProvider ile mumkundur
        Bunun icin öncelikle test methodumuzu olustururuz ve test notasyonundan sonra parametre olarak dataProvider
        yazariz ve bu dataprovider icin bir isim belirtiriz
        DataProvider multidimensional array return eder, buradan gelen her bir data seti icin test methodumuz
        tekrar tekrar calistirilir
         */

    @DataProvider
    public static Object[][] araclar() {
        return new Object[][]{

                {"mercedes"}, {"bmw"}, {"audi"}, {"honda"}
        };
    }


    @Test(dataProvider = "araclar")
    public void test01(String data) {


        System.out.println(data);


    }

    @DataProvider
    public static Object[][] emailPassword() {
        return new Object[][]{
                {"ali@can.com", "ali"}, {"veli@han.com", "veli"}, {"ahmet@san.com", "ahmet"}

        };
    }


    @Test(dataProvider = "emailPassword")
    public void test02(String email, String password) {
        System.out.println(email + " " + password);
    }
}
