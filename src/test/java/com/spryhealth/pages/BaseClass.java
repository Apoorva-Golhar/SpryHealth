package com.spryhealth.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.spryhealth.utilities.BrowserFactory;
import com.spryhealth.utilities.ConfigDataProvider;
import com.spryhealth.utilities.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setupSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}

	@BeforeClass
	public void setUp() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getURL());
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

}