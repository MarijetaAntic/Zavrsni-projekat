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
import objects.Login;

public class LoginTest {

public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
		}
	
	@Test
	public void testBtnLogin() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		Home.acceptBtn(driver);
		Home.announcementClose(driver);
		
		Home.pressLogin(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = Login.URL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testLogin() {
		
		Login.inputEmail(driver, "mesaric@yesmail.com");
		Login.inputPassword(driver, "7singer7");
		Login.loginBtn(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL;
		
		Assert.assertEquals(actual, expected);
	}
	
	
}
