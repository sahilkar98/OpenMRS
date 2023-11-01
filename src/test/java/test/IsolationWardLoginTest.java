package test;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.IsolationWard;
import page.LoginPage;
import utilities.DataProviderUtils;

public class IsolationWardLoginTest extends WebDriverWrapper {

	
	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void IsolationWardValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		IsolationWard isp = new IsolationWard(driver);
		isp.clickIsolationWard();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
	}
}
