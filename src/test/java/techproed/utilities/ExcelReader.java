package techproed.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    Workbook workbook;

    Sheet sheet;

    public ExcelReader(String filePath, String pageName) {


        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(pageName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public String getCellData(int row, int col) {
        Cell cell = sheet.getRow(row).getCell(col);
        return cell.toString();
    }

    public int rowCount() {
        return sheet.getLastRowNum();
    }


}
