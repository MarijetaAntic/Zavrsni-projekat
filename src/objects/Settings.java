package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Settings {
	
	public static final String URL = "https://mesaric.humanity.com/app/admin/settings/";
	
	public static void inputLanguage(WebDriver driver) {
		WebElement na = driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select"));
		Select sel = new Select(na);
		sel.selectByVisibleText("Serbian (machine)");
	}
	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"act_primary\"]")).click();
	}
	
	public static void refresh(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[1]/label/a")).click();
	}

}
