package myproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File xlsFile = new File("C:/Users/PyaeSuMon/eclipse-workspace/StudentSheet.xlsx");
        FileInputStream inputStream = new FileInputStream(xlsFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                case STRING:
                    System.out.print(cell.getStringCellValue());
                    break;
                case BOOLEAN:
                    System.out.print(cell.getNumericCellValue());
                    break;
                default:
                    break;
                }
                System.out.print("| |");
            }
            System.out.println();

        }
        workbook.close();
        inputStream.close();
    }

}
