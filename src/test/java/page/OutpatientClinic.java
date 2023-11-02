package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OutpatientClinic {
	private By outpatientClinicButton = By.xpath("//li[@id='Outpatient Clinic']");
	private By outpatientLoggedInMessage= By.xpath("//div/h4[contains(text(),'Logged in as Super User (admin) at Outpatient Clinic.')]");
	private By findPatientRecordLocator = By.xpath("//a/i[@class='icon-search']");
	private By inputPatientIDLocator = By.xpath("//input[@id='patient-search']");
	private By identifierID = By.xpath("//tr/td[2]");
	private By searchedPatientLocator = By.xpath("//tr/td[1]");
	private By registerPatientLocator = By.xpath("//a/i[@class='icon-user']");
	private By givenNameLocator = By.xpath("//input[@name='givenName']");
	private By middleNameLocator = By.xpath("//input[@name='middleName']");
	private By familyNameLocator = By.xpath("//input[@name='familyName']");
	private By confirmButtonLocator = By.xpath("//button[@class='confirm right']");
	private By enterGenderLocator = By.xpath("//select/option[contains(text(),'Male')]");
	private By birthdayLoctor = By.xpath("//input[@name='birthdateDay']");
	private By birthMonthLoctor = By.xpath("//select/option[contains(text(),'March')]");
	private By birthYearLoctor = By.xpath("//input[@name='birthdateYear']");
	private By addressLocator = By.xpath("//input[@name='address1']");
	private By phoneNumberLocator = By.xpath("//input[@name='phoneNumber']");
	private By relationshipLocator = By.xpath("//select/option[contains(text(),'Doctor')]");
	private By personNameLocator = By.xpath("//input[@placeholder='Person Name']");
	private By submitButton = By.xpath("//input[@type='submit']");
	private By createdPatientID = By.xpath("//div[@class='float-sm-right']/span");
	private By appointmentSchedulingLocator = By.xpath("//div/a[contains(@id,'appointmentscheduling')]");
	private By manageServiceTypesLocator = By.xpath("//div/a[contains(@id,'manageAppointmentTypes')]");
	private By newServiceTypeLocator = By.xpath("//div/button[contains(@class,'confirm appointment-type-label right')]");
	private By nameNewServiceTypeLocator = By.xpath("//input[@name='name']");
	private By durationNewServiceTypeLocator = By.xpath("//input[@name='duration']");
	private By saveButtoninNewServiceLocator = By.xpath("//input[@class='confirm right']");
	
	private WebDriver driver;
	
	public OutpatientClinic(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOutpatientClinic() {
		driver.findElement(outpatientClinicButton).click();
	}
	
	public String getoutpatientLoggedinMessage() {
		String A = driver.findElement(outpatientLoggedInMessage).getText();
		return A;
	}
	
	public void clickOnFindPatientRecord() {
		driver.findElement(findPatientRecordLocator).click();
	}
	
	public void clickonPatientIDInput() {
		String st = driver.findElement(identifierID).getText();
		driver.findElement(inputPatientIDLocator).sendKeys(st);
	}
	
	public void clickOnSearchedPatient() {
		driver.findElement(searchedPatientLocator).click();
	}
	
	public void clickOnRegisterPatient() {
		driver.findElement(registerPatientLocator).click();
	}
	
	public void enterNameOfPatient() {
		driver.findElement(givenNameLocator).sendKeys("Test1");
		driver.findElement(middleNameLocator).sendKeys("Test2");
		driver.findElement(familyNameLocator).sendKeys("Test3");
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void enterGenderOfPatient() {
		driver.findElement(enterGenderLocator).click();
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void enterBirtdate() {
		driver.findElement(birthdayLoctor).sendKeys("16");
		driver.findElement(birthMonthLoctor).click();
		driver.findElement(birthYearLoctor).sendKeys("1998");
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void enterAddress() {
		driver.findElement(addressLocator).sendKeys("test@123");
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void enterPhoneNumber() {
		driver.findElement(phoneNumberLocator).sendKeys("1234567890");
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void enterRelatives() {
		driver.findElement(relationshipLocator).click();
		driver.findElement(personNameLocator).sendKeys("abc");
		driver.findElement(confirmButtonLocator).click();
	}
	
	public void clickonConfirmButton() {
		driver.findElement(submitButton).click();
	}
	
	public void verifyPatientIDDispalyedforRegisteredPatient() {
		driver.findElement(createdPatientID).isDisplayed();
		System.out.println(driver.findElement(createdPatientID).getText());
	}
	
	public void clickonAppointmentScheduling() {
		driver.findElement(appointmentSchedulingLocator).click();
	}
	public void clickonManageServiceTypes() {
		driver.findElement(manageServiceTypesLocator).click();
	}
	
	public void createNewServiceType() {
		driver.findElement(newServiceTypeLocator).click();
		driver.findElement(nameNewServiceTypeLocator).sendKeys("123test");
		driver.findElement(durationNewServiceTypeLocator).sendKeys("134");
		driver.findElement(saveButtoninNewServiceLocator).click();
	}
}
