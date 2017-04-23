package com.wip.greyhound.greyhound.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CanadaSitePage extends BasePage {

  public CanadaSitePage(WebDriver driver) {
    super(driver);
  }

  public void canadaBookAtrip() throws InterruptedException {

    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div/ul/li[2]/a[@id='services' and @title='Services & Routes']"))).click();

    wait.until(ExpectedConditions
        .elementToBeClickable(By.xpath("//*[@id='sarBoxBot1'] [text()='Book Now']"))).click();
    boolean roundTripBtnEnabled = driver.findElement(By.id("rbROUND_TRIP")).isEnabled();
    if (roundTripBtnEnabled) {
      driver.findElement(By.id("rbROUND_TRIP")).click();
    }
    driver.findElement(By.id("ctl00_body_listRegion_Arrow")).click();
    wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//div/ul/li[1][text()='Alberta']")))
        .click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(4000);

    driver.findElement(By.xpath("//*[@id='ctl00_body_listOrigin_Arrow']")).click();

    driver
        .findElement(
            By.xpath("//*[@id='ctl00_body_listOrigin_DropDown']/div/ul/li[text()='Red Deer']"))
        .click();

    driver.findElement(By.id("ctl00_body_listDestination_Arrow")).click();

    Thread.sleep(4000);


  }
}
