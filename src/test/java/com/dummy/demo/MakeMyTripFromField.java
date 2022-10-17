package com.dummy.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripFromField {
	@Test
	public void formFieldMakeMyTrip()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		//driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.findElement(By.id("fromCity")).sendKeys("blr");
		driver.findElement(By.xpath("//p[text()='POPULAR CITIES']/../following-sibling::ul/descendant::p[text()='Bengaluru, India']")).click();
	}

}
