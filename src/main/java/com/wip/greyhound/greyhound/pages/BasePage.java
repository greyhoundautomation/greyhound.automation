package com.wip.greyhound.greyhound.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	public static Properties OR;
	public static WebDriver driver;
	
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void loadORproperties(){
		
		OR = new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/wip/config/properties/OR.properties");
				OR.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public  String getORproperyValue(String key){
		
		return OR.getProperty(key);
	}

		public void loadUrl() {
			driver.get(getORproperyValue("HOME_URL"));
		}
		
	/*
		public void loadUrl(){
			
			driver.get("http://www.greyhound.com");
		}*/
		public void enterText(String css, String input){
			driver.findElement(By.cssSelector(css)).sendKeys(input);		
			}
						
		public void click(String css){
			driver.findElement(By.cssSelector(css)).click();		
			}	
		
	}




