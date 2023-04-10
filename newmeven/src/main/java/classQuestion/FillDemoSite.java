package classQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillDemoSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
         WebElement Fname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		  Fname.sendKeys("Rahul");
		  WebElement Lname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		  Lname.sendKeys("Ranjan");
		  WebElement Uname=driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
		  Uname.sendKeys("RahulRanjan@gmail.com");
		Thread.sleep(1000);
		

	}

}
