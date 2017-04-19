package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoadRewardsPage extends BasePage {
  static String pageTitle = ".col-md-12>h1";
  static String signup_btn = "a[class=\"btn 28\"]";
  static String rrInfoLink = ".dropdown-child>li>a";

  public RoadRewardsPage(WebDriver driver) {
    super(driver);
  }

  public SignupPage gotoSignup(WebDriver driver) {
    driver.findElement(By.cssSelector(signup_btn)).click();
    return new SignupPage(driver);
  }

  public WebElement RRInfolinks(WebDriver driver) {
    WebElement link1 = driver.findElement(By.cssSelector(rrInfoLink));
    return link1;
  }
}
