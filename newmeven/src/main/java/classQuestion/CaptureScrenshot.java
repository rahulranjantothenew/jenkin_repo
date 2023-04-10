package classQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class CaptureScrenshot {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/ ");
		Robot r = new Robot();
		driver.findElement(By.xpath("//input[@id=\"form-field-travel_from\"]")).sendKeys("CCJ");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id=\"form-field-travel_to\"]")).sendKeys("Indira Gandhi International");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id=\"form-field-travel_comp_date\"]")).click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		Select s = new Select(driver.findElement(By.id("form-field-travel_comp_airline")));
		s.selectByVisibleText("Air India");

		Select ss = new Select(driver.findElement(By.id("form-field-travel_comp_language")));
		ss.selectByVisibleText("Hindi");

		driver.findElement(By.xpath("//button[@class=\"elementor-button elementor-size-sm\"]")).submit();
		Thread.sleep(5000);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File Srcfile = scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(Srcfile, new File("demo.png"));
	}

}
