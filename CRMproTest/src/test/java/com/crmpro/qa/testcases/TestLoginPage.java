package com.crmpro.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crmpro.qa.base.TestBase;
import com.crmpro.qa.pageobject.HomePage;
import com.crmpro.qa.pageobject.LoginPage;

public class TestLoginPage  extends TestBase{
	
	public LoginPage login;
	HomePage homepage;
	public TestLoginPage() {
		super();
	}

	
	@BeforeMethod
	public void setup() {
		initialization();
		login=new LoginPage();
	}
	@Test(priority =1)
	public void testpagetitle() {
		String etitle = login.validatelogintitle();
		System.out.println(etitle);
		String atitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
		Assert.assertEquals(atitle, etitle);
	}
	
	@Test(priority=2)
	public void crmlogotest() {
		boolean flag =login.crmlogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority =3)
	public void testlogin() {
		//homepage =login.login(prop.getProperty("username"), prop.getProperty("password"));
		//String HomeTitle =login.login(prop.getProperty("username"), prop.getProperty("password"));
		//System.out.println(HomeTitle);
		//Assert.assertEquals(HomeTitle,"CRMPRO");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
