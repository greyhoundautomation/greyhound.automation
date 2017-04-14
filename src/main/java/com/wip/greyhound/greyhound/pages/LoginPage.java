package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
  String passwordField = "input[name='password']";
  String signoutButton = "a[href='/account']";
  String BookAtripTab = " .//a[contains(text(), 'Book a Trip')]";

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public int getMemberId() {
    new WebDriverWait(driver, 30)
        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("em[class='emblue']")));
    String id = driver.findElement(By.cssSelector("em[class='emblue']")).getText();
    int memberId = Integer.parseInt(id);
    System.out.println(memberId);
    return memberId;
  }

  public void signout() {
    Actions action = new Actions(driver);
    WebElement hoverOn = driver.findElement(By.cssSelector("span[class='hi-member']"));
    action.moveToElement(hoverOn);
    action.perform();
    new WebDriverWait(driver, 30)
        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("em[class='emblue']")));
    click(signoutButton);

  }

  public TripSearchResultsPage bookAtrip() {
    driver.findElement(By.xpath(BookAtripTab)).click();
    enterText(" #fromLocation", "San Francisco,CA");
    enterText(" #toLocation", "Allendale, NJ");
    click("#datepicker-from");
    WebElement next = driver.findElement(By.cssSelector(".next"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", next);

    click(".next");
    driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).click();
    click("#datepicker-to");   
    //JavascriptExecutor jse = (JavascriptExecutor)driver;
    //jse.executeScript("window.scrollBy(0,-800)", "");      
    //((JavascriptExecutor) driver).executeScript("scroll(0,-300)");
    click(".next");
    try {
 		Thread.sleep(3000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
    click(".next");
    driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]")).click();

    try {
 		Thread.sleep(3000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
  
    click("#fare-search-btn");
    
//    driver.findElement(By.xpath(BookAtripTab)).click();
    enterText(" #fromLocation", "San Francisco,CA");
    enterText(" #toLocation", "Allendale, NJ");
    click("#fare-search-btn");


    return new TripSearchResultsPage(driver);

  }
}
