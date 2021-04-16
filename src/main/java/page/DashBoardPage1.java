package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage1 extends BasePage {
	WebDriver driver;

	public DashBoardPage1(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement Dashboard_Header_Field;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;

	// Interactive Methods
	public void validateDashboardHeader() {
		waitForElement(driver, 15, Dashboard_Header_Field);
		Assert.assertEquals(Dashboard_Header_Field.getText(), "Dashboard", "Dashboard page not found!!");
	}

	public void clickOnCustomerButton() {
		CUSTOMERS_BUTTON_LOCATOR.click();
		waitForElement(driver, 20, CUSTOMERS_BUTTON_LOCATOR);
	}

	public void clickOnAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_LOCATOR.click();
		waitForElement(driver, 20, ADD_CUSTOMER_BUTTON_LOCATOR);
	}
}
