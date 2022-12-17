package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;
import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;

public class FinalLoginPractice {
	
	public static void getFinalLogin() {
		
	WebDriver driver = DriverManager.getBrowser("chrome");
	driver.manage().window().maximize();
SeleniumWait.getImplicitWait(driver, 5);

driver.navigate().to(Constants.URL);	
	
ScreenShot.getScreenShot(driver, "Home Page");
	
SeleniumPageFactory pf = new SeleniumPageFactory(driver);
	
	HighLighter.getColor(driver, pf.getSigninBtn().get(0), "red");
	//1st sign in	
	pf.getSigninBtn().get(0).click();
	ScreenShot.getScreenShot(driver, "Login Page");	
	//put email
	HighLighter.getColor(driver, pf.getEmail(), "green");	
pf.getEmail().sendKeys(Constants.user);
	//put pass
HighLighter.getColor(driver, pf.getPassword(), "blue");
pf.getPassword().sendKeys(Constants.password);
	//click 2nd sign in
HighLighter.getColor(driver, pf.getSecondSigninBtn(), "yellow");
pf.getSecondSigninBtn().click();
ScreenShot.getScreenShot(driver, "Login Validation");

if(driver.findElement(By.xpath("(//*[contains(text(),'Welcome')])[1]")).isDisplayed()) {//true
	
	System.out.println("Test passed");
}else {// not true
	System.out.println("Test failed");
}


SoftAssert sf = new SoftAssert();
sf.assertTrue(pf.getWelcome().get(0).isDisplayed());
sf.assertAll();

driver.quit();
	}
	
	public static void main(String[] args) {
		FinalLoginPractice.getFinalLogin();
	}

}
