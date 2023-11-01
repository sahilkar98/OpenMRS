package test;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.Laboratory;
import page.LoginPage;
import utilities.DataProviderUtils;

public class LaboratoryLoginTest extends WebDriverWrapper {

	
	@Test(dataProvider = "validCredentialData",dataProviderClass = DataProviderUtils.class)
	public void laboratoryValidCredentialtest(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);
		
		Laboratory lb = new Laboratory(driver);
		lb.clickLaboratory();
		lp.clickOnLogin();
		
		Thread.sleep(10000);
	}
}
