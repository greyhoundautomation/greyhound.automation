package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CanadaSite extends BasePage {

	public CanadaSite(WebDriver driver) {
		super(driver);
	}

	public void canadaBookAtrip() {

		if (driver.getCurrentUrl() == "http://http://www.greyhound.ca") {
			driver.findElement(By.xpath("//div/ul/li[2]/a[@id='services' and @title='Services & Routes']")).click();
		} else {
			

		}

	}
}
