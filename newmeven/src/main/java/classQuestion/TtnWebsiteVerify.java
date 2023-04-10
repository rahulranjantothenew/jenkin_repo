package classQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TtnWebsiteVerify {
	private static WebDriver driver;

	@BeforeMethod
	public void lauch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(" https://www.tothenew.com/");

	}

	@Test
	public void Option() throws InterruptedException {
		WebElement n = driver.findElement(By.xpath("(//a[@id=\"h-Services\"])[2]"));
		Actions s = new Actions(driver);
		s.moveToElement(n).perform();
		String li = driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul)[2]")).getText();
		Thread.sleep(2000);
		Assert.assertTrue(li.contains("Digital Engineering"));
		Assert.assertTrue(li.contains("Cloud & DevOps"));
		Assert.assertTrue(li.contains("OTT Solutions & Services"));
		Assert.assertTrue(li.contains("Data & Analytics"));
		Assert.assertTrue(li.contains("CX, Content & Commerce"));
		Assert.assertTrue(li.contains("Digital Marketing"));

	}

	@AfterMethod
	public void closebrowser() {
		// driver.quit();
	}

}
