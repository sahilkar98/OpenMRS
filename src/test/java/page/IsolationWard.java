package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsolationWard {

	private By IsolationWardButton = By.xpath("//li[@id='Isolation Ward']");
	private WebDriver driver;
	
	public IsolationWard(WebDriver driver) {
		this.driver = driver;
	}

	public void clickIsolationWard() {
		driver.findElement(IsolationWardButton).click();
	}
}
