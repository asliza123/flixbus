package com.dummy.demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartWaterHeater {
	@Test
	public void addtoCartWaterHeaterTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@class,'VJZDxU') and @type='text']")).sendKeys("7205513484");
		driver.findElement(By.xpath("//input[contains(@class,'VJZDxU') and @type='password']")).sendKeys("asmita123");
		driver.findElement(By.xpath("//button[@type='submit']//span[text()='Login']")).click();
		System.out.println("before");
		WebElement srchBx = driver.findElement(By.name("q"));
		srchBx.click();
		srchBx.sendKeys("water heater");
		System.out.println("after");
		//driver.findElement(By.xpath("//span[contains(text(),'water heater')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@title='CRAFTIFY High Quality 1500 W Immersion Heater Rod']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String wd:allWindows)
		{
			if(wd!=parentWindow)
			{
				driver.switchTo().window(wd);
			}
		}
		driver.findElement(By.id("pincodeInputId")).sendKeys("560076");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		String confirmation="Delivery by";
		String actualconf = driver.findElement(By.xpath("//div[contains(text(),'"+confirmation+"')]")).getText();
		if(actualconf.contains(confirmation))
		{
			System.out.println("order is available and "+ actualconf);
		}
		driver.quit();
	}

}
