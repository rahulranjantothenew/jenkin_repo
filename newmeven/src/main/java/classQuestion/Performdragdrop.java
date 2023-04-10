package classQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Performdragdrop {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void drogandDrog() throws InterruptedException {
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
	}

	@Test
	public void Rightclick() {
		driver.get("https://demoqa.com/");
		WebElement element = driver.findElement(By.xpath("//div[@class=\"card-up\"][1]"));
		Actions actions1 = new Actions(driver);
		actions1.contextClick(element).build().perform();
	}

	@AfterTest
	public void Aftertest() {
		driver.quit();
	}

}
