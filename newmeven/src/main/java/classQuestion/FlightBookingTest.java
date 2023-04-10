package classQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBookingTest {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Going to this URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement cl = driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]"));
		cl.click();

		WebElement sourceDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		sourceDropdown.click();
		WebElement sourceOption = driver.findElement(By.xpath("//a[@value='DEL']"));
		sourceOption.click();
		Thread.sleep(3000);
		Robot r = new Robot();
		for (int i = 0; i <= 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
		}
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(7000);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		WebElement searchButton = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		searchButton.click();
		// driver.quit();// for closing the all browser tab
	}
}