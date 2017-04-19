package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CanadaSite extends BasePage {
	
	public CanadaSite(WebDriver driver) {
		super(driver);
	}
	
	public void canadaBookAtrip(){
		driver.findElement(By.xpath("//*[@id='services']")).click();
		//driver.findElement(By.cssSelector("a[id='services'][title='Services & Routes']")).click();
		//driver.findElement(By.cssSelector("#sarBoxBot1")).click();
		
	}


}
