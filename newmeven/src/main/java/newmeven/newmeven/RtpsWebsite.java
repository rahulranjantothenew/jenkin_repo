package newmeven.newmeven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
public class RtpsWebsite {
		private WebDriver driver;
	   @BeforeMethod
		public void launch() {
		   driver =new ChromeDriver();
		   System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://serviceonline.bihar.gov.in/");
	   }
	   public void login() {
		   
	   }


}
