package test.Pharmacy;

import org.testng.Assert;
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
		Assert.assertEquals(ph.getPharmacyLoggedinMessage(), "Logged in as Super User (admin) at Pharmacy.");
		Thread.sleep(10000);
		lp.logout();
	}
}
