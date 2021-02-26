package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	public static final String URL = "https://mesaric.humanity.com/app/dashboard/";
	public static final String SHF_PLN_URL = "https://mesaric.humanity.com/app/schedule/employee/week/overview/overview/24%2c1%2c2021/";
	public static final String CLOCK_URL = "https://mesaric.humanity.com/app/timeclock/";
	public static final String LEAVE_URL = "https://mesaric.humanity.com/app/requests/vacation/";
	public static final String TRAIN_URL = "https://mesaric.humanity.com/app/training/";
	public static final String STAFF_URL = "https://mesaric.humanity.com/app/staff/list/load/true/";
	public static final String AVAIL_URL = "https://mesaric.humanity.com/fe/availability/";
	public static final String PAYROLL_URL = "https://mesaric.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORT_URL = "https://mesaric.humanity.com/app/reports/dashboard/";
	
	private static final String SHIFT_PLAN_XPATH = "//*[@id=\"sn_schedule\"]";
	private static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]";
	private static final String TRNING_XPATH = "//*[@id=\"sn_training\"]";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]";
	private static final String AVAIL_XPATH = "//*[@id=\"sn_staff\"]";
	private static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]";
	private static final String REPORT_XPATH = "//*[@id=\"sn_reports\"]";
	private static final String DASHBRD_XPATH = "//*[@id=\"sn_dashboard\"]";
	
	public static void shiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(SHIFT_PLAN_XPATH)).click();
	}
	
	public static void timeClock(WebDriver driver) {
		driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
	}
	
	public static void leave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}
	
	public static void training(WebDriver driver) {
		driver.findElement(By.xpath(TRNING_XPATH)).click();
	}
	
	public static void staff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	
	public static void availability(WebDriver driver) {
		driver.findElement(By.xpath(AVAIL_XPATH)).click();
	}
	
	public static void payroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}
	
	public static void reports(WebDriver driver) {
		driver.findElement(By.xpath(REPORT_XPATH)).click();
	}
	
	public static void dashboard(WebDriver driver) {
		driver.findElement(By.xpath(DASHBRD_XPATH)).click();
	}
}
