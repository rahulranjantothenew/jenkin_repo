package classQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiedTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement header=driver.findElement(By.xpath("//h1"));
		String ETitle="Register";
		String ATitle=header.getText();
		System.out.println(ETitle);
	
		Thread.sleep(2000);
		
		if(ATitle.equals(ETitle)) {
			System.out.println("verified Title");
		}else {
			System.out.println("Title is not verified");
		}

	}

}
