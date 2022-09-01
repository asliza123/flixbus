package com.dummy.demo;

import org.testng.annotations.Test;

import com.Dummy.generic.BaseClass;

public class Practice2 extends BaseClass{
@Test
	public void demoPracticeTest() {
		driver.get("https://flipkart.com"); 
		System.out.println("running the practice2"); 
	}
}
