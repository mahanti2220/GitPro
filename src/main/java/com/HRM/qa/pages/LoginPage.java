package com.HRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.qa.base.TestBase;

public class LoginPage  extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")
	WebElement homePageTittle;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	
	// Initializing the Page Objects:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
		
		public String verifyLoginPageTitle(){
			return driver.getTitle();
		}

		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			    	
			    	
			return new HomePage();
		}

}
