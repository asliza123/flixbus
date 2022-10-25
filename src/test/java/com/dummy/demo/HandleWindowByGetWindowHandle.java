package com.dummy.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowByGetWindowHandle {

@Test
public void openNewWindowAndClose() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement searchbx = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbx.click();
	searchbx.sendKeys("iphone14");
	driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction' and contains(text(),'iphone14')]")).click();
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	String parentWindow=driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	for(String w:allWindows)
	{
	if(w == parentWindow)
	{
	driver.switchTo().window(w);
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
	}
	}
	Thread.sleep(5000);
	for(String w:allWindows)
	{
	if(w != parentWindow)
	{
	driver.switchTo().window(w);
	driver.close();
	}
	}
	
}

}
