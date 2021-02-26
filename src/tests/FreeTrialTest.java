package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.WizardSetup;

public class FreeTrialTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
		}
		
	
	@Test
	public void testFreeTrialForm() {
	
		 driver.navigate().to(Home.URL);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			Home.acceptBtn(driver);
			Home.announcementClose(driver);
			//Home.closeChat(driver);
			
		Home.inputFullName(driver, "Jo Baker");
		Home.inputWorkEmail(driver, "jb@yesmail.com");
		Home.StartMyFreeTrialBtn(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = WizardSetup.URL;
		
		Assert.assertEquals(actual, expected);
	}
	
	
}
