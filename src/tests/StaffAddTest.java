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
import objects.StaffAdd;


public class StaffAddTest {
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

	@Test(priority = 1)
	public void testAddEmployee() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		StaffAdd.addEmployeesBtn(driver);
		StaffAdd.inputName(driver, "Mala");
		StaffAdd.inputLastName(driver, "Mesaric");
		StaffAdd.inputEmail(driver, "mala.mesaric@yesmail.com");
		StaffAdd.btnSave(driver);
		
	    WebElement tabela = driver.findElement(By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/div/table/tbody/tr[5]/td[1]"));
		String actual = tabela.getText();
		String expected = "Mala Mesaric\t\t\t\tclose";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(priority = 2)
	public void testChangeName() {
		driver.navigate().to(StaffAdd.STAFF_URL);
		StaffAdd.goToEmployee(driver);
		StaffAdd.editDetails(driver);
		StaffAdd.editName(driver, "Milena");
		StaffAdd.submitBtn(driver);
	}
	
	@Test (priority = 3)
	public void testChangePic() {
		driver.navigate().to(StaffAdd.STAFF_URL);
		
		
		StaffAdd.goToEmployee(driver);
		StaffAdd.editDetails(driver);
		StaffAdd.uploadPicture(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		StaffAdd.submitBtn(driver);
	}
	
	@Test (priority = 4)
	public void testAddEmployeesList() {
		driver.navigate().to(StaffAdd.STAFF_URL);
		StaffAdd.addEmployeesBtn(driver);
		StaffAdd.excellFileLink(driver);
		StaffAdd.chooseFileBtn(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		StaffAdd.submitFileBtn(driver);
		
		StaffAdd.inputName(driver);
		StaffAdd.inputSurname(driver);
		StaffAdd.inputEmail(driver);
		StaffAdd.addEplysBtn(driver);
		
		//String actual = 
		//String expected = StaffAdd.IMPRT_STAF_URL;
		
		//Assert.assertEquals(actual, expected);
		
	}
	
	
}
