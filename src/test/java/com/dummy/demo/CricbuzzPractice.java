package com.dummy.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricbuzzPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[@id='match-dropdown']/span[@class='cb-caret-down']")).click();
		driver.findElement(By.xpath("//span[text()='India vs Hong Kong']")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		//driver.findElement(By.xpath("//div[@class=' cb-ovr-flo cb-text-complete' and contains(text(),'India won by')]")).click();
		
		//String numberOfWicket = driver.findElement(By.xpath("//span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::a[text()=' Yasim Murtaza ']/parent::div/following-sibling::div[contains(@class,'text-right text-bold')]")).getText();
		String wicketsXpath = "//span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::div[contains(@class,'text-right text-bold')]";
		List<WebElement> wickets = driver.findElements(By.xpath(wicketsXpath));
		//System.out.println(numberOfWicket);
		 ArrayList<Integer> wkts = new ArrayList<Integer>();
		 ArrayList<String> names= new ArrayList<String>();
		for(WebElement wkt:wickets)
		{
			String text = wkt.getText();
			int txt=Integer.parseInt(text);
			wkts.add(txt);
		}
		
		List<WebElement> bwlNm = driver.findElements(By.xpath(wicketsXpath+"/preceding-sibling::div/a"));
		for(int i=0;i<bwlNm.size();i++)
		{
			String blrNme=bwlNm.get(i).getText();
			names.add(i, blrNme);
		}
		System.out.println(names);
		System.out.println(wkts);
		int big=wkts.get(0);
		for(int i=0;i<wkts.size();i++)
		{
			if(wkts.get(0)>big)
			{
				big++;
			}
		}
		int hstWktIndex=0;
		for(int i=0;i<wkts.size();i++)
		{
			if(wkts.get(0)==big)
			{
				hstWktIndex=i;
			}
		}
		System.out.println(names.get(hstWktIndex)+" has taken "+wkts.get(hstWktIndex)+" wickets.");
		driver.close();
	}

}
 

