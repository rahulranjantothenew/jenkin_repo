package newmeven.newmeven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:/Users/Rahul Ranjan/Downloads/edgedriver_win64/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
         driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}
}
