package com.Dummy.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CricbuzzPage {
	@FindBy(xpath="//a[@id='match-dropdown']/span[@class='cb-caret-down']")
	private WebElement matchDrpDwnBtn;
	@FindBy(xpath="//span[text()='India vs Hong Kong']")
	private WebElement indVsHKLink;
	@FindBy(xpath="//a[text()='Scorecard']")
	private WebElement scrBrdLink;
	@FindBy(xpath="//span[text()='India Innings']/ancestor::div[contains(@class,'cb-ltst-wgt-hdr')]/following-sibling::div[contains(@class,'cb-ltst-wgt-hdr')]/descendant::div[contains(@class,'text-right text-bold')]")
	private List<WebElement> wicketsXpath;
	
	
	

}
