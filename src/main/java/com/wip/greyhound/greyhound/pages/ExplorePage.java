package com.wip.greyhound.greyhound.pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplorePage extends BasePage {

  public ExplorePage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }

  public void getListOfPlaces() {
    List<WebElement> locations = driver.findElements(By.cssSelector(".city-title"));
    System.out.println("Go to Places");
    click(".show-more-btn");
    for (WebElement webElement : locations) {
      System.out.println(webElement.getText());
    }
  }
}
