package com.wip.greyhound.greyhound;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestHomePage {
  public WebDriver driver;
  public Properties OR;

  public TestHomePage() {
    driver = WebDriverBuilder.getDriver();
  }


  @Test
  public void login() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    assertTrue(driver.getCurrentUrl().endsWith("/my-road-rewards"));
    LoginPage login = new LoginPage(driver);
    Assert.assertEquals(172893321, login.getMemberId());
    login.signout();
    assertTrue(driver.getCurrentUrl().endsWith("help-and-info/road-rewards"));
  }

  @Ignore
  public void verifyMemberShipID() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    LoginPage login = new LoginPage(driver);
    Assert.assertEquals(172893321, login.getMemberId());
  }

  @Ignore
  public void logout() {


  }
}
