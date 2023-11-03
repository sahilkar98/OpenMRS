package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InpatientWard {

	private By ImpatientWardButton = By.xpath("//li[@id='Inpatient Ward']");
	private WebDriver driver;
	
	public InpatientWard(WebDriver driver) {
		this.driver = driver;
	}

	public void clickInpatientWard() {
		driver.findElement(ImpatientWardButton).click();
	}
}
