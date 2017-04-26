package com.wip.greyhound.greyhound;


import java.util.Properties;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.CanadaSitePage;
import com.wip.greyhound.greyhound.pages.ExpressBookNowPage;
import com.wip.greyhound.greyhound.pages.RoutesAndServicesPage;


public class CanadaSiteTest {

  public static WebDriver driver;
  public Properties OR;


  public CanadaSiteTest() {
    driver = com.wip.greyhound.WebDriverBuilder.getDriver();
  }

  @Before
  public void setUp() throws Exception {
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  }

  @Test
  public void verifyCandaSiteNaviation() {
    driver.get("https://www.greyhound.ca/");
    CanadaSitePage canadaSite = new CanadaSitePage(driver);
    RoutesAndServicesPage servicesPage = canadaSite.clickingRoutesAndServices();
    ExpressBookNowPage bookNowPage = servicesPage.clickOnBookNowForCanadaTrip();
    bookNowPage.setTripType();
    bookNowPage.setRegion("Alberta");

  }

}
