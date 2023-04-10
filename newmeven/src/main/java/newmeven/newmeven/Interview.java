package newmeven.newmeven;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver .manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
		String childwindow=driver.getWindowHandle();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());

	}

}
