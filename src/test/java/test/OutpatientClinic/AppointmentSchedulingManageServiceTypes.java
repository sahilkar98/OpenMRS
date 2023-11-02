package test.OutpatientClinic;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class AppointmentSchedulingManageServiceTypes extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void outpatientClinicValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		OutpatientClinic oc = new OutpatientClinic(driver);
		oc.clickOutpatientClinic();
		lp.clickOnLogin();
		Thread.sleep(10000);
		oc.clickonAppointmentScheduling();
		oc.clickonManageServiceTypes();
		oc.createNewServiceType();
		Thread.sleep(10000);

	}
}
