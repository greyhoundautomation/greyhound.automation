package com.wip.greyhound.greyhound.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBuilder {

  private static WebDriver driver = null;
  public static Properties prop = null;

  public static WebDriver getDriver() {
    if (driver == null) {
      // Initialize properties file
      prop = new Properties();
      try {
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir")
            + "/src/main/java/com/wip/config/properties/config.properties");
        prop.load(fs);

      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Something went wrong with your file");
      }

      // initialize browser
      if (prop.getProperty("browser").equals("chrome")) {
        System.setProperty("webdriver.chrome.driver",
            (System.getProperty("user.dir") + "/chromedriver/chromedriver"));
        driver = new ChromeDriver();
      } else if (prop.getProperty("browser").equals("firefox")) {

        System.setProperty("webdriver.gecko.driver",
            (System.getProperty("user.dir") + "/firefoxdriver/geckodriver"));
        System.setProperty("webdriver.gecko.driver",
            (System.getProperty("user.dir") + "/firefoxdriver/geckodriver"));

        driver = new FirefoxDriver();
      } else {
        System.setProperty("webdriver.chrome.driver",
            System.getProperty("user.dir") + "/chromedriver/chromedriver");
        driver = new ChromeDriver();
      }

    }
    return driver;
  }

}
