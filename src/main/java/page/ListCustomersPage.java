package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCustomersPage extends BasePage {

	WebDriver driver;

	public ListCustomersPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//a[text()=' Create Auto Login URL']")
	WebElement AUTO_LOGIN_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;

	// Interactive Methods
	public void clickOnListCustomersButton() {
		waitForElement(driver, 15, AUTO_LOGIN_BUTTON);
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}

	public void enteredNameAndDelete() {
		String before_xpath = "//tbody/tr[";
		String after_xpath = "]/td[3]";

		for (int i = 1; i <= 1; i++) {

			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();

			driver.findElement(By.xpath("//tbody/tr[1]/td[7]/child::a[2]")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		}
	}
}
