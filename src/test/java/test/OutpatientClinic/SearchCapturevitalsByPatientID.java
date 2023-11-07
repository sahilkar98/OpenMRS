package test.OutpatientClinic;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class SearchCapturevitalsByPatientID extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void searchCapturevitalsByPatientIDtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		OutpatientClinic oc = new OutpatientClinic(driver);
		oc.clickOutpatientClinic();
		lp.clickOnLogin();
		
		Assert.assertEquals(oc.getoutpatientLoggedinMessage(), "Logged in as Super User (admin) at Outpatient Clinic.");
		oc.searchAndClickonPatientByPatientIDInCaptureVitals();
	}
}
