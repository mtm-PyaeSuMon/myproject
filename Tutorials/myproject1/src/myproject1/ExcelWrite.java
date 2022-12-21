package myproject1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <h2>ExcelWriteClass</h2>
 * <p>
 * Process for DisplayingExcelWrite
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class ExcelWrite {

    /**
     * <h2>main
     * <p>
     *
     * </p>
     *
     * @param args
     * @throws IOException
     * @return void
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Student Data");
        XSSFRow row;
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
        studentData.put("1", new Object[] { "Roll No", "NAME", "Year" });
        studentData.put("2", new Object[] { "1", "Kyaw Kyaw", "2nd year" });
        studentData.put("3", new Object[] { "2", "Hla Thu Zar", "2nd year" });
        studentData.put("4", new Object[] { "3", "Zaw Zaw", "2nd year" });
        studentData.put("5", new Object[] { "4", "Pyone", "2nd year" });
        studentData.put("6", new Object[] { "5", "Mg Mg", "2nd year" });
        Set<String> keyid = studentData.keySet();
        int rowid = 0;
        for (String key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
        FileOutputStream out = new FileOutputStream(new File("C:/Users/PyaeSuMon/eclipse-workspace/StudentSheet.xlsx"));
        workbook.write(out);
        out.close();
    }

}
