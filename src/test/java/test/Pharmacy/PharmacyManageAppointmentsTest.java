package test.Pharmacy;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.Pharmacy;
import utilities.DataProviderUtils;

public class PharmacyManageAppointmentsTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void pharmacyManageAppointmentsTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Pharmacy ph = new Pharmacy(driver);

		try {
			lp.sendUsername(username);
			lp.sendPassword(password);

			ph.clickPharmacy();
			lp.clickOnLogin();
			Thread.sleep(10000);
			ph.clickonAppointmentScheduling();
			ph.searchAppointmentmentRequesterName();
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
