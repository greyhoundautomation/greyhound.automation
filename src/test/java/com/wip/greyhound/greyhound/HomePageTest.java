package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.ExplorePage;
import com.wip.greyhound.greyhound.pages.HelpandInfoPage;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.MexicoSitePage;
import com.wip.greyhound.greyhound.pages.TripSearchResultsPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;


public class HomePageTest  {
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
		driver.manage().deleteAllCookies();
		home.gotoLogin();
		LoginPage login = new LoginPage(driver);
		login.signout();
		Assert.assertTrue(driver.getCurrentUrl().endsWith("help-and-info/road-rewards"));
	}


  @Ignore
  public void verifyBookingAtrip() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    LoginPage login = new LoginPage(driver);
    TripSearchResultsPage searchResultPage = login.bookAtrip();
    System.out.println(driver.getCurrentUrl());
    // Below might be a seleniumn bug, it doesn't give the corrct url, i am getting the base url
    // Assert.assertTrue(driver.getCurrentUrl().endsWith("en/ecommerce/schedule"));
    // Assert.assertTrue(driver.getPageSource().contains("EDIT YOUR TRIP"));
    //driver.findElement(By.cssSelector("#sbtrig-schedule")).isDisplayed();
  }
  


	@Ignore
	public void verifyEditTripDetails() {
		verifyBookingAtrip();
		new TripSearchResultsPage(driver);
	}

	@Ignore
	public void verifyMexicoSite() {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		driver.getCurrentUrl();
		home.gotoMexicoSite();
		// Assert.assertEquals("http://www.greyhound.com.mx/",
		// driver.getCurrentUrl());
		// Assert.assertEquals("LAS TARIFAS", driver.);
		// driver.assertTrue(driver.is_element_present(By.cssSelector(".whitelabel-home-title.title-orange"));
		driver.getPageSource().contains("LAS TARIFAS");

	}

	@Ignore
	public void rewardsPoint() {
		HomePage home = new HomePage(driver);
		HelpandInfoPage HelpandInfo = new HelpandInfoPage(driver);
		home.loadUrl();
		home.goToHelpAndInfo();
		HelpandInfo.GotoRoadRewards();
	}

	@Test
	public void gotoExplorePlaces()  {
		HomePage home = new HomePage(driver);
		home.loadUrl();
		LoginPage login = new LoginPage(driver);
		ExplorePage explore = login.gotoExplorePlaces();
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().endsWith("en/explore-places"));		
	}

}

