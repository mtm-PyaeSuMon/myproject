package com.scm.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelImportExport {

    public static List<List<String>> importExcel(String filePath, String sheetName) throws IOException {
        List<List<String>> data = new ArrayList<>();

        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
            }

            for (Row row : sheet) {
                List<String> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    rowData.add(getCellValue(cell));
                }
                data.add(rowData);
            }
        }

        return data;
    }

    public static void exportExcel(List<List<String>> data, String filePath, String sheetName) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet(sheetName);

            for (int rowIndex = 0; rowIndex < data.size(); rowIndex++) {
                Row row = sheet.createRow(rowIndex);
                List<String> rowData = data.get(rowIndex);
                for (int columnIndex = 0; columnIndex < rowData.size(); columnIndex++) {
                    Cell cell = row.createCell(columnIndex);
                    cell.setCellValue(rowData.get(columnIndex));
                }
            }

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }
        }
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }

       CellType cellType=cell.getCellTypeEnum();
        if (cellType == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cellType == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else if (cellType == CellType.BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cellType == CellType.FORMULA) {
            return String.valueOf(cell.getCellFormula());
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String importFilePath = "C:\\Users\\PyaeSuMon\\eclipse-workspace\\Sheet1.xlsx";
        String importSheetName = "Sheet1";
        try {
            List<List<String>> importedData = ExcelImportExport.importExcel(importFilePath, importSheetName);
            for (List<String> row : importedData) {
                for (String cellValue : row) {
                    System.out.print(cellValue + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<List<String>> dataToExport = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        row1.add("Name");
        row1.add("Age");
        row1.add("Email");

        List<String> row2 = new ArrayList<>();
        row2.add("John");
        row2.add("25");
        row2.add("mailto:john@example.com");

        List<String> row3 = new ArrayList<>();
        row3.add("Alice");
        row3.add("30");
        row3.add("mailto:alice@example.com");
        
        dataToExport.add(row1);
        dataToExport.add(row2);
        dataToExport.add(row3);
        String exportFilePath = "C:\\Users\\PyaeSuMon\\eclipse-workspace\\Book1.xlsx";
        String exportSheetName = "ExportedData";
        try {
            ExcelImportExport.exportExcel(dataToExport, exportFilePath, exportSheetName);
            System.out.println("Excel file exported successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}