package com.wip.greyhound.greyhound.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	Properties prop;
	
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loadUrl() {
	driver.get("http://www.greyhound.com");
	}
	
	public LoginPage gotoLogin() {
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("gtestsatyam1@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("satyam123");
		driver.findElement(By.cssSelector("#rewards-login-go")).click();
		return new LoginPage();
	}

	public void goToRegister() {

	}

}
