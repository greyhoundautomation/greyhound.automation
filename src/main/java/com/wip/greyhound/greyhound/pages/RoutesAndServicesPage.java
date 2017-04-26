package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoutesAndServicesPage extends BasePage {


  public RoutesAndServicesPage(WebDriver driver) {
    // TODO Auto-generated constructor stub
    super(driver);
  }
  
  public  ExpressBookNowPage clickOnBookNowForCanadaTrip(){
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions
        .elementToBeClickable(By.xpath("//*[@id='sarBoxBot1'] [text()='Book Now']"))).click();
    return new ExpressBookNowPage(driver);
 
  
  }



}
