package com.spryhealth.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spryhealth.pages.BaseClass;
import com.spryhealth.pages.CheckPNR;

public class CheckPNRTest extends BaseClass {

	// Checking valid 10 digit PNR number
	@Test(priority = 1)
	public void checkvalidPNR() {

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 0, 0));

		checkpnr.closePopUp();

		System.out.println("PNR number= " + excel.getPNR("PNR", 0, 0) + "----Valid PNR.");

		checkpnr.clearInput();

	}

	// Checking Invalid 4 digit PNR number
	@Test(priority = 2)
	public void checkInvalidPNR() {

		String expectedError = "Error! PNR Number should be 10 digit numeric number.";

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 1, 0));

		String actualError = checkpnr.getPNRErrorMsg();

		Assert.assertEquals(actualError, expectedError);
		System.out.println("PNR number= " + excel.getPNR("PNR", 1, 0)
				+ "----Error! PNR Number should be 10 digit numeric number.");
		checkpnr.clearInput();
	}

	// Checking Invalid more than 10 digit PNR number
	@Test(priority = 3)
	public void checkInvalidPNR2() {

		String expectedError = "Error! PNR Number should be 10 digit numeric number.";

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 2, 0));

		String actualError = checkpnr.getPNRErrorMsg();

		Assert.assertEquals(actualError, expectedError);
		System.out.println("PNR number= " + excel.getPNR("PNR", 2, 0)
				+ "----Error! PNR Number should be 10 digit numeric number.");
		checkpnr.clearInput();
	}

	// Checking Invalid alphabetic PNR number
	@Test(priority = 4)
	public void checkInvalidPNR3() {

		String expectedError = "Error! PNR Number should be 10 digit numeric number.";

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 3, 0));

		String actualError = checkpnr.getPNRErrorMsg();

		Assert.assertEquals(actualError, expectedError);
		System.out.println("PNR number= " + excel.getPNR("PNR", 3, 0)
				+ "----Error! PNR Number should be 10 digit numeric number.");
		checkpnr.clearInput();
	}

	// Checking Invalid alphanumeric PNR number
	@Test(priority = 5)
	public void checkInvalidPNR4() {

		String expectedError = "Error! PNR Number should be 10 digit numeric number.";

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 4, 0));

		String actualError = checkpnr.getPNRErrorMsg();

		Assert.assertEquals(actualError, expectedError);
		System.out.println("PNR number= " + excel.getPNR("PNR", 4, 0)
				+ "----Error! PNR Number should be 10 digit numeric number.");
		checkpnr.clearInput();
	}

	// Checking valid 10 digit PNR number
	@Test(priority = 6)
	public void checkvalidPNR2() {

		CheckPNR checkpnr = PageFactory.initElements(driver, CheckPNR.class);

		checkpnr.EnterPNR(excel.getPNR("PNR", 5, 0));

		checkpnr.closePopUp();

		System.out.println("PNR number= " + excel.getPNR("PNR", 5, 0) + "----Valid PNR.");

		checkpnr.clearInput();

	}

}