package class_1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

@Test
public class LoginTests extends TestBase {

	public void logintest1() {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.settxtUsername("Admin");
		loginpage.settextPassword("admin123");
		loginpage.clickLogin();

	}

}
