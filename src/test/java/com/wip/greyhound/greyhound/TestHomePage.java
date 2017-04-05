package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestHomePage {
	public WebDriver driver;
	

	public TestHomePage() {
		driver = WebDriverBuilder.getDriver();
	}
	
@Test
public void login(){
	HomePage home = new HomePage(driver);
	home.loadORproperties();
	home.loadUrl();
	home.gotoLogin();	
}

}
