package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpressBookNowPage extends BasePage {
  String region, fromLocation, toLocation, DepartDate, passenger;

  public ExpressBookNowPage(WebDriver driver) {
    super(driver);
  }


  public ExpressBookNowPage(String region, String fromLocation, String toLocation,
      String DepartDate, String passenger) {
    super(driver);
    this.region = region;
    this.fromLocation = fromLocation;
    this.toLocation = toLocation;
    this.DepartDate = DepartDate;
    this.passenger = passenger;
  }

  public void setTripType() {
    boolean roundTripBtnEnabled = driver.findElement(By.id("rbROUND_TRIP")).isEnabled();
    if (roundTripBtnEnabled) {
      driver.findElement(By.id("rbROUND_TRIP")).click();
    }


  }

  public void setRegion(String region) {
    this.region = region;
    driver.findElement(By.id("ctl00_body_listRegion_Arrow")).click();
    WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//div/ul/li[1][text()=" + region + "]")))
        .click();
  }


  public void setFromLocation(String fromLocation) {
    this.fromLocation = fromLocation;
  }


  public void setToLocation(String toLocation) {
    this.toLocation = toLocation;
  }


  public void setDepartDate(String departDate) {
    DepartDate = departDate;
  }


  public void setPassenger(String passenger) {
    this.passenger = passenger;
  }



  // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  // Thread.sleep(4000);
  //
  // driver.findElement(By.xpath("//*[@id='ctl00_body_listOrigin_Arrow']")).click();
  //
  // driver
  // .findElement(
  // By.xpath("//*[@id='ctl00_body_listOrigin_DropDown']/div/ul/li[text()='Red Deer']"))
  // .click();
  //
  // driver.findElement(By.id("ctl00_body_listDestination_Arrow")).click();

}
