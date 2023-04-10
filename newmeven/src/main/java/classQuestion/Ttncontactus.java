package classQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttncontactus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/");
		Thread.sleep(2000);
//		List<WebElement> con = driver.findElements(By.xpath("//a[@id=\"h-contact-us\"]"));
//		WebElement cu = con.get(1);
		//using id
		List<WebElement> con = driver.findElements(By.id("h-contact-us"));
		WebElement cu = con.get(1);
		cu.click();
		Thread.sleep(1000);
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
