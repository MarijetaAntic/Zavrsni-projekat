package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WizardSetup {

	public static final String URL = "https://www.humanity.com/wizard-setup2/";
	private static final String INDUSTRY_XPATH = "//*[@id=\\\"root\\\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String FUNCROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div";
	private static final String SUB_BTN_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	public static void inputCompanyName(WebDriver driver, String companyName) {
		driver.findElement(By.name("business")).sendKeys(companyName);
	}
	
	public static void chooseIndustry(WebDriver driver) {
		WebElement industry = driver.findElement(By.xpath(INDUSTRY_XPATH));
		industry.click();
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ENTER);
		
	}

	public static void chooseFuncRole(WebDriver driver) {
		WebElement func = driver.findElement(By.xpath(FUNCROLE_XPATH));
		func.click();
		func.sendKeys(Keys.ARROW_DOWN);
		func.sendKeys(Keys.ARROW_DOWN);
		func.sendKeys(Keys.ARROW_DOWN);
		func.sendKeys(Keys.ARROW_DOWN);
		func.sendKeys(Keys.ARROW_DOWN);
		func.sendKeys(Keys.ENTER);
	}
	
	public static void inputPhone(WebDriver driver, String string) {
		driver.findElement(By.name("phone")).sendKeys(string);
	}
	
	public static void inputPassword(WebDriver driver, String pass) {
	    driver.findElement(By.name("password")).sendKeys(pass);
    }
	
	public static void inputRepPassword(WebDriver driver, String pass) {
	    driver.findElement(By.name("repeat_password")).sendKeys(pass);
    }
	
	public static void startShedulBtn(WebDriver driver) {
		driver.findElement(By.xpath(SUB_BTN_XPATH)).click();
	}

	
}
