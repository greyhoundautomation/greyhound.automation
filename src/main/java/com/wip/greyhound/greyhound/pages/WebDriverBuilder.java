package com.wip.greyhound.greyhound.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

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

      // initialize browser with all the preferences and capabilities
      if (prop.getProperty("browser").equals("chrome")) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("disable-infobars");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        options.addArguments("disable-extensions");
        prefs.put("credentials_enable_service", false);
        prefs.put("password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("chrome.switches", "--disable-extensions");
        options.addArguments("--test-type");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
            UnexpectedAlertBehaviour.ACCEPT);

        System.setProperty("webdriver.chrome.driver",
            (System.getProperty("user.dir") + "/chromedriver/chromedriver"));

        driver = new ChromeDriver(cap);
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
