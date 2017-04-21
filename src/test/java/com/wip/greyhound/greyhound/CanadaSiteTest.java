package com.wip.greyhound.greyhound;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.CanadaSite;
import com.wip.greyhound.greyhound.pages.HomePage;
import com.wip.greyhound.greyhound.pages.WebDriverBuilder;

public class CanadaSiteTest {

  public static WebDriver driver;
  public Properties OR;


  public CanadaSiteTest() {
    driver = WebDriverBuilder.getDriver();
  }
  
@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

  @Ignore
  public void verifyCandaSiteNaviation() {
    HomePage home = new HomePage(driver);
    home.loadUrl();
    home.gotoCanadaSite();
    Assert.assertTrue(driver.getPageSource().contains("www.greyhound.ca"));

  }

  @Test
  public void verifiyCanadaTripBooking() throws InterruptedException {
    driver.get("http://www.greyhound.ca");
    CanadaSite canadaBooking = new CanadaSite(driver);
    canadaBooking.canadaBookAtrip();
    
   
  }

}
