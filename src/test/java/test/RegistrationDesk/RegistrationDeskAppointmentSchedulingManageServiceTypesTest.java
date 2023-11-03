package test.RegistrationDesk;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.RegistrationDesk;
import utilities.DataProviderUtils;

public class RegistrationDeskAppointmentSchedulingManageServiceTypesTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void pharmacyAppointmentSchedulingManageServiceTypesTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		RegistrationDesk rd = new RegistrationDesk(driver);
		rd.clickRegistrationDesk();
		lp.clickOnLogin();
		Thread.sleep(10000);
		rd.clickonAppointmentScheduling();
		rd.clickonManageServiceTypes();
		rd.createNewServiceType();
		Thread.sleep(10000);

	}
}
