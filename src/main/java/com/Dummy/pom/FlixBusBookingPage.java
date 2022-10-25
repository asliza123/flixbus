package com.Dummy.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlixBusBookingPage{
	static WebDriver driver;
	@FindBy(xpath="//label[text()='One Way']")
	private WebElement oneWayRadioBtn;
	@FindBy(xpath="//label[text()='Round Trip']")
	private WebElement roundtripRadioBtn;
	@FindBy(id="searchInput-from")
	private WebElement fromTxtField;
//	@FindBy(xpath="//mark[text()='Paris']")
//	private WebElement formPlace;
	@FindBy(id="searchInput-to")
	private WebElement toTxtField;
//	@FindBy(xpath="//mark[text()='Rome']")
//	private WebElement toPlace;
	@FindBy(id="dateInput-from")
	private WebElement departure;
//	@FindBy(xpath="//h3[text()='October 2022']/ancestor::table/tbody/descendant::span[text()='23']")
//	private WebElement departureDate;
//	@FindBy(xpath="//*[name()='svg' and @class='hcr-svg-arrow-right']")
//	private WebElement dateArrow;
//	@FindBy(id="dateInput-to")
//	private WebElement returnt;
//	@FindBy(xpath="//h3[text()='November 2022']/ancestor::table/tbody/descendant::span[text()='23']")
//	private WebElement returnDate;
	@FindBy(xpath="//label[text()='Passengers/Bikes']")
	private WebElement noOfPassenger;
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchBtn;
	@FindBy(xpath="//input[@id='search.form.label.adult']")
	private WebElement adultNumber;
	@FindBy(xpath="//input[@id='search.form.label.adult']/following-sibling::button")
	private WebElement addAdultNumber;
	@FindBy(xpath="//input[@id='search.form.label.children']")
	private WebElement childrenNumber;
	@FindBy(xpath="//input[@id='search.form.label.children']/following-sibling::button")
	private WebElement addChildrenNumber;
	@FindBy(xpath="//input[@id='search.form.label.bike_slot']")
	private WebElement numberOfBike;
	@FindBy(xpath="//input[@id='search.form.label.bike_slot']/following-sibling::button")
	private WebElement addNumberOfBike;
	
	public FlixBusBookingPage(WebDriver driver)
	{
		FlixBusBookingPage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOneWayRadioBtn() {
		return oneWayRadioBtn;
	}
	public WebElement getRoundtripRadioBtn() {
		return roundtripRadioBtn;
	}
	public WebElement getFromTxtField() {
		return fromTxtField;
	}
	public WebElement getToTxtField() {
		return toTxtField;
	}
	
	public WebElement getNoOfPassenger() {
		return noOfPassenger;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement getAdultNumber() {
		return adultNumber;
	}
	public WebElement getChildrenNumber() {
		return childrenNumber;
	}
	public WebElement getNumberOfBike() {
		return numberOfBike;
	}
	public WebElement getDeparture() {
		return departure;
	}
	

	public WebElement getAddAdultNumber() {
		return addAdultNumber;
	}

	public WebElement getAddChildrenNumber() {
		return addChildrenNumber;
	}

	public WebElement getAddNumberOfBike() {
		return addNumberOfBike;
	}
	
	public void selectDate(String month, int year, int date)
	{
		try {
		driver.findElement(By.xpath("//h3[text()='"+month+" "+year+"']/ancestor::table/tbody/descendant::span[text()='"+date+"']")).click();
		}
		catch(Exception e)
		{
		driver.findElement(By.xpath("//*[name()='svg' and @class='hcr-svg-arrow-right']")).click();
		selectDate(month,year,date);
		}
	}
	
	public void selectPlace(String placeNm)
	{
		driver.findElement(By.xpath("//mark[text()='"+placeNm+"']")).click();		
	}
	
	public void passengerDetails(int passengerNum,WebElement ele, WebElement elem)
	{
		String value= ele.getAttribute("value");
		int actAdultValue= Integer.parseInt(value);
		while(actAdultValue<passengerNum)
		{
			elem.click();
			actAdultValue++;
		}
	}
	
	public void selectTrip(String frm,String too,String depMonth, int depYear, int deptDate,String rtnMonth, int rtnYear, int rtnDate, int adultnum,int childnum, int bikenum)
	{
		if(rtnDate==0)
		{
			oneWayRadioBtn.click();
			fromTxtField.sendKeys(frm);
			selectPlace(frm);
			toTxtField.sendKeys(too);
			selectPlace(too);
			departure.click();
			selectDate(depMonth,depYear,deptDate);
			noOfPassenger.click();
			passengerDetails(adultnum, adultNumber, addAdultNumber);
			passengerDetails(childnum, childrenNumber, addChildrenNumber);
			passengerDetails(bikenum, numberOfBike, addNumberOfBike);
			searchBtn.click();
		}
		else
		{
			roundtripRadioBtn.click();
			fromTxtField.sendKeys(frm);
			selectPlace(frm);
			toTxtField.sendKeys(too);
			selectPlace(too);
			departure.click();
			selectDate(depMonth,depYear,deptDate);
			selectDate(rtnMonth,rtnYear,rtnDate);
			noOfPassenger.click();
			passengerDetails(adultnum, adultNumber, addAdultNumber);
			passengerDetails(childnum, childrenNumber, addChildrenNumber);
			passengerDetails(bikenum, numberOfBike, addNumberOfBike);
			searchBtn.click();
		}
		
	}

}
