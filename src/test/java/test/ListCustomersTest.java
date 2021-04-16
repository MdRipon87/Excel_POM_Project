package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage1;
import page.ListCustomersPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class ListCustomersTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\AddCustomer.xlsx");
	String Username = exlread.getCellData("Login", "Username", 2);
	String Password = exlread.getCellData("Login", "Password", 2);

	String fullName = exlread.getCellData("AddCustomer", "FullName", 2);
	String company = exlread.getCellData("AddCustomer", "CompanyName", 2);
	String email = exlread.getCellData("AddCustomer", "Email", 2);
	String phone = exlread.getCellData("AddCustomer", "Phone", 2);
	String address = exlread.getCellData("AddCustomer", "Address", 2);
	String city = exlread.getCellData("AddCustomer", "City", 2);
	String state = exlread.getCellData("AddCustomer", "State", 2);
	String zipcode = exlread.getCellData("AddCustomer", "Zipcode", 2);

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
		addCustomer.insertFullName(fullName);
		addCustomer.chooseCompanyNameField(company);
		addCustomer.insertEmailAddressField(email);
		addCustomer.insertPhoneNumberField(phone);
		addCustomer.insertAddressNameField(address);
		addCustomer.insertCityField(city);
		addCustomer.insertStateField(state);
		addCustomer.insertZicodeField(zipcode);
		addCustomer.clickOnSaveButtonLocator();

		
		ListCustomersPage listCustomers = PageFactory.initElements(driver, ListCustomersPage.class);
		listCustomers.clickOnListCustomersButton();
		listCustomers.enteredNameAndDelete();
		
	}

}
