package test;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.InpatientWard;
import page.LoginPage;
import utilities.DataProviderUtils;

public class InpatientWardLoginTest extends WebDriverWrapper {

	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void InpatientWardValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		InpatientWard ip = new InpatientWard(driver);
		ip.clickInpatientWard();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
	}
	
}
