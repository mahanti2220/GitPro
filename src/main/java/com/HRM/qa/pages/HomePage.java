package com.HRM.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.HRM.qa.base.TestBase;

public class HomePage extends TestBase{

	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
