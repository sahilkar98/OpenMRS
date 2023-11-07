package test.OutpatientClinic;

import org.testng.annotations.Test;

import base.WebDriverWrapper;
import page.LoginPage;
import page.OutpatientClinic;
import utilities.DataProviderUtils;

public class RegisterPatientExcelDPTest extends WebDriverWrapper {

	@Test(dataProvider = "registerPatientExcelData", dataProviderClass = DataProviderUtils.class)
	public void registerPatientRecordExcelDPTest(String username,String password, String given, String middle, String familyName, String day, String year, String address, String phone, String personName) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername(username);
		lp.sendPassword(password);

		OutpatientClinic oc = new OutpatientClinic(driver);
		oc.clickOutpatientClinic();
		lp.clickOnLogin();
		oc.clickOnRegisterPatient();
		oc.enterNameofPatientExcel(given, middle, familyName);
		oc.enterGenderOfPatient();
		oc.enterBirtdateExcel(day, year);
		oc.enterAddressExcel(address);
		oc.enterPhoneNumberExcel(phone);
		oc.enterRelativesExcel(personName);
		oc.clickonConfirmButton();
		Thread.sleep(20000);
		oc.verifyPatientIDDispalyedforRegisteredPatient();
		Thread.sleep(20000);
	}

}
