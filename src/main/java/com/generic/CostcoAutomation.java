package com.generic;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.util.Constants;
import com.util.SeleniumWait;

public class CostcoAutomation {
	
	public static void productHandle(){
		
		WebDriver driver = DriverManager.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.navigate().to(Constants.COSTCO_URL);
		SeleniumWait.getImplicitWait(driver, 5);
		
System.out.println("Home page title/name = "+ driver.getTitle());
System.out.println("Current page URL = "+ driver.getCurrentUrl());		
SoftAssert sf = new SoftAssert();
sf.assertEquals(driver.getTitle(),Constants.COSTCO_URL);

sf.assertAll();
		}

	public static void main(String[] args) {
		CostcoAutomation.productHandle();
	}
}
