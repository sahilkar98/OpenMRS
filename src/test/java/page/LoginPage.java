package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	private By usernameLocator = By.xpath("//input[@id='username']");
	private By passwordLocator = By.xpath("//input[@id='password']");
	
	private By loginButton = By.xpath("//input[@id='loginButton']");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}
	
	public void sendPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}
	
}
