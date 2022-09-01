package com.dummy.demo;

import org.testng.annotations.Test;

import com.Dummy.generic.BaseClass;

public class Practice extends BaseClass{
 @Test
 public void demoPracticeTest() {
 
	driver.get("https://amazon.in"); 
	System.out.println("doing for practice"); 
 }
}
