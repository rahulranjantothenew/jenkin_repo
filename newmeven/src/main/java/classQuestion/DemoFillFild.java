package classQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFillFild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement header=driver.findElement(By.xpath("//h1"));
		String EHeader="Automation Demo Site";
		String AHeader=header.getText();
		System.out.println(AHeader);
	
		Thread.sleep(2000);
		
		if(AHeader.equals(EHeader)) {
			System.out.println("verified header");
		}else {
			System.out.println("header is not verified");
		}

	}

}
