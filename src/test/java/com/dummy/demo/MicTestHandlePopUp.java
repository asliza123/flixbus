package com.dummy.demo;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MicTestHandlePopUp {
	@Test
	public void testMiceHandlePopUpTest()
	{
		ChromeOptions option=new ChromeOptions();
		HashMap<String, Integer> contentSetting=new HashMap<String, Integer>();
		HashMap<String, Object> profiles=new HashMap<String, Object>();
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		contentSetting.put("media_stream", 2);
		profiles.put("managed_default_content_settings", contentSetting);
		prefs.put("profile", profiles);
		option.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://mictests.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Test my mic']")).click();
		
	}

}
