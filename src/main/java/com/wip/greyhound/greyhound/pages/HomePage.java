package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
  String usernameField = "input[name='username']";
  String username = "gtestsatyam1@gmail.com";
  String passwordField = "input[name='password']";
  String password = "satyam123";
  String submitButton = "#rewards-login-go";

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public void gotoLogin() {
    enterText(usernameField, username);
    enterText(passwordField, password);
    click(submitButton);
  }

  public void gotoMexicoSite(){
	  new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".menu-mex.menu-lang>a")));
	  click(".menu-mex.menu-lang>a");
	
  }


  public void goToRegister() {

    System.out.println("check..");
    System.out.println("check 2");
  }

}
