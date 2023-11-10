package com.HRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HRM.qa.base.TestBase;
import com.HRM.qa.pages.HomePage;
import com.HRM.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new LoginPage();	
	}

	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String loginPageTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
