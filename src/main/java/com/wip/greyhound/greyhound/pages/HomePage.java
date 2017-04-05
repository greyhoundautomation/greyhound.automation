package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage  {
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public void gotoLogin() {
		//driver.findElement(By.cssSelector("intput[name='username']")).sendKeys("gtestsatyam1@gmail.com");
		enterText(OR.getProperty("USERNAME_FIELD"), OR.getProperty("USER_EMAIL"));												
		//enterText("#password", "satyam123");
		//click("#rewards-login-go");
		//return new LoginPage();
	}
	

	public void goToRegister() {
    
	}

}
