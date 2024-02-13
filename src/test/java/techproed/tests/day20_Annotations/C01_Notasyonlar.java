package techproed.tests.day20_Annotations;

import org.testng.annotations.*;

public class C01_Notasyonlar {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Herseyden once beforeSuite notasyonuna sahip method 1 kez calisir.");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Herseyden sonra 1 kez calisir");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Testlerden once beforeTest notasyonuna sahip method 1 kez calisir");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Testlerden sonra afterTest notasyonuna sahip method 1 kez calisir");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Her class'tan once beforeClass notasyonuna sahip method 1 kez calisir");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Her class'tan sonra beforeClass notasyonuna sahip method 1 kez calisir");
    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @Test
    public void test01() {
        System.out.println("Test 01 calisti");
    }

    @Test
    public void test02() {
        System.out.println("Test 02 calisti");
    }

    @Test
    public void test03() {
        System.out.println("Test 03 calisti");
    }
}
