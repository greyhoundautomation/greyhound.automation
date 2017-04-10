package com.wip.greyhound.greyhound.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
  public static Properties OR;
  public static WebDriver driver;

  public BasePage(WebDriver driver) {
    BasePage.driver = driver;
  }

  public void loadUrl() {
    driver.get("http://www.greyhound.com");
  }

  public void enterText(String css, String input) {
    driver.findElement(By.cssSelector(css)).sendKeys(input);
  }

  public void click(String css) {
    driver.findElement(By.cssSelector(css)).click();
  }

  public void close() {
    driver.quit();
  }

}
