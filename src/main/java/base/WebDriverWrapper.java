package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
/*import org.testng.annotations.AfterMethod;*/
import org.testng.annotations.BeforeMethod;

public class WebDriverWrapper {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		driver.manage().timeouts().getImplicitWaitTimeout();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}
	
	

}