package com.wip.greyhound.greyhound;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.BasePage;
import com.wip.greyhound.greyhound.pages.HelpandInfoPage;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.LoginPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestHomePage {
  public WebDriver driver;
  public Properties OR;

  public TestHomePage() {
    driver = WebDriverBuilder.getDriver();
  }

  @Ignore
  public void login() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoLogin();
    assertTrue(driver.getCurrentUrl().endsWith("/my-road-rewards"));
  }

  
//  public void logout() {
//    LoginPage login = new LoginPage(driver);
//    login.signout();
//  }
  
 @Test
 public void rewardsPoint() {
   HomePage home = new HomePage(driver);
   HelpandInfoPage HelpandInfo =  new HelpandInfoPage(driver);
   home.loadUrl();
   home.goToHelpAndInfo();
   HelpandInfo.GotoRoadRewards();
   
   
   
   
   
 }

}
