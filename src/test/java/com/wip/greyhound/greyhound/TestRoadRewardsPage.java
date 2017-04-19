package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wip.greyhound.greyhound.pages.HelpandInfoPage;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.RoadRewardsPage;
import com.wip.greyhound.greyhound.pages.SignupPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TestRoadRewardsPage {
  public WebDriver driver;
  public Properties OR;


  public TestRoadRewardsPage() {
    driver = WebDriverBuilder.getDriver();
  }

  @Test
  public void verifyPageTitle() {
    HomePage home = new HomePage(driver);
    HelpandInfoPage HelpandInfo = new HelpandInfoPage(driver);
    RoadRewardsPage RRpage = new RoadRewardsPage(driver);
    home.loadUrl();
    home.goToHelpAndInfo();
    HelpandInfo.GotoRoadRewards();

    WebElement actualTitle = RRpage.Title(driver);
    System.out.println("this is the page tile " + actualTitle);
    String expectedTitle = "Road Rewards";
    // Assert.assertTrue(actualTitle.contains("Rewards"));
    // assertEquals(expectedTitle, actualTitle);
  }

  @Ignore
  public void verifySignup() { // throws InterruptedException{
    HomePage home = new HomePage(driver);
    HelpandInfoPage HelpandInfo = new HelpandInfoPage(driver);
    SignupPage RR_Signup = new SignupPage(driver);
    RoadRewardsPage RRpage = new RoadRewardsPage(driver);
    home.loadUrl();
    home.goToHelpAndInfo();
    HelpandInfo.GotoRoadRewards();
    RRpage.gotoSignup(driver);
    try {
      RR_Signup.signup();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Ignore
  public void verifyPageElements() {
    HomePage home = new HomePage(driver);
    HelpandInfoPage HelpandInfo = new HelpandInfoPage(driver);
    RoadRewardsPage RRpage = new RoadRewardsPage(driver);
    home.loadUrl();
    home.goToHelpAndInfo();
    HelpandInfo.GotoRoadRewards();
    Actions builder = new Actions(driver);
    WebElement element = RRpage.RRInfolinks(driver);
    builder.moveToElement(element).build().perform();
    element.click();

  }
}


