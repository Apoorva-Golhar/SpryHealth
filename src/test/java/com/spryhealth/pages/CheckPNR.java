package com.spryhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spryhealth.utilities.Helper;

public class CheckPNR {

	WebDriver driver;

	public CheckPNR(WebDriver ldriver) {

		this.driver = ldriver;
		this.helper = new Helper();
	}

	@FindBy(id = "inputPnrNo")
	WebElement pnr;
	@FindBy(id = "modal1")
	WebElement submit;
	@FindBy(id = "errorMessage")
	WebElement errormsg;
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[1]/button")
	WebElement closebtn;

	Helper helper;

	public void EnterPNR(String d) {
		pnr.sendKeys(d);
		submit.click();

	}

	public void closePopUp() {
		closebtn.click();
		helper.waitForElementToBeVisible(driver, pnr, 10);
	}
	
	public void clearInput() {
		pnr.clear();
	}

	public String getPNRErrorMsg() {

		// helper.waitForElementToBeVisible(driver, errormsg, 10);
		return errormsg.getAttribute("innerHTML");

	}

}
