package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.BasePage;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestHomePage {
	public WebDriver driver;
	public Properties OR;
	
	public TestHomePage() {
		driver = WebDriverBuilder.getDriver();
		OR = BasePage.loadORproperties();
	}
	
@Test
public void login(){
	HomePage home = new HomePage(driver);
	home.loadUrl();
	home.gotoLogin();	
}

@Ignore
public void logout(){
	LoginPage login = new LoginPage(driver);
	login.signout();
}

}
