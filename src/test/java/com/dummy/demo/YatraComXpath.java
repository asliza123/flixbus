package com.dummy.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraComXpath {
	@Test 
	public void yatraXpathForDateTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		//driver.findElement(By.xpath("//div[@class='month-title' and contains(text(),'November')]"))
		driver.findElement(By.xpath("//div[@class='month-title' and contains(text(),'November')]/following-sibling::div[@class='day-container']/descendant::td[@id='05/11/2022']")).click();
		
	}


}
