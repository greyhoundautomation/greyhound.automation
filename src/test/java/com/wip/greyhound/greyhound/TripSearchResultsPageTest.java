package com.wip.greyhound.greyhound;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.TripSearchResultsPage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class TripSearchResultsPageTest {

  public WebDriver driver;
  public Properties OR;
 

  public TripSearchResultsPageTest() {
    driver = WebDriverBuilder.getDriver();
  }


  // public WebDriver driver;

  @Test
  public void verifyEditTripDetails() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    //HomePageTest homeTest = new HomePageTest();
    //homeTest.verifyBookingAtrip();
    TripSearchResultsPage editTrip = new TripSearchResultsPage(driver);
    System.out.println("test");
    editTrip.editTripDetails();
    System.out.println("test complete");

  }


  private void HomePageTest() {
    // TODO Auto-generated method stub
    
  }
}
