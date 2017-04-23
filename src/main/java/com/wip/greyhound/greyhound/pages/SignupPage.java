package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {
  String firstName = "#yourfirstName";
  String lastName = "#yourlastName";
  String birthDate = "#dateOfBirth";
  String address = "#youraddress";
  String address2 = "#youraddress2";
  String city = "#yourcity";
  String state = "#yourstate";
  String zip = "#yourzipcode";
  String phone = "#yourphone";
  String email = "#youremail";
  String confirmEmail = "#confirmyouraddress";
  String password = "#yourpassword";
  String confirmPassword = "#confirmyourpassword";
  String signup_btn = "//*[@id='registrationForm']/button";
  String vacationChkbox = "#vacation";
  String friendsChkbox = "#friends";

  public SignupPage(WebDriver driver) {
    super(driver);
  }

  public void signup() throws InterruptedException {
    enterText(firstName, "Jock");
    enterText(lastName, "Williams");
    enterText(birthDate, "01/01/1980");
    enterText(address, "1000 Amphitheater pkway");
    enterText(address2, "Suite 210");
    enterText(city, "MountainView");
    enterText(state, "California");
    enterText(zip, "94043");
    enterText(phone, "4088888888");
    enterText(email, "test.dev.d10m@gmail.com");
    enterText(confirmEmail, "test.dev.d10m@gmail.com");
    enterText(password, "gh123");
    enterText(confirmPassword, "gh123");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,2500)", "");
    driver.findElement(By.xpath(".//*[@id='termsColumn']/ul/li[1]/div/ins")).click();
    driver.findElement(By.xpath(".//*[@id='registrationForm']/button")).click();
  }



}
