package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage2;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\Bank and Cash.xlsx");
	String Username = exlread.getCellData("Login", "Username", 2);
	String Password = exlread.getCellData("Login", "Password", 2);

	@Test
	public void login() {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(Username);
		login.enterPassword(Password);
		login.clickSigninButton();

		DashBoardPage2 dashboard = PageFactory.initElements(driver, DashBoardPage2.class);
		dashboard.validateDashboardHeader();
		dashboard.clickOnBankAndCashButton();
		dashboard.clickOnNewAccountButton();

	}

}
