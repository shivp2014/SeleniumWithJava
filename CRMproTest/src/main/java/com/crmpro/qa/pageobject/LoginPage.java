package com.crmpro.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crmpro.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement pasword;

	@FindBy(xpath = "//input[@class='btn btn-small']")
	public WebElement loginbutn;

	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
	public WebElement crmlogo;

	// iniatialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// actions

	public String validatelogintitle() {
		return driver.getTitle();
	}

	// image
	public boolean crmlogo() {
		return crmlogo.isDisplayed();
	}

	// login method
	public HomePage login(String un, String pwd) {
	//public String login(String un, String pwd) {
		
			username.sendKeys(un);
			pasword.sendKeys(pwd);
			loginbutn.click();
			return new HomePage();
			
	//return driver.getTitle();

	}

}
