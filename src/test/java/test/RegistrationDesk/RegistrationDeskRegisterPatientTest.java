package test.RegistrationDesk;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.RegistrationDesk;
import utilities.DataProviderUtils;

public class RegistrationDeskRegisterPatientTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData", dataProviderClass = DataProviderUtils.class)
	public void RegistrationDeskRegisterPatientRecordTest(String username, String password)
			throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		RegistrationDesk rd = new RegistrationDesk(driver);
		rd.clickRegistrationDesk();
		lp.clickOnLogin();
		rd.clickOnRegisterPatient();
		rd.enterNameOfPatient();
		rd.enterGenderOfPatient();
		rd.enterBirtdate();
		rd.enterAddress();
		rd.enterPhoneNumber();
		rd.enterRelatives();
		rd.clickonConfirmButton();
		Thread.sleep(20000);
		rd.verifyPatientIDDispalyedforRegisteredPatient();
		Thread.sleep(20000);

	}
}
