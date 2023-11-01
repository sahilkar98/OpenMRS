package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OutpatientClinic {
	private By outpatientClinicButton = By.xpath("//li[@id='Outpatient Clinic']");
	private WebDriver driver;
	
	public OutpatientClinic(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOutpatientClinic() {
		driver.findElement(outpatientClinicButton).click();
	}
}
