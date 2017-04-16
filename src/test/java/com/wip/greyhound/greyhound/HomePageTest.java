package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.TripSearchResultsPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class HomePageTest {
  public static WebDriver driver;
  public Properties OR;


  public HomePageTest() {
    driver = WebDriverBuilder.getDriver();
  }

  @Test
  public void verifyLogin() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
  }

  @Test
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
    //home.closeBrowser();
  }

  @Test
  public void verifyBookingAtrip() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    LoginPage login = new LoginPage(driver);
    TripSearchResultsPage searchResultPage = login.bookAtrip();
    home.closeBrowser();


  }


}
