package test.RegistrationDesk;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.RegistrationDesk;
import utilities.DataProviderUtils;

public class RegistrationDeskFindPatientRecordTest extends WebDriverWrapper{

	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void registrationDeskFindPatientRecordTest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		RegistrationDesk rd = new RegistrationDesk(driver);
		rd.clickRegistrationDesk();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
		rd.clickOnFindPatientRecord();
		rd.clickonPatientIDInput();
		Thread.sleep(10000);
		rd.clickOnSearchedPatient();
		Thread.sleep(10000);
		
	}
}
