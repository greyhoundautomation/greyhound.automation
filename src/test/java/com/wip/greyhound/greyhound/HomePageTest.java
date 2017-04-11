package com.wip.greyhound.greyhound;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class HomePageTest {
  public static WebDriver driver;
  public Properties OR;
  LoginPage login = new LoginPage(driver);


  public HomePageTest() {
    driver = WebDriverBuilder.getDriver();
  }

  @Ignore
  public void verifyLogin() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    assertTrue(driver.getCurrentUrl().endsWith("road-rewards/my-road-rewards"));
    home.closeBrowser();
  }

  @Test
  public void verifyMemberId() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    Assert.assertEquals(172893321, login.getMemberId());

  }

  @After
  public void closeBrowser() {
    HomePage home = new HomePage(driver);
    home.closeBrowser();

  }

  public void verifyLogout() {
    login.signout();
    assertTrue(driver.getCurrentUrl().endsWith("help-and-info/road-rewards"));
  }
}
