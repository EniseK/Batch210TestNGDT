package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider(name = "positiveTestData")
    public static Object[][] provideBoundaryValueTestData() {
        return new Object[][]{

                {18},    // Alt sınır
                {30},  // Geçerli yaş
                {100},   // Üst sınır

        };
    }


    @DataProvider(name = "negativeTestData")
    public static Object[][] provideNegativeTestData() {
        return new Object[][]{
                {17},   // Alt sınırın altı
                {-1},  // Negatif değer
                {0},   // Sıfır
                {101}   // Üst sınırın üstü
        };


    }

}
