package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}	
	
	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement Signin_Button;

	// Interactive Methods
	public void enterUserName(String userName) {
		Username_Field.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password_Field.sendKeys(password);
	}

	public void clickSigninButton() {
		Signin_Button.click();
	}

	
	
	
	
	
	
	
	
}
