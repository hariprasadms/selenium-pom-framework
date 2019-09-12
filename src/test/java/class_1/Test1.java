package class_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import objectrepository.login;

public class Test1 extends TestBase {

	WebDriver driver = null;


	@Test
	public void login() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(login.txtUsername).sendKeys("Admin");

		driver.findElement(login.txtPassword).sendKeys("admin123");

		driver.findElement(login.btnLogin).click();
		;

		Thread.sleep(3000);

	}

	@AfterTest
	public void closeBrowser() {

		driver.quit();

	}

}
