package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USER_NAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_NAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@class='md-btn md-btn-primary waves-effect waves-light']")
	WebElement SAVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[text()=' Create Auto Login URL']")
	WebElement AUTO_LOGIN_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;

	// Interactive Methods
	String enteredName;
	public void insertFullName(String fullName) {
		waitForElement(driver , 10 ,USER_NAME_FIELD_LOCATOR);
		int generatedNubmer = randomGenerator(9999);
		enteredName = fullName + generatedNubmer;
		USER_NAME_FIELD_LOCATOR.sendKeys(enteredName);
	}

	public void chooseCompanyNameField(String companyName) {

		selectDropDown(COMPANY_NAME_FIELD_LOCATOR, companyName);
	}

	public void insertEmailAddressField(String emailID) {

		int generatedNubmer = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatedNubmer + emailID);
	}

	public void insertPhoneNumberField(String phone) {

		int generatedNubmer = randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(phone + generatedNubmer);
	}

	public void insertAddressNameField(String address) {

		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}

	public void insertCityField(String city) {

		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	public void insertStateField(String state) {

		STATE_FIELD_LOCATOR.sendKeys(state);
	}

	public void insertZicodeField(String zipcode) {

		ZIP_FIELD_LOCATOR.sendKeys(zipcode);
	}

	public void clickOnSaveButtonLocator() {

		SAVE_BUTTON.click();
	}

	/*
	 * public void clickOnListCustomersButton() { waitForElement(driver, 15,
	 * AUTO_LOGIN_BUTTON); LIST_CUSTOMERS_BUTTON_LOCATOR.click(); }
	 * 
	 * // tbody/tr[1]/td[3] // tbody/tr[2]/td[3] // tbody/tr[3]/td[3] //
	 * tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]
	 * 
	 * 
	 * public void varifyEntredName() {
	 * 
	 * String before_xpath = "//tbody/tr["; String after_xpath = "]/td[3]";
	 * 
	 * for (int i = 1; i <= 10; i++) {
	 * 
	 * String name = driver.findElement(By.xpath(before_xpath + i +
	 * after_xpath)).getText();
	 * 
	 * System.out.println(name); Assert.assertEquals(name, entredName,
	 * "Entred name does not exist !!"); break;
	 * 
	 * if (name.contains(entredName)) { System.out.println("Entred name exist");
	 * driver.findElement(By.
	 * xpath("//tbody/tr[ + i + ]/td[3]/following-sibling::td[4]/a[2] ")).click();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */
}
