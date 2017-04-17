package com.wip.greyhound.greyhound.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplorePage extends BasePage{

	public ExplorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void getListOfPlaces(){
		List<WebElement> locations =driver.findElements(By.xpath("location-link"));
		
		for (WebElement webElement : locations) {
			System.out.println(webElement);			
		}
		
	}


}
