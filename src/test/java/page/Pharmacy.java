package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pharmacy {
	private By pharmacyButton = By.xpath("//li[@id='Pharmacy']");
	private By pharmcyLoggedinMessage= By.xpath("//div/h4[contains(text(),'Logged in as Super User (admin) at Pharmacy.')]");
	
	private WebDriver driver;
	
	public Pharmacy(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPharmacy() {
		driver.findElement(pharmacyButton).click();
	}
	
	public String getPharmacyLoggedinMessage() {
		String A = driver.findElement(pharmcyLoggedinMessage).getText();
		return A;
	}
}
