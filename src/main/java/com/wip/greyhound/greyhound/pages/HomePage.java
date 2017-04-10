package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.WebDriver;

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

  public void goToRegister() {

    System.out.println("check..");
    System.out.println("check 2");
  }

}
