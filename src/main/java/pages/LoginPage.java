package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement btnLogin;

	public void settxtUsername(String username) {
		txtUsername.sendKeys(username);

	}
	
	public void settextPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}

}
