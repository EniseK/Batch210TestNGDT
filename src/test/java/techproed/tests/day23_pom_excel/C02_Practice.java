package techproed.tests.day23_pom_excel;

import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.Test;
import techproed.utilities.ExcelReader;

public class C02_Practice {
    @Test
    public void test01() {
        ExcelReader excelReader = new ExcelReader("src/test/java/techproed/resources/adminTestData.xlsx", "customer_info");

      String email= excelReader.getCellData(0,0);
      String password  = excelReader.getCellData(0,1);

        System.out.println("email = " + email);
        System.out.println("password = " + password);
}}
