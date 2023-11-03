package test.Pharmacy;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;

import page.Pharmacy;
import utilities.DataProviderUtils;

public class PharmacyRegisterPatientTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void pharmcyRegisterPatientRecordTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		Pharmacy ph = new Pharmacy(driver);
		ph.clickPharmacy();
		lp.clickOnLogin();
		ph.clickOnRegisterPatient();
		ph.enterNameOfPatient();
		ph.enterGenderOfPatient();
		ph.enterBirtdate();
		ph.enterAddress();
		ph.enterPhoneNumber();
		ph.enterRelatives();
		Thread.sleep(10000);
		ph.clickonConfirmButton();
		Thread.sleep(20000);
		ph.verifyPatientIDDispalyedforRegisteredPatient();
		Thread.sleep(20000);

	}
}
