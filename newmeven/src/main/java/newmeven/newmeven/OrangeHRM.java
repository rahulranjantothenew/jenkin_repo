package newmeven.newmeven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
		private static WebDriver driver;
		@BeforeTest
		
		public void lunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Ranjan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver .manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		@Test
		 public void Login() throws InterruptedException, AWTException {
			
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement weble = driver.findElement(By.name("username"));
	        WebElement w = driver.findElement(By.name("password"));
	        weble.sendKeys("Admin");
	        w.sendKeys("admin123");
	        WebElement loginButton = driver.findElement(By.cssSelector(".orangehrm-login-button"));
	        loginButton.click();
	        WebElement link = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
	        link.click();
	        Thread.sleep(5000);
	        WebElement addname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
	        addname.click();
	        
	        WebElement selectadmin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
	       selectadmin.click(); 
//	       Select select = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")));        
//	    WebElement firstSelectedOption = select.getFirstSelectedOption();
	       Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r.keyPress(KeyEvent.VK_ENTER);
	       
	       Thread.sleep(2000);
	       WebElement selectstatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
	       selectstatus.click(); 
	       Robot r1=new Robot();
	       r1.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r1.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r1.keyPress(KeyEvent.VK_ENTER);
	      
	       
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("Cecil  Bonaparte");
	       
	       Thread.sleep(7000);
	       
	       
	       Robot r2=new Robot();
	       r2.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r2.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       r2.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(2000);
	      
	       
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("R#ahul1234");
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("R#ahul1234");
	      
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("RahulRanjan123");
	       
	       WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
	       save.click(); 
	       Thread.sleep(2000);
		 }
//		@Test
//		public void Loginclick() {
//			WebElement loginButton = driver.findElement(By.cssSelector(".orangehrm-login-button"));
//	        loginButton.click();
//			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			WebElement button1og=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//			Actions login=new Actions(driver);
//			login.contextClick(button1og).build().perform();
//		}
//		@Test
//		public void HomepageClick() {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//		 WebElement link = driver.findElement(By.linkText("Admin Module"));
//	        link.click();
//			WebElement button1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
//			Actions act1=new Actions(driver);
//			act1.contextClick(button1).build().perform();
//			
//			WebElement button12=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
//			Actions act12=new Actions(driver);
//			act12.contextClick(button12).build().perform();
//			
//		}
		
//		@AfterTest
//		public void closeclass() {
//			driver.close();
//		}

	}


