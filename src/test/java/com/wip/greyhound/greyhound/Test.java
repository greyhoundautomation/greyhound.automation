package com.wip.greyhound.greyhound;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/qateam/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.greyhound.ca/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@id='pageContainer']/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='sarBoxBot1']")).click();
		driver.quit();
		

	}

}
