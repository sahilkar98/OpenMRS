package test.OutpatientClinic;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class FindPatientRecordTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void findPatientRecordTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		OutpatientClinic oc = new OutpatientClinic(driver);
		oc.clickOutpatientClinic();
		lp.clickOnLogin();
		oc.clickOnFindPatientRecord();
		oc.clickonPatientIDInput();
		Thread.sleep(10000);
		
		oc.clickOnSearchedPatient();
		Thread.sleep(10000);
		
	}
}
