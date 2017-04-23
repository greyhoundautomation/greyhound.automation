package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Ignore;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.TripSearchResultsPage;

public class TripSearchResultsPageTest {

  public WebDriver driver;
  public Properties OR;


  public TripSearchResultsPageTest() {
    driver = com.wip.greyhound.webdriverBuilder.WebDriverBuilder.getDriver();
  }


  @Ignore
  public void verifyEditTripDetails() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    TripSearchResultsPage editTrip = new TripSearchResultsPage(driver);
    System.out.println("test");
    editTrip.editTripDetails();
    System.out.println("test complete");

  }

  private void HomePageTest() {
    // TODO Auto-generated method stub

  }
}
