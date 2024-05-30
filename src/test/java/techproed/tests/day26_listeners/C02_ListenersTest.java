package techproed.tests.day26_listeners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class C02_ListenersTest {

    @Test
    public void test01() {
        System.out.println("PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test02() {
        System.out.println("FAIL");
        Assert.assertTrue(false);
    }

    @Test
    public void test03() {
        System.out.println("SKIP");
        throw new SkipException("test 03 ignore edildi");
    }
    @Test
    public void test04() {
        System.out.println("Exception");
        throw new NoSuchElementException("No Such Element");
    }
}
