package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationDesk {
	private By registrationDeskButton = By.xpath("//li[@id='Registration Desk']");
	private WebDriver driver;
	
	public RegistrationDesk(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRegistrationDesk() {
		driver.findElement(registrationDeskButton).click();
	}
}
