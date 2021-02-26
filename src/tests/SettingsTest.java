package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.Home;
import objects.Login;
import objects.Settings;

public class SettingsTest {

public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
		}
	
	@BeforeClass
	public void goToStaff() {
		
		driver.navigate().to(Home.URL);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
		Home.acceptBtn(driver);
		Home.announcementClose(driver);
		Home.pressLogin(driver);
		Login.inputEmail(driver, "mesaric@yesmail.com");
		Login.inputPassword(driver, "7singer7");
		Login.loginBtn(driver);
		Dashboard.staff(driver);
		
	}
	
	@Test
	public void languageTest() {
		driver.navigate().to(Settings.URL);
		Settings.inputLanguage(driver);
		Settings.saveSettings(driver);
		Settings.refresh(driver);
		
		WebElement account = driver.findElement(By.xpath("//*[@id=\"_cd_admin\"]/div[1]/div/div/div[1]/ul[2]/li[1]/a"));
		String actual =  account.getText();
		String expected = "";
		
		Assert.assertEquals(actual, expected);
		
	}

	
	
}
