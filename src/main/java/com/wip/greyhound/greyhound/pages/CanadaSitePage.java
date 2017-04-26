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

  public RoutesAndServicesPage clickingRoutesAndServices() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div/ul/li[2]/a[@id='services' and @title='Services & Routes']"))).click();
    return new RoutesAndServicesPage(driver);

  }
}
