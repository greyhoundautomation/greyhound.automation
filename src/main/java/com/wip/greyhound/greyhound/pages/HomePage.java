package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
  String usernameField = "input[name='username']";
  String username = "gtestsatyam1@gmail.com";
  String passwordField = "input[name='password']";
  String password = "satyam123";
  String submitButton = "#rewards-login-go";
  // String helpandInfo= "nav[id='nav-main'] ul>li:nth-child(5)>a [href$='/en/discover-greyhound']";
  String helpandInfo = ".//*[@id='nav-main']/ul/li[5]/a";

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public void gotoLogin() {
    driver.findElement(By.cssSelector(usernameField)).sendKeys(username);
    driver.findElement(By.cssSelector(passwordField)).sendKeys(password);
    driver.findElement(By.cssSelector(submitButton)).click();
  }

  public void goToRegister() {

    System.out.println("check..");
    System.out.println("check 2");
  }

  public HelpandInfoPage goToHelpAndInfo() {
    click(helpandInfo);
    return new HelpandInfoPage(driver);
 }

}
