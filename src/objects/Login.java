package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static final String URL = "https://www.humanity.com/app/";
	
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	}
	
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public static void loginBtn(WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}
}
