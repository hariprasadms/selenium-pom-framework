package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.URL;

public class TestBase {

	public static WebDriver driver = null;

	public static final String USERNAME = "";
	public static final String AUTOMATE_KEY = "";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeSuite
	public static void initialize() throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "62.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "sampletest");

		driver = new RemoteWebDriver(new URL(URL), caps);

		// driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@AfterSuite
	public void TeardownTest() {
		TestBase.driver.quit();
	}

}
