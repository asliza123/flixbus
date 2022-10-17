package com.dummy.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RankingDDxpathForICC {
	@Test
	public void findXpathForWomensRankingDdBtnTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.t20worldcup.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='site-tabs__link' and contains(text(),'ICC RANKINGS')]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String wd:allWindows)
		{
			if(wd.equals(parentWindow))
			{
				
			}
			else
				driver.switchTo().window(wd);
		}
		String rankingXpath = "//nav[@class='main-navigation__desktop-list js-desktop-nav']/descendant::button[contains(text(),'Rankings')]";
		driver.findElement(By.xpath(rankingXpath)).click();
		driver.findElement(By.xpath(rankingXpath+"/following-sibling::ul/descendant::button[contains(text(),'Women')]/following-sibling::ul/descendant::a[contains(text(),'Team Rankings')]")).click();
		//driver.quit();
	}

}
