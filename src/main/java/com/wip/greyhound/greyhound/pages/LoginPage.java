package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	String passwordField = "input[name='password']";
	String BookAtripTab = " .//a[contains(text(), 'Book a Trip')]";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String getMemberId() {
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("em[class='emblue']")));
		String id = driver.findElement(By.cssSelector("em[class='emblue']")).getText();
		System.out.println(id);
		return id;
	}

	public void signout() {
		Actions action = new Actions(driver);
		WebElement hoverOn = driver.findElement(By.cssSelector("span[class='hi-member']"));
		action.moveToElement(hoverOn);
		action.perform();

		WebElement hoverOnSignout = driver.findElement(By.xpath("//a[@class='btn btn-tertiary'] [text()='Log Out'])"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverOnSignout);
		builder.click().build().perform();
		// action.moveToElement(hoverOnSignout);
		// action.perform();
		// new WebDriverWait(driver, 30)
		// .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn
		// btn-tertiary'] [text()='Log Out'])")));
		// Clicking doesn't work when the hovering is on. If hovering is
		// removed, element is not visible, tried with css selector didn't work
		// driver.findElement(By.xpath("//a[@class='btn btn-tertiary']
		// [text()='Log Out'])")).click();
	}

	public TripSearchResultsPage bookAtrip() {
		driver.findElement(By.xpath(BookAtripTab)).click();
		enterText(" #fromLocation", "San Francisco,CA");
		enterText(" #toLocation", "Allendale, NJ");
		click("#datepicker-from");
		click(".next");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).click();
		click("#datepicker-to");
		click(".datepicker-switch");
		driver.findElement(By.xpath(".//*[@id='dateto-datepicker']//span[12]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]")).click();
		click("#fare-search-btn");
		System.out.println(driver.getCurrentUrl());
		// needed to do this loop, as website has a bug - once the date is
		// selected, 
		// 'from' and 'to' input fields are getting cleared
		if (!driver.getCurrentUrl().endsWith("en/ecommerce/schedule")) {
			enterText(" #fromLocation", "San Francisco,CA");
			enterText(" #toLocation", "Allendale, NJ");
			click("#fare-search-btn");
		}

		return new TripSearchResultsPage(driver);
	}

}
