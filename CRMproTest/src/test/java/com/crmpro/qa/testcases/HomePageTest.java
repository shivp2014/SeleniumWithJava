package com.crmpro.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crmpro.qa.base.TestBase;
import com.crmpro.qa.pageobject.HomePage;
import com.crmpro.qa.pageobject.LoginPage;
import com.crmpro.qa.utilities.TestUtil;

public class HomePageTest extends TestBase {
	 LoginPage loginp;
	 HomePage homepage;
	 TestUtil testutil;
	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		testutil=new TestUtil();
		loginp = new LoginPage();
		homepage=loginp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void verifyhomepage() {
		String hometitle=homepage.verifyhomepageTitle();
		Assert.assertEquals(hometitle, "CRMPRO","home page title is not matched");
	}
	@Test(priority=2)
	public void verifyusernme() {
		testutil.switchToframe();
		boolean user =homepage.verifycorrectuser();
		Assert.assertTrue(user);;
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
