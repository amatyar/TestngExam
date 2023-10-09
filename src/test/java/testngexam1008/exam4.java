package testngexam1008;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exam4 {
	WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		//System.setProperty("webdriver.chrome.driver","/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
	}
	@Test
	//HardAssertion will stops after failure of the program and //doesn't run all prog till end
	public void assertEqual () {
		//System.setProperty("webdriver.chrome.driver", "/Users/nabarajkhatiwada/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		// verify title 
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "WebDriverUniversity.com");
		
		

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
