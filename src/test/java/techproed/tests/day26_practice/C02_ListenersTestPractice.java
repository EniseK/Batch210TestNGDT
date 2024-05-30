package techproed.tests.day26_practice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;



public class C02_ListenersTestPractice {

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
        throw new SkipException("test03 ignored");
    }

    @Test
    public void test04() {
        System.out.println("Exception");
        throw new NoSuchElementException();
    }

}
