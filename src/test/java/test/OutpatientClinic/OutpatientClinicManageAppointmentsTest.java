package test.OutpatientClinic;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class OutpatientClinicManageAppointmentsTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void outpatientClinicManageAppointmentsTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		OutpatientClinic oc = new OutpatientClinic(driver);

		try {
			lp.sendUsername(username);
			lp.sendPassword(password);

			oc.clickOutpatientClinic();
			lp.clickOnLogin();
			Thread.sleep(10000);
			oc.clickonAppointmentScheduling();
			oc.searchAppointmentmentRequesterName();
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
