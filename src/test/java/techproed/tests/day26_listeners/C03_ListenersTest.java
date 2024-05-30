package techproed.tests.day26_listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(techproed.utilities.Listeners.class)
public class C03_ListenersTest {

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void test01() {
        System.out.println("PASS");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void test02() {
        System.out.println("FAIL");
        Assert.assertTrue(false);
    }




}