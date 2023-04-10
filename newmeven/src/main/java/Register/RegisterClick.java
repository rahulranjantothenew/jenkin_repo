package Register;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		// Here we entering the Full Name
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Ranjan");
		// Address
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]"))
				.sendKeys(" Near Jaypee Hospital ,Sector 128, Noida, Uttar Pradesh");
		// Email
		driver.findElement(By.xpath(
				"//input[@class=\"form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required\"]"))
				.sendKeys("rahul.ranjan@tothenew.com");
		// Phone Number
		driver.findElement(By.xpath(
				"//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern\"]"))
				.sendKeys("6202945996");
		// Gender
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		// Hobbies
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		// Languages
		WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		lang.click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		// Skills
		WebElement skill = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s1 = new Select(skill);
		s1.selectByVisibleText("Java");
		// Country
		WebElement Country = driver.findElement(By.xpath("//select[@id=\"countries\"]"));
		Select c = new Select(Country);
		c.selectByVisibleText("Select Country");
		// Drop-Down feature for country
		WebElement sourceDropdown = driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		sourceDropdown.click();
		Thread.sleep(3000);
		Robot r = new Robot();
		for (int i = 0; i <= 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		// Date of Birth
		// Year
		WebElement DOB = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select Y = new Select(DOB);
		Y.selectByVisibleText("2000");
		// Month
		WebElement DOBmonth = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select M = new Select(DOBmonth);
		M.selectByVisibleText("June");
		// Day
		WebElement DOBday = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
		Select D = new Select(DOBday);
		D.selectByVisibleText("22");
		// password
		driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("tTn1234");
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("tTn1234");
		// Submit button
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		Thread.sleep(5000);
	}

}
