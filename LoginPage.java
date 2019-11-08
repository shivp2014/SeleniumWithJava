package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
     public LoginPage (WebDriver driver) {
    	 PageFactory.initElements(driver, this);
    	 this.driver=driver;
     }
     
    @FindBy(xpath ="//input[@id='j_username']")
    private WebElement username;
    
    @FindBy (xpath ="//input[@name='j_password']")
    WebElement password;
    
    @FindBy(xpath ="//input[@name='Submit']")
    WebElement submit;
    
    @FindBy(xpath ="//a[contains(text(),'New Item')]")
    WebElement newitem;
    
    public String validateLogin() {
		return driver.getTitle();
	}
    public void clickonSubmit() {
<<<<<<< HEAD
    	username.sendKeys("username");
    	password.sendKeys("password1");
=======
    	username.sendKeys("username1");
    	password.sendKeys("password");
>>>>>>> a342c39f0873946ac40c23a683a53bd4e9925994
    	submit.click();
    
}}
