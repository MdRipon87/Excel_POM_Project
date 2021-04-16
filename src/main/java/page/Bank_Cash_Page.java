package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bank_Cash_Page extends BasePage {

	WebDriver driver;

	public Bank_Cash_Page(WebDriver driver) {
		this.driver = driver;
	}
	// Element Library
	@FindBy(xpath = "//input[@id='account']")
	WebElement Account_Tittle_Field_Element;
	@FindBy(xpath = "//input[@id='description']")
	WebElement Description_Element;
	@FindBy(xpath = "//input[@id='balance']")
	WebElement Balance_Field_Element;
	@FindBy(xpath = "//input[@id='account_number']")
	WebElement Account_Number_Field_Element;
	@FindBy(xpath = "//input[@id='contact_person']")
	WebElement Contact_Parson_Field_Element;
	@FindBy(xpath = "//input[@id='contact_phone']")
	WebElement Contact_Phone_Field_Element;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement Submit_Button_Element;

	// Interactive Methods
	public void insertAccountField(String AccountTittle) {
		int grn = randomGenerator(999);
		Account_Tittle_Field_Element.sendKeys(AccountTittle + grn);
	}
	public void insertDescriptionField(String Description) {
		Description_Element.sendKeys(Description );
	}
	
	public void insertBalanceField(String InitialBalance) {
		Balance_Field_Element.sendKeys(InitialBalance);
	}
	public void insertAccNumberField(String AccountNumber) {
		int grn = randomGenerator(999);
		Account_Number_Field_Element.sendKeys(AccountNumber + grn);
	}
	public void insertConParsonField(String ContactParson) {
		Contact_Parson_Field_Element.sendKeys(ContactParson );
	}
	
	public void insertConPhoneField(String Phone) {
		Contact_Phone_Field_Element.sendKeys(Phone);
	}
	public void clickSubmitButton() {
		Submit_Button_Element.click();
	}
	
	
	
	
}
