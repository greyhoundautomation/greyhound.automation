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
	private String originDropdown = "#ctl00_body_listOrigin_Arrow";// a[@id='ctl00_body_listOrigin_Arrow']";
	private String destinationDropdown = "//a[@id='ctl00_body_listDestination_Arrow']";
	private String toLocationXpath = "//*[@id='ctl00_body_listDestination_DropDown']/div/ul/li[text()=";
	private String departingCalPopup = "//a[@id='ctl00_body_departureDate_popupButton']";
	private String depCalNextButton = "//a[@id='ctl00_body_departureDate_calendar_NN']";
	private String depDate = "//table[@id='ctl00_body_departureDate_calendar_Top']//tr[3]/td[2]/a";
	private String retPopup = "#ctl00_body_returningDate_popupButton";
	private String retCalNextButton = "#ctl00_body_returningDate_calendar_NN";
	private String retDate = "//table[@id='ctl00_body_returningDate_calendar_Top']//tr[3]/td[2]/a";
	private String passengerPopup = "#ctl00_body_passengers_Arrow";

	private String passengerNum = "//div[@id='ctl00_body_passengers_DropDown']/div/ul/li[3]";
	private String searchScheduleButton = "//a[@id='expHpBookingSearchTixBtn'][@title='Search Tickets']";
	// "#expHpBookingSearchTixBtn";
	private String assertOutput = "//div[@id='div_inner_content']/p[1]/b";
	private String errorMessageXpath = "//div[@id='exp-hp-validation']";

	public ExpressBookNowPage(WebDriver driver) {
		super(driver);
	}

	public void setTwoWayTrip() {
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

	public void setFromLocation(String fromLocationName) throws InterruptedException {
		Thread.sleep(3000);
		e1 = driver.findElement(By.cssSelector(originDropdown));
		e1.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(fromLocationXpath + "\'" + fromLocationName + "\'" + "]"))).click();
	}

	public void setToLocation(String toLocationName) throws InterruptedException {
		this.toLocationName = toLocationName;
		Thread.sleep(1000);
		clickByXpath(destinationDropdown);
		Thread.sleep(1000);
		clickByXpath(toLocationXpath + "\'" + toLocationName + "\'" + "]");
	}

	public void setDepartDate() {
		clickByXpath(departingCalPopup);
		clickByXpath(depCalNextButton);
		clickByXpath(depDate);
	}

	public void setReturningDate() throws InterruptedException {
		Thread.sleep(1000);
		click(retPopup);
		click(retCalNextButton);
		clickByXpath(retDate);
	}

	public void setPassenger() throws InterruptedException {
		click(passengerPopup);
		Thread.sleep(1000);
		clickByXpath(passengerNum);
	}

	public void searchSchedule() throws InterruptedException {
		Thread.sleep(1000);
		clickByXpath(searchScheduleButton);

	}

	public String getOutputPage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(assertOutput)));
		WebElement outputTitle = driver.findElement(By.xpath(assertOutput));
		String getTitle = outputTitle.getText();
		return getTitle;

	}

	public String getErrorMessageIfnotInputAllFeilds() {
		WebElement errorMessage = driver.findElement(By.xpath(errorMessageXpath));
		String errorText = errorMessage.getText();
		return errorText;

	}

}
