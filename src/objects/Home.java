package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home {
  
	
	public static final String URL = "https://www.humanity.com/";
	private static final String ACCEPTBTN_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	private static final String ANNOUNC_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String PALEBTN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	private static final String ABOUTUS_LINK_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	
	public static void acceptBtn(WebDriver driver) {
	    driver.findElement(By.xpath(ACCEPTBTN_XPATH)).click();
	}
	
	/*public static void closeChat(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div")).click();
	}*/
	
	
	public static void announcementClose(WebDriver driver) {
		driver.findElement(By.xpath(ANNOUNC_XPATH)).click();
	}
  
	public static void inputFullName(WebDriver driver, String fullname) {
		driver.findElement(By.name("fullname")).sendKeys(fullname);
	}
	
	public static void inputWorkEmail(WebDriver driver, String email) {
		driver.findElement(By.name("workemail")).sendKeys(email);
	}
  
	public static void StartMyFreeTrialBtn(WebDriver driver) {
		driver.findElement(By.cssSelector("input#free-trial-link-01")).click();
	}
	
	public static void paleButton(WebDriver driver) {
		driver.findElement(By.xpath(PALEBTN_XPATH)).click();
	}
	
	public static void inputPopupName(WebDriver driver, String fullname) {
		driver.findElement(By.name("popupname")).sendKeys(fullname);
	}
	
	public static void inputPopupMail(WebDriver driver, String mail) {
		driver.findElement(By.name("popupmail")).sendKeys(mail);
	}
	
	public static void popupSubmit(WebDriver driver) {
		driver.findElement(By.id("popup-free-trial-link")).click();
	}
	
	public static void pressLogin(WebDriver driver) {
		driver.findElement(By.linkText("LOGIN")).click();
	}
	
	public static void pointAboutUs(WebDriver driver) {
		WebElement aboutUs = driver.findElement(By.xpath(ABOUTUS_XPATH));
		Actions action = new Actions(driver);
		action.moveToElement(aboutUs).build().perform();
	}
	
	public static void clickAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_LINK_XPATH)).click();
	}
}
