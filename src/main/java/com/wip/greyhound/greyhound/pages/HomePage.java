package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
    super(driver);
  }

  public void gotoLogin() {
    enterText(OR.getProperty("USERNAME_FIELD"), OR.getProperty("USER_EMAIL"));
    enterText(OR.getProperty("PASSWORD_FIELD"), OR.getProperty("PASSWORD"));
    click(OR.getProperty("SIGNIN_BUTTON"));
  }

  public void goToRegister() {

    System.out.println("check");
    System.out.println("check 2");
  }

}
