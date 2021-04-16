package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Bank_Cash_Page;
import page.DashBoardPage2;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class BankAndCashTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\Bank and Cash.xlsx");
	String Username = exlread.getCellData("Login", "Username", 2);
	String Password = exlread.getCellData("Login", "Password", 2);

	String AccountTittle = exlread.getCellData("Bank_Cash", "AccountTittle", 2);
	String Description = exlread.getCellData("Bank_Cash", "Description", 2);
	String InitialBalance = exlread.getCellData("Bank_Cash", "Initial Balance", 2);
	String AccountNumber = exlread.getCellData("Bank_Cash", "Account Number", 2);
	String ContactParson = exlread.getCellData("Bank_Cash", "Contact Parson", 2);
	String Phone = exlread.getCellData("Bank_Cash", "Phone", 2);
	String BankingUrl = exlread.getCellData("Bank_Cash", "Banking Url", 2);

	@Test
	public void login() {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(Username);
		login.enterPassword(Password);
		login.clickSigninButton();

		DashBoardPage2 dashboard = PageFactory.initElements(driver, DashBoardPage2.class);
		dashboard.clickOnBankAndCashButton();
		dashboard.clickOnNewAccountButton();

		Bank_Cash_Page bankcash = PageFactory.initElements(driver, Bank_Cash_Page.class);
		bankcash.insertAccountField(AccountTittle);
		bankcash.insertDescriptionField(Description);
		bankcash.insertBalanceField(InitialBalance);
		bankcash.insertAccNumberField(AccountNumber);
		bankcash.insertConParsonField(ContactParson);
		bankcash.insertConPhoneField(Phone);

	}
}