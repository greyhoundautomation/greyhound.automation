package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.MexicoSitePage;
import com.wip.greyhound.greyhound.pages.TripSearchResultsPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class HomePageTest {
	public static WebDriver driver;
	public Properties OR;

	public HomePageTest() {
		driver = WebDriverBuilder.getDriver();
	}

	@Ignore
	public void verifyLogin() {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		home.gotoLogin();
	}

	@Ignore
	public void verifyMemberId() {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		home.gotoLogin();
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals("172893321", login.getMemberId());
		home.closeBrowser();

	}

	@Ignore
	public void verifyLogout() {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		home.gotoLogin();
		LoginPage login = new LoginPage(driver);
		login.signout();
		Assert.assertTrue(driver.getCurrentUrl().endsWith("help-and-info/road-rewards"));
		// home.closeBrowser();
	}

	@Ignore
	public void verifyBookingAtrip() {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		home.gotoLogin();
		LoginPage login = new LoginPage(driver);
		TripSearchResultsPage searchResultPage = login.bookAtrip();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("https://www.greyhound.com/en/ecommerce/schedule", driver.getCurrentUrl());
		// home.closeBrowser();
	}
	
	@Test
	public void verifyMexicoSite(){
		HomePage home = new HomePage(driver);
		home.loadUrl();
		Assert.assertEquals("http://www.greyhound.com.mx/", driver.getCurrentUrl());
		
	}

}
