package test;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.RegistrationDesk;
import utilities.DataProviderUtils;

public class RegistrationDeskLoginTest extends WebDriverWrapper {

	
	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void registrationDeskValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		RegistrationDesk rd = new RegistrationDesk(driver);
		rd.clickRegistrationDesk();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
	}
}
