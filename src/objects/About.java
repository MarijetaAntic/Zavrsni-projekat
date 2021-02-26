package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class About {

	public static final String URL = "https://www.humanity.com/about";
	
	public static void screenShot(WebDriver driver, String destination) {
		
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(destination);
		try {
			FileUtils.copyFile(SrcFile,DestFile);
		} catch (IOException e) {
			System.out.println("Screenshot not taken!");
			e.printStackTrace();
		}
	}
}
