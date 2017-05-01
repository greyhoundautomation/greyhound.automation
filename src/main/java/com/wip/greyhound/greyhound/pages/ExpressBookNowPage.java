package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpressBookNowPage extends BasePage {
  String region, fromLocationName, toLocationName, DepartDate, passenger;

  // wait
  WebDriverWait wait = new WebDriverWait(driver, 8);

  // xpaths
  private String regionXpath = "//div/ul/li[1][text()=";
  private String fromLocationXpath ="//*[@id='ctl00_body_listOrigin_DropDown']/div/ul/li[text()=";


  public ExpressBookNowPage(WebDriver driver) {
    super(driver);
  }

  public ExpressBookNowPage(String region, String fromLocationName, String toLocationName,
      String DepartDate, String passenger) {
    super(driver);
    this.region = region;
    this.fromLocationName = fromLocationName;
    this.toLocationName = toLocationName;
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

    wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath(regionXpath + "\'" + region + "\'" + "]")))
        .click();
  }


  public void setFromLocation(String fromLocation) throws InterruptedException {
    this.fromLocationName = fromLocation;  
//    wait.until(ExpectedConditions.elementToBeSelected(fromLocationXpath));
//    driver.findElement(By.xpath("//a[@id='ctl00_body_listOrigin_Arrow']")).click();
//   

    wait.until(ExpectedConditions
        .elementToBeClickable(By.xpath(fromLocationXpath + "\'" + fromLocationName + "\'" + "]")))
        .click();
  }


  public void setToLocation(String toLocation) {
    this.toLocationName = toLocation;
  }


  public void setDepartDate(String departDate) {
    DepartDate = departDate;
  }


  public void setPassenger(String passenger) {
    this.passenger = passenger;
  }



  //
  // driver.findElement(By.id("ctl00_body_listDestination_Arrow")).click();

}
