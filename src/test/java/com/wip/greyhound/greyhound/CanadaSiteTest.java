package com.wip.greyhound.greyhound;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wip.greyhound.greyhound.pages.CanadaSitePage;
import com.wip.greyhound.greyhound.pages.ExpressBookNowPage;
import com.wip.greyhound.greyhound.pages.RoutesAndServicesPage;

public class CanadaSiteTest {

	public static WebDriver driver;
	public Properties OR;
	String outputTitle = "SELECT A DEPARTURE:";
	String expErrorText = "Please fill the required fields.";

	public CanadaSiteTest() {
		driver = com.wip.greyhound.WebDriverBuilder.getDriver();
	}

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.greyhound.ca/");
	}

	@Ignore
	public void verifyRoundtripSearchResults() throws InterruptedException {
		CanadaSitePage canadaSite = new CanadaSitePage(driver);
		RoutesAndServicesPage servicesPage = canadaSite.clickingRoutesAndServices();
		ExpressBookNowPage bookNowPage = servicesPage.clickOnBookNowForCanadaTrip();
		bookNowPage.setTwoWayTrip();
		bookNowPage.setRegion("Alberta");
		bookNowPage.setFromLocation("Red Deer");
		bookNowPage.setToLocation("Grassland");
		bookNowPage.setDepartDate();
		bookNowPage.setReturningDate();
		bookNowPage.setPassenger();
		bookNowPage.searchSchedule();
		String veriTitle = bookNowPage.getOutputPage();
		Assert.assertEquals(veriTitle, outputTitle);
	}

	@Ignore
	public void verifyOnewaytripSearchResults() throws InterruptedException {
		CanadaSitePage canadaSite = new CanadaSitePage(driver);
		RoutesAndServicesPage servicesPage = canadaSite.clickingRoutesAndServices();
		ExpressBookNowPage bookNowPage = servicesPage.clickOnBookNowForCanadaTrip();
		bookNowPage.setRegion("Alberta");
		bookNowPage.setFromLocation("Red Deer");
		bookNowPage.setToLocation("Grassland");
		bookNowPage.setDepartDate();
		bookNowPage.searchSchedule();
		String veriTitle = bookNowPage.getOutputPage();
		Assert.assertEquals(veriTitle, outputTitle);
	}

	@Test
	public void verifyErrorMessageWhenAllTheFieldAreNotFilled() throws InterruptedException {
		CanadaSitePage canadaSite = new CanadaSitePage(driver);
		RoutesAndServicesPage servicesPage = canadaSite.clickingRoutesAndServices();
		ExpressBookNowPage bookNowPage = servicesPage.clickOnBookNowForCanadaTrip();
		bookNowPage.setRegion("Alberta");
		bookNowPage.setFromLocation("Red Deer");
		bookNowPage.setDepartDate();
		bookNowPage.searchSchedule();
		String actualErrorText = bookNowPage.getErrorMessageIfnotInputAllFeilds();
		Assert.assertEquals(expErrorText, actualErrorText);
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

}
