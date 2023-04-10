package classQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rahulshettyacademy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Going to this URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Click on the alert button to trigger the alert popup
		driver.findElement(By.id("alertbtn")).click();
		// Try to Fetch the alert popup text
		Alert alert = driver.switchTo().alert();// Fetching the alert
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(5000);
		// Try to Dismiss the popup
		alert.dismiss();
		// Try to enter some data on an alert popup
		WebElement confirm = driver.findElement(By.xpath("//input[@id='name']"));
		Thread.sleep(4000);
		confirm.sendKeys("rahul ranjan");
		// clicking on the confirm
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(4000);
		// Try to accept the popup
		alert.accept();
		// driver.quit();// for closing the all browser tab
	}
}