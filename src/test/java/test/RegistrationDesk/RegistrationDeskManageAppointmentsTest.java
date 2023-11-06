package test.RegistrationDesk;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.RegistrationDesk;
import utilities.DataProviderUtils;

public class RegistrationDeskManageAppointmentsTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void registrationDeskManageAppointmentsTest(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		RegistrationDesk rd = new RegistrationDesk(driver);
		try {

			lp.sendUsername(username);
			lp.sendPassword(password);

			rd.clickRegistrationDesk();
			lp.clickOnLogin();
			Thread.sleep(10000);
			rd.clickonAppointmentScheduling();
			rd.searchAppointmentmentRequesterName();
			Thread.sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
