package classQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Right click
		driver.get("https://demoqa.com/");
		WebElement element = driver.findElement(By.xpath("//div[@class=\"card-up\"][1]"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
