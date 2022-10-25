package com.dummy.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Dummy.pom.FlixBusBookingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlixBusBooking {

	@Test
	public void flixBusBookingForRoundTripTest()
	{
		int expAdultValue=4;
		int expChildValue=2;
		int expBikeValue=2;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://global.flixbus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		driver.findElement(By.id("searchInput-from")).sendKeys("paris");
		driver.findElement(By.xpath("//mark[text()='Paris']")).click();
		driver.findElement(By.id("searchInput-to")).sendKeys("rome");
		driver.findElement(By.xpath("//mark[text()='Rome']")).click();
		driver.findElement(By.id("dateInput-from")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @class='hcr-svg-arrow-right']")).click();
		driver.findElement(By.xpath("//h3[text()='December 2022']/ancestor::table/tbody/descendant::span[text()='23']")).click();
		//driver.findElement(By.id("dateInput-to")).click();
		driver.findElement(By.xpath("//h3[text()='December 2022']/ancestor::table/tbody/descendant::span[text()='29']")).click();
		driver.findElement(By.xpath("//label[text()='Passengers/Bikes']")).click();
		String adultValue = driver.findElement(By.xpath("//input[@id='search.form.label.adult']")).getAttribute("value");
		int actAdultValue= Integer.parseInt(adultValue);
		while(actAdultValue<expAdultValue)
		{
			driver.findElement(By.xpath("//input[@id='search.form.label.adult']/following-sibling::button")).click();
			actAdultValue++;
		}
		String childValue = driver.findElement(By.xpath("//input[@id='search.form.label.children']")).getAttribute("value");
		int actChildValue= Integer.parseInt(childValue);
		while(actChildValue<expChildValue)
		{
			driver.findElement(By.xpath("//input[@id='search.form.label.children']/following-sibling::button")).click();
			actChildValue++;
		}
		String bikeValue = driver.findElement(By.xpath("//input[@id='search.form.label.bike_slot']")).getAttribute("value");
		int actBikeValue= Integer.parseInt(bikeValue);
		while(actBikeValue<expBikeValue)
		{
			driver.findElement(By.xpath("//input[@id='search.form.label.bike_slot']/following-sibling::button")).click();
			actBikeValue++;
		}
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
	
	@Test()
	public void flixBusBookingForTripText() throws EncryptedDocumentException, IOException
	{
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\flixbusdetailsdata.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		String from = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		String to= wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		String deptMonth= wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
//		String deptYear= wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
//		String deptDate= wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
//		String retMonth= wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
//		String retYear= wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
//		String retDate= wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
//		String adltnum= wb.getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
//		String childnum= wb.getSheet("Sheet1").getRow(1).getCell(9).getStringCellValue();
//		String bikenum= wb.getSheet("Sheet1").getRow(1).getCell(10).getStringCellValue();
		int rown=getExcelRows("Sheet1");
		int count=1;
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
		System.out.println(deptMonth+":"+depYear+":"+depDate);
		System.out.println(retMonth+":"+retnYear+":"+retnDate);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://global.flixbus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		String[] data = null;
		for(int i=rown;i<=rown;i++)
		{
			data=new String[getExcelCells(sheet,i)];
			for(int j=0;j<getExcelCells(sheet,i);j++)
			{
				data[j] = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

}
