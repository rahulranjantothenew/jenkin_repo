package newmeven.newmeven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action1 {
	private static WebDriver driver;
	@BeforeTest
	
	public void lunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver .manage().window().maximize();
		//driver.get("https://demoqa.com/buttons");
	}
	@Test
	 public void singleclick() {
		driver.get("https://demoqa.com/buttons");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform();
	 }
	@Test
	public void doubleclick() {
		driver.get("https://demoqa.com/buttons");
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act1=new Actions(driver);
		act1.doubleClick(button1).build().perform();
	}
//	@AfterTest
//	public void closeclass() {
//		driver.close();
//	}

}
