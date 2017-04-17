package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TripSearchResultsPage extends BasePage {

  public TripSearchResultsPage(WebDriver driver) {
    super(driver);
  }
  
  //1. Update the existing tripdetails
  //2. verify update functionality working fine
  public void editTripDetails(){
    
    driver.get("https://www.greyhound.com/en/help-and-info/road-rewards/my-road-rewards");
//     clickxpath(".//*[@id='sbtrig-schedule']");
    //enterText("#fromLocation", "San Jose");
    //enterText("#toLocation", "San Diego");
    //click("#datepicker-from");
    //click(".next");
    //driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).click();
    // click("#datepicker-to");
    // click(".next");
    // driver.findElement(By.xpath(".//*[@id='dateto-datepicker']//span[10]")).click();
    // driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]")).click();
    // click("#update-search-btn");
    }

  //1.input the zipcode or city
  //2. get the search results
  //3. verify search results contains city related entries
  public void gotoFindYourBusStop(){
    }


}
