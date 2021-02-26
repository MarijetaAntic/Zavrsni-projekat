package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class StaffAdd {

	public static final String STAFF_URL = "https://mesaric.humanity.com/app/staff/list/load/true/";
	public static final String STAFF_ADD_URL = "https://mesaric.humanity.com/app/staff/add/";
	public static final String IMPRT_STAF_URL = "https://mesaric.humanity.com/app/staff/module/import/";
	
	public static void addEmployeesBtn(WebDriver driver) {
		//driver.findElement(By.linkText("Add Employees")).click();
		driver.findElement(By.xpath("//*[@id=\"act_primary\"]")).click();
	}
	
	public static void inputName(WebDriver driver, String name) {
		//driver.findElement(By.id("input#_asf1")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"_asf1\"]")).sendKeys(name);
	}
	
	public static void inputLastName(WebDriver driver, String lastName) {
		//driver.findElement(By.id("input#_asl1")).sendKeys(lastName);
		driver.findElement(By.xpath("//*[@id=\"_asl1\"]")).sendKeys(lastName);
	}
	
	public static void inputEmail(WebDriver driver, String email) {
		//driver.findElement(By.id("input#_ase1")).sendKeys(email);	
		driver.findElement(By.xpath("//*[@id=\"_ase1\"]")).sendKeys(email);
	}
	
	
	public static void btnSave(WebDriver driver) {
		//driver.findElement(By.linkText("Save Employees")).click();
		driver.findElement(By.xpath("//*[@id=\"_as_save_multiple\"]")).click();
	}
	
	public static void goToEmployee(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"7\"]/a")).click();
	}
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]")).click();
	}
	
	public static void uploadPicture(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Marijeta\\Desktop\\profile_photo.jpg");;
	}
	
	public static void submitBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input")).click();
	}
	
	public static void editName(WebDriver driver, String name) {
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		edit.clear();
		edit.sendKeys(name);
	}
	
	public static void excellFileLink(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div/table/tbody/tr/td/div[3]/a[1]")).click();
	}
	
	public static void chooseFileBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"CSVform\"]/input[1]")).sendKeys("C:\\Users\\Marijeta\\eclipse-workspace\\humanity\\Zaposleni.xlsx");
	}
	
	public static void submitFileBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"CSVform\"]/button")).click();
	}
	
	public static void inputName(WebDriver driver) {
		WebElement na = driver.findElement(By.xpath("//*[@id=\"CSVform\"]/table[1]/tbody/tr[2]/td[2]/select"));
		Select sel = new Select(na);
		sel.selectByVisibleText("First Name");
	}
	
	public static void inputSurname(WebDriver driver) {
		WebElement na = driver.findElement(By.xpath("//*[@id=\"CSVform\"]/table[1]/tbody/tr[3]/td[2]/select"));
		Select sel = new Select(na);
		sel.selectByVisibleText("Last Name");
	}
	
	public static void inputEmail(WebDriver driver) {
		WebElement na = driver.findElement(By.xpath("//*[@id=\"CSVform\"]/table[1]/tbody/tr[4]/td[2]/select"));
		Select sel = new Select(na);
		sel.selectByVisibleText("Email");
	}
	
	public static void addEplysBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"CSVSubmitButton\"]")).click();
	}
}
