package com.dummy.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Dummy.pom.FlixBusBookingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlexibusBookingModified {
	int count=1;
	@Test
	public void flixBusBookingForTripText() throws EncryptedDocumentException, IOException
	{
		int rown=getExcelRows("Sheet1");
		while(count<=rown)
		{
			testForPerformAction();
		}
	}
	public void testForPerformAction() throws EncryptedDocumentException, IOException
	{
		String data[]=getExcelData("Sheet1",count++);
		String from = data[0];
		String to= data[1];
		String deptMonth= data[2];
		String deptYear= data[3];
		String deptDate= data[4];
		String retMonth= data[5];
		String retYear= data[6];
		String retDate= data[7];
		String adltnum= data[8];
		String childnum= data[9];
		String bikenum= data[10];
		int depYear=Integer.parseInt(deptYear);
		int depDate=Integer.parseInt(deptDate);
		int retnYear=Integer.parseInt(retYear);
		int retnDate=Integer.parseInt(retDate);
		int adultNum=Integer.parseInt(adltnum);
		int childNum=Integer.parseInt(childnum);
		int bikeNum=Integer.parseInt(bikenum);
//		System.out.println(deptMonth+":"+depYear+":"+depDate);
//		System.out.println(retMonth+":"+retnYear+":"+retnDate);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://global.flixbus.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FlixBusBookingPage fbb=new FlixBusBookingPage(driver);
		fbb.selectTrip(from, to, deptMonth, depYear, depDate, retMonth, retnYear, retnDate, adultNum, childNum, bikeNum);
	}

	public int getExcelRows(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\flixbusdetailsdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		int lastRowNum = sh.getLastRowNum();
		return lastRowNum;
	}
	public int getExcelCells(String sheet,int row) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\flixbusdetailsdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		short lastCellNum = wb.getSheet(sheet).getRow(row).getLastCellNum();
		return lastCellNum;
	}
	public String[] getExcelData(String sheet,int rown) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\flixbusdetailsdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String[] data=new String[getExcelCells(sheet,rown)];
			for(int j=0;j<getExcelCells(sheet,rown);j++)
			{
				data[j] = wb.getSheet("Sheet1").getRow(rown).getCell(j).getStringCellValue();
			}
		return data;
	}

}
