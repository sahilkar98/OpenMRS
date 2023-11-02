package test.OutpatientClinic;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class RegisterPatientTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void registerPatientRecordTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		OutpatientClinic oc = new OutpatientClinic(driver);
		oc.clickOutpatientClinic();
		lp.clickOnLogin();
		oc.clickOnRegisterPatient();
		oc.enterNameOfPatient();
		oc.enterGenderOfPatient();
		oc.enterBirtdate();
		oc.enterAddress();
		oc.enterPhoneNumber();
		oc.enterRelatives();
		oc.clickonConfirmButton();
		Thread.sleep(20000);
		oc.verifyPatientIDDispalyedforRegisteredPatient();
		Thread.sleep(20000);

	}

}
