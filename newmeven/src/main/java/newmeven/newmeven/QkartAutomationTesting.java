package newmeven.newmeven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class QkartAutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rahul Ranjan\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		String title=driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title,"QKart","Not match title");
		WebElement w=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]"));
         w.click();
         driver.findElement(By.id("username")).sendKeys("rahulranjan123");
         driver.findElement(By.id("password")).sendKeys("Rahul#123");
         driver.findElement(By.id("confirmPassword")).sendKeys("Rahul#123");
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
        
	}

}
