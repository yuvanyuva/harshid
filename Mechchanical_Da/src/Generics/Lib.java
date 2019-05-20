 package Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Lib implements IAutoConstant{
	 
	 public String getCellValue(String sheetNamew) throws EncryptedDocumentException, FileNotFoundException, IOException {
		 String ActualCellValue="";
		 Workbook wb = WorkbookFactory.create(new FileInputStream(Excel_Path));
		 Cell cellValue = wb.getSheet("ValidLoginData").getRow(1).getCell(0);
		 return ActualCellValue;
	 }

	 public int RowCount(String sheetName,int RowNum,int colNum) throws EncryptedDocumentException, FileNotFoundException, IOException {
		 int TotalRowCount=0;
		 Workbook wb= WorkbookFactory.create(new FileInputStream(Excel_Path));
		 int RowCount = wb.getSheet("InvalidLogindata").getLastRowNum();
		 return TotalRowCount;
	 }
	 public static String getPropertyValue(String propertyName) throws FileNotFoundException, IOException{
		 String PropertyValue=""; 
		 
		 Properties prop=new Properties();
		 prop.load(new FileInputStream(Configuration_file_Path));
		 String propertyValue = prop.getProperty(propertyName);
		 return PropertyValue;
	 }
	 
	public void getCaptureScreenshot(WebDriver driver) throws IOException {
	  Date d=new Date();
	  int currentDate = d.getDate();
	  TakesScreenshot t=(TakesScreenshot) driver;
	  File srcFile = t.getScreenshotAs(OutputType.FILE);
	  File destFile = new File(Screenshots_Path);
	  Files.copy(srcFile, destFile);
		 
	 }
	
	 
	 
	 
}
