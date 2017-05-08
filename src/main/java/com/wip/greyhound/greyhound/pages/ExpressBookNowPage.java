package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpressBookNowPage extends BasePage {
	String region, fromLocationName, toLocationName, DepartDate, passenger;

	// wait
	WebDriverWait wait = new WebDriverWait(driver, 8);

	WebElement e1, e2, selectFromLocation;

	// xpaths
	private String regionArrow = "ctl00_body_listRegion_Arrow";
	private String regionXpath = "//div/ul/li[1][text()=";
	private String fromLocationXpath = "//*[@id='ctl00_body_listOrigin_DropDown']/div/ul/li[text()=";
	private String originDropdown = "//a[@id='ctl00_body_listOrigin_Arrow']";
	private String destinationDropdown = "//a[@id='ctl00_body_listDestination_Arrow']";
	private String toLocationXpath = "//*[@id='ctl00_body_listDestination_DropDown']/div/ul/li[text()=";
	private String departingCalPopup = "//a[@id='ctl00_body_departureDate_popupButton']";
	private String depCalNextButton ="//a[@id='ctl00_body_departureDate_calendar_NN']";
	private String DepDate ="//table[@id='ctl00_body_departureDate_calendar_Top']//tr[3]/td[2]/a";

	public ExpressBookNowPage(WebDriver driver) {
		super(driver);
	}

	public ExpressBookNowPage(String region, String fromLocationName, String toLocationName, String DepartDate,
			String passenger) {
		super(driver);
		this.region = region;
		this.fromLocationName = fromLocationName;
		this.toLocationName = toLocationName;
		this.DepartDate = DepartDate;
		this.passenger = passenger;
	}

	public void setTripType() {
		boolean roundTripBtnEnabled = driver.findElement(By.id("rbROUND_TRIP")).isEnabled();
		if (roundTripBtnEnabled) {
			driver.findElement(By.id("rbROUND_TRIP")).click();
		}
	}

	public void setRegion(String region) {
		this.region = region;
		driver.findElement(By.id(regionArrow)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(regionXpath + "\'" + region + "\'" + "]"))).click();
	}

	public void setFromLocation(String fromLocation) throws InterruptedException {
		this.fromLocationName = fromLocation;
		Thread.sleep(3000);
		e1 = driver.findElement(By.xpath(originDropdown));
		e1.click();
		// Thread.sleep(3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(fromLocationXpath + "\'" + fromLocationName + "\'" + "]"))).click();
	}

	public void setToLocation(String toLocation) throws InterruptedException {
		this.toLocationName = toLocation;
		Thread.sleep(3000);
		clickByXpath(destinationDropdown);
		Thread.sleep(3000);
		clickByXpath(toLocationXpath + "\'" + toLocationName + "\'" + "]");
	}

	//String departDate
	public void setDepartDate() {
		//this.DepartDate = departDate;
		clickByXpath(departingCalPopup);
		clickByXpath(depCalNextButton);
		clickByXpath(DepDate);		
	}



	//
	// driver.findElement(By.id("ctl00_body_listDestination_Arrow")).click();

}
