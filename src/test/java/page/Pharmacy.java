package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pharmacy {
	private By pharmacyButton = By.xpath("//li[@id='Pharmacy']");
	private WebDriver driver;
	
	public Pharmacy(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPharmacy() {
		driver.findElement(pharmacyButton).click();
	}
}
