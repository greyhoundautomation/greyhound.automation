package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {
  String passwordField = "input[name='password']";
  String signoutButton = "a[href='/account']";

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public int getMemberId() {
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
    click(signoutButton);

  }

}
