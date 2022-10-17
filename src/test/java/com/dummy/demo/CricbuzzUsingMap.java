package com.dummy.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricbuzzUsingMap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[@id='match-dropdown']/span[@class='cb-caret-down']")).click();
		driver.findElement(By.xpath("//span[text()='India vs Hong Kong']")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		ArrayList<String> al1=new ArrayList<String>();
		for(int i=1;i<=al1.size();i++)
		{
			String playerNm=driver.findElement(By.xpath("span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::div[contains(@class,'text-right text-bold')/preceding-sibling::div/a")).getText();
			al1.add(playerNm);
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		Iterator<String> it=al1.iterator();
		for(int i=0;i<=al.size();i++)
		{
			if(it.hasNext())
			{
				String name=it.next();
				String wicketNum=driver.findElement(By.xpath("//span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::div[contains(@class,'text-right text-bold')]")).getText();
				int wic= Integer.parseInt(wicketNum);
				al.add(wic);
			}
		}
		System.out.println(al);
		Iterator<Integer> it1=al.iterator();
		//span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::div[contains(@class,'text-right text-bold')/preceding-sibling::div/a
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int b=0;b<al1.size();b++)
		{
			map.put(al1.get(b), al.get(b));
		}
		int max= Collections.max(map.values());
			for(Entry<String, Integer> s:map.entrySet())
			{
				if(s.getValue()==max)
				{
					System.out.println(s.getKey()+" wickets "+s.getValue());
				}
			}
	}

}
