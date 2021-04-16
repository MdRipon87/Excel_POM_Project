package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.Bank_Cash_Page;
import page.DashBoardPage1;
import page.DashBoardPage2;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\AddCustomer.xlsx");
	String Username = exlread.getCellData("Login", "Username", 2);
	String Password = exlread.getCellData("Login", "Password", 2);
	
	String FullName = exlread.getCellData("AddCustomer", "FullName", 2);
	String Company = exlread.getCellData("AddCustomer", "Company", 2);
	String Email = exlread.getCellData("AddCustomer", "Email", 2);
	String Phone = exlread.getCellData("AddCustomer", "Phone", 2);
	String Address = exlread.getCellData("AddCustomer", "Address", 2);
	String City = exlread.getCellData("AddCustomer", "City", 2);
	String State = exlread.getCellData("AddCustomer", "State", 2);
	String Zipcode = exlread.getCellData("AddCustomer", "Zipcode", 2);

	@Test
	public void login() {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(Username);
		login.enterPassword(Password);
		login.clickSigninButton();

		DashBoardPage1 dashboard = PageFactory.initElements(driver, DashBoardPage1.class);
		dashboard.validateDashboardHeader();
		dashboard.clickOnCustomerButton();
		dashboard.clickOnAddCustomerButton();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.insertFullName(FullName);
		addCustomer.chooseCompanyNameField(Company);
		addCustomer.insertEmailAddressField(Email);
		addCustomer.insertPhoneNumberField(Phone);
		addCustomer.insertAddressNameField(Address);
		addCustomer.insertCityField(City);
		addCustomer.insertStateField(State);
		addCustomer.insertZicodeField(Zipcode);
		addCustomer.clickOnSaveButtonLocator();
		

	}

}
