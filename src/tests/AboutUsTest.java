package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.About;
import objects.Home;


public class AboutUsTest {

public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
		}
	
	@Test
	public void testGoToAboutUsPage() {
		 driver.navigate().to(Home.URL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		 Home.acceptBtn(driver);
		 Home.announcementClose(driver);
			
			Home.pointAboutUs(driver);
			Home.clickAboutUs(driver);
			
			About.screenShot(driver, ".\\screenshot\\slika.png");
			
			String actual = driver.getCurrentUrl();
			String expected = About.URL;
			
			Assert.assertEquals(actual, expected);
			
	}
	
}
