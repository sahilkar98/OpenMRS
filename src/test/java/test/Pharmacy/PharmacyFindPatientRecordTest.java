package test.Pharmacy;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.Pharmacy;
import utilities.DataProviderUtils;

public class PharmacyFindPatientRecordTest extends WebDriverWrapper{

	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void pharmacyFindPatientRecordTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		Pharmacy ph = new Pharmacy(driver);
		ph.clickPharmacy();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
		ph.clickonFindPatientReocrd();
		ph.clickonPatientIDInput();
		Thread.sleep(10000);
		ph.clickOnSearchedPatient();
		Thread.sleep(10000);
		
	}
}
