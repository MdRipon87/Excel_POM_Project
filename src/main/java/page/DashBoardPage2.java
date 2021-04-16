package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class DashBoardPage2 extends BasePage {
	WebDriver driver;

	public DashBoardPage2(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement Dashboard_Header_Field;
	@FindBy(xpath = "//span[text()='Bank & Cash']")
	WebElement Bank_Cash_Button_Button;
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement New_Account_Button;

	// Interactive Methods
	public void validateDashboardHeader() {
		waitForElement(driver, 5, Dashboard_Header_Field);
		Assert.assertEquals(Dashboard_Header_Field.getText(), "Dashboard", "Dashboard page not found!!");
	}

	public void clickOnBankAndCashButton() {
		Bank_Cash_Button_Button.click();
		waitForElement(driver, 15, Bank_Cash_Button_Button);
	}

	public void clickOnNewAccountButton() {
		New_Account_Button.click();
		waitForElement(driver, 20, New_Account_Button);
	}

}
