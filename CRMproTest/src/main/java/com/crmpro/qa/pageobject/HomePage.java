package com.crmpro.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//td[contains(text(),'User: shiv bro')]")
	WebElement userLabel;
	
	
	public String verifyhomepageTitle() {
		return driver.getTitle();
	}
	public  boolean verifycorrectuser() {
		 //driver.switchTo;
		return userLabel.isDisplayed();
	}
	
}
