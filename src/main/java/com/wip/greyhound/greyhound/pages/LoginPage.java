package com.wip.greyhound.greyhound.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage{
  

public LoginPage(WebDriver driver) {
    super(driver);
  }
  
  public void signout(){
    Actions action = new Actions(driver);
    WebElement we = driver.findElement(By.cssSelector("span[class='hi-member']"));
    action.moveToElement(we).build().perform();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    click(OR.getProperty("PASSWORD_FIELD"));
    System.out.println("this is vani changes");

}
  
}
