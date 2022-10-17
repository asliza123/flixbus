package com.dummy.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectSongFromYouTube {
	
	@Test
	public void selectAndPlaySongTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tumhe koi aur dekhe to jalta hai dil badi");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		List<WebElement> songs = driver.findElements(By.xpath("//a[@id='video-title']//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
		for(WebElement song:songs)
		{
			System.out.println(song.getAttribute("aria-label"));
			song.click();
		}
		System.out.println("song played");
		
	}

}
