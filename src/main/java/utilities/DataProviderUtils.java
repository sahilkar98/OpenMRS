package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] obj = new Object[1][2];
		obj[0][0] = "Admin";
		obj[0][1] = "Admin123";

		return obj;

	}
}
