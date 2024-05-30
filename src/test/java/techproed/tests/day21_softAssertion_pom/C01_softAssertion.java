package techproed.tests.day21_softAssertion_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C01_softAssertion {

    @Test
    public void softAssertion() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(2, 2);
        softAssert.assertTrue(30 < 8);
        softAssert.assertFalse(600 > 90);
        softAssert.assertNotEquals("selenium", "java");
        softAssert.assertAll();

        System.out.println("assertAll dan onceki test metodlarinda hata varsa bu kod calismaz");
    }

     /*
        SoftAssert un hata bulsa bile calismaya devam etme özelligi assertAll() methoduna kadardir
        Eger assertAll() da failed rapor edilirse calisma durdurulur,
        yani assertAll hard Assertion daki her bir assert gibi calisir
        hatayi yakalarsa calisma durur
         */

    @Test(groups = "smoke")
    public void hardAssertion() {

        //Eger hard assertion kullaniyorsak ilk failde testimiz durdurulur
        System.out.println("hard assertion");
        Assert.assertTrue(true);

        Assert.assertFalse(true);

        Assert.assertEquals(2, 3);

        System.out.println("hard assertionda ilk failde calisma durdurulur");
    }
}
