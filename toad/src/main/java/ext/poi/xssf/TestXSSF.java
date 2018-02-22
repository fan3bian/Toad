package ext.poi.xssf;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestXSSF {
    public static void main(String[] args) throws IOException{
        //创建workbook
        Workbook wb = new XSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream("xworkbook.xls");
        //过滤非法字符,替换为' '
        String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]");
        Sheet sheet1 = wb.createSheet("new sheet");

        wb.write(fileOut);
    }
    public void testCell() throws IOException{
        Workbook wb = new HSSFWorkbook();
        //Workbook wb = new XSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("new sheet");

        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet.createRow(0);
        // Create a cell and put a value in it.
        Cell cell = row.createCell(0);
        cell.setCellValue(1);
        // Or do it on one line.
        row.createCell(1).setCellValue(1.2);
        row.createCell(2).setCellValue(
                createHelper.createRichTextString("This is a string"));
        row.createCell(3).setCellValue(true);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xls");
        wb.write(fileOut);
    }
}
