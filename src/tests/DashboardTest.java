package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.Home;
import objects.Login;

public class DashboardTest {

public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
		}
	
	@BeforeClass
	public void goToDashboard() {
		
		driver.navigate().to(Home.URL);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
		Home.acceptBtn(driver);
		Home.announcementClose(driver);
		Home.pressLogin(driver);
		Login.inputEmail(driver, "mesaric@yesmail.com");
		Login.inputPassword(driver, "7singer7");
		Login.loginBtn(driver);
		
	}
	
	
	
	@Test (priority = 1)
	public void testShiftPlanning() {
		Dashboard.shiftPlanning(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.SHF_PLN_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.SHF_PLN_URL;
		
		Assert.assertEquals(actual, expected);
	}
		
	@Test (priority = 2)
	public void testTimeClock() {
		Dashboard.timeClock(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.CLOCK_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.CLOCK_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 3)
	public void testLeave() {
		Dashboard.leave(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.LEAVE_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.LEAVE_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 4)
	public void testTraining() {
		Dashboard.training(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.TRAIN_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.TRAIN_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 5)
	public void testStaff() {
		Dashboard.staff(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.STAFF_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.STAFF_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 6)
	public void testAvailability() {
		Dashboard.availability(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.urlToBe(Dashboard.AVAIL_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.AVAIL_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 7)
	public void testPayroll() {
		Dashboard.payroll(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.PAYROLL_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.PAYROLL_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 8)
	public void testReports() {
		Dashboard.reports(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.REPORT_URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.REPORT_URL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 9)
	public void testDashboard() {
		Dashboard.dashboard(driver);
		
		WebDriverWait wait = new WebDriverWait (driver,3);
		wait.until(ExpectedConditions.urlToBe(Dashboard.URL));
		
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
}
