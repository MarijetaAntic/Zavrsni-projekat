package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.Home;
import objects.WizardSetup;

public class PaleFreeTrialTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
	}
	
	@Test
	public void testPaleForm() {
		 driver.navigate().to(Home.URL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			Home.acceptBtn(driver);
			Home.announcementClose(driver);
			//Home.closeChat(driver);
			
			Home.paleButton(driver);
			Home.inputPopupName(driver, "Marina Maric");
			Home.inputPopupMail(driver, "tradeorg@org.com");
			Home.popupSubmit(driver);
			
			WebDriverWait wait = new WebDriverWait (driver,3);
			wait.until(ExpectedConditions.urlToBe(WizardSetup.URL));
			
			String actual = driver.getCurrentUrl();
			String expected = WizardSetup.URL;
			
			Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testWizardSetup() {
		
		driver.navigate().to(WizardSetup.URL);
		
		WizardSetup.inputCompanyName(driver, "MaricTrade");
		WizardSetup.chooseIndustry(driver);
		WizardSetup.chooseFuncRole(driver);
		WizardSetup.inputPhone(driver, "04342244");
		WizardSetup.inputPassword(driver, "21hj12");
		WizardSetup.inputRepPassword(driver, "12hj12");
		WizardSetup.startShedulBtn(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL;
		
		Assert.assertEquals(actual, expected);
	}
	
}
