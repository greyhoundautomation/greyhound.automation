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
	
<<<<<<< HEAD
=======
	public void loadUrl() {
	driver.get("http://www.greyhound.com");
	System.out.println(driver.getCurrentUrl());
	}
	
	public LoginPage gotoLogin() {
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("gtestsatyam1@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("satyam123");
		driver.findElement(By.cssSelector("#rewards-login-go")).click();
		return new LoginPage();
		
	}
>>>>>>> branch 'master' of https://github.com/aanpudur/GreyhoundTemp.git

	public void goToRegister() {
    
	}

}
