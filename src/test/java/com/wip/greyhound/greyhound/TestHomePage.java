package com.wip.greyhound.greyhound;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.BasePage;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestHomePage {
	public WebDriver driver;
	
	public TestHomePage() {
		driver = WebDriverBuilder.getDriver();
	}
	
@Test
public void login(){
	HomePage home = new HomePage(driver);
	BasePage.loadORproperties();
	home.loadUrl();
	home.gotoLogin();	
}

@Test
public void logout(){
	LoginPage login = new LoginPage(driver);
	login.signout();
}

}
