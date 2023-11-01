package test;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.Pharmacy;
import utilities.DataProviderUtils;

public class PharmacyLoginTest extends WebDriverWrapper {

	
	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void outpatientClinicValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		Pharmacy ph = new Pharmacy(driver);
		ph.clickPharmacy();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
	}
}
