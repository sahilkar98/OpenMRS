package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laboratory {
	private By laboratoryButton = By.xpath("//li[@id='Laboratory']");
	private WebDriver driver;
	
	public Laboratory(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLaboratory() {
		driver.findElement(laboratoryButton).click();
	}
}
