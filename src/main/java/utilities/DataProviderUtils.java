package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] obj = new Object[1][2];
		obj[0][0] = "Admin";
		obj[0][1] = "Admin123";

		return obj;

	}

	@DataProvider
	public Object[][] registerPatientExcelData() throws IOException {

		Object[][] main = ExcelUtils.sheetIntoObjectArray("resources/testData/OpenMRSExcelDP.xlsx",
				"RegisterPatientExcelDPTest");
		return main;
	}
}
