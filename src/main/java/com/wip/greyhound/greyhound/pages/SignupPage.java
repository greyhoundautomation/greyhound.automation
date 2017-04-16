package com.wip.greyhound.greyhound.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {
   String firstName="#yourfirstName";
   String lastName="#yourlastName";
   String birthDate="#dateOfBirth";
   String address="#youraddress";
   String address2="#youraddress2";
   String city="#yourcity";
   String state="#yourstate";
   String zip ="#yourzipcode";
   String phone = "#yourphone";
   String email = "#youremail";
   String confirmEmail="#confirmyouraddress";
   String password ="#yourpassword";
   String confirmPassword="#confirmyourpassword";
   String signup_btn=  "//*[@id='registrationForm']/button"; //"button[id='rewards-login-go']"; //"#rewards-login-go";
  
   String vacationChkbox="#vacation"; //#registrationForm fieldset:nth-child(3) div ul>li:nth-child(1) input[id="vacation"]
   String friendsChkbox="#friends";
  
  public SignupPage(WebDriver driver) {
    super(driver);
  }
  
  public void signup() throws InterruptedException{
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
   /* WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("vacation")));*/
    /*Thread.sleep(2000);
    WebElement vacChkbox = driver.findElement(By.id("vacation"));
    Actions action = new Actions(driver);
    action.moveToElement(vacChkbox).build().perform();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);*/
    
    driver.manage().window().maximize();
//    JavascriptExecutor jse = (JavascriptExecutor)driver;
//    WebElement signup = driver.findElement(By.cssSelector("#rewards-login-go"));
//    jse.executeScript("scroll(0, 250)");
//    jse.executeScript("arguments[0].scrollIntoView()",signup); 
    //vacChkbox.click(); */
    
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,2500)", "");
    driver.findElement(By.xpath(".//*[@id='termsColumn']/ul/li[1]/div/ins")).click();
    driver.findElement(By.xpath(".//*[@id='registrationForm']/button")).click();
    //click(signup_btn);
    
    
   }

   
  
  
  

}
