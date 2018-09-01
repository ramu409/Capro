package com.CommonUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Data_Driven_design {
	WebDriver driver;
	
	
String path="E:\\Book1.xlsx";
//File path=new File("‪F://Medi1.xlsx/");
public String getdata(String sname,int rnum,int cnum) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException{
	Thread.sleep(2000);
	FileInputStream fis=new FileInputStream(path);
//			Workbook w=WorkbookFactory.create(fis);

	XSSFWorkbook w=new XSSFWorkbook(fis);
   XSSFSheet s=w.getSheet(sname);
	String data=s.getRow(rnum).getCell(cnum).getStringCellValue();
	
	return data;
	
}
public void setdata(String sname,int rnum,int cnum,String f) throws IOException{
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook w=new XSSFWorkbook(fis);
	XSSFSheet s=w.getSheet(sname);
	s.getRow(rnum).createCell(cnum).setCellValue(f);
	FileOutputStream fos=new FileOutputStream(path);
	w.write(fos);
	fis.close();
	fos.close();
	
}
}
