package newmeven.newmeven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QkartinTestNG {
	private static WebDriver driver;
	@BeforeTest
	
	public void lunch() {
		//RemoteWebDriver rc=new RemoteWebDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver .manage().window().maximize();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		
	}
	@Test
	public void register() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"QKart","Not match title");
		WebElement w=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]"));
         w.click();
         driver.findElement(By.id("username")).sendKeys("rahulranjan123");
        // String username=driver. jjjjjjjjjjjjjjjjj
         //Assert.assertEquals(null, null)
         driver.findElement(By.id("password")).sendKeys("Rahul#123");
         driver.findElement(By.id("confirmPassword")).sendKeys("Rahul#123");
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
	}
	@AfterTest
	public void closewindows() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
