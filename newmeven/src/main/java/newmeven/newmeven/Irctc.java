package newmeven.newmeven;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpiceJetAssignmentStepDef {
	
	public static WebDriver driver;
	
	@Given("^I Open URL \"([^\"]*)\" and launch driver$")
	public void i_Open_URL_and_launch_driver(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.manage().deleteAllCookies();
	    System.out.println("Cookies Cleared!");
	    
	    driver.get(url);
//	    Thread.sleep(2000);
    }

	@When("^I search ticket from \"([^\"]*)\" to \"([^\"]*)\" Depart on \"([^\"]*)\" return on \"([^\"]*)\"$")
	public void i_search_ticket_from_to_Depart_on_return_on(String depcity, String arricity, String depdate, String returndate) throws Throwable {
		
//		Click on round trip
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	    
//		Enter Depart city and arrival city
		
		driver.findElement(By.xpath("(//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction'])")).click();
		WebElement departcity = driver.findElement(By.xpath("(//a[@value='DEL'])"));
		departcity.click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction'])")).click();
		WebElement arrivalcity = driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		arrivalcity.click();
		
//		Date Picker
		String dep_bookdate = depdate.split("-")[0];
		String dep_bookmonth = depdate.split("-")[1];
		String dep_bookyear = depdate.split("-")[2];
		System.out.println("Booking Ticket for:"+dep_bookdate+dep_bookmonth+dep_bookyear);
		
//		WebElement departdatepicker = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
//		departdatepicker.click();
		
		String currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().trim();
		String currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().trim();
		
//		Filling Depart date 
		while(!currentmonth.equals(dep_bookmonth) || (!currentyear.equals(dep_bookyear))) {
		      
			driver.findElement(By.xpath("(//span[text()='Next'])")).click();
			currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().trim();
			currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().trim();
//			System.out.print(currentmonth+currentyear);
		}
			List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
			
			for(WebElement e: dates) {
				if(e.getText().trim().equals(dep_bookdate)){
					e.click();
					break;
				}
			}
			
//			Return Date
			WebElement returndatepicker = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));
			returndatepicker.click();
			
//			Return Booking date 
			String return_bookdate = returndate.split("-")[0];
			String return_bookmonth = returndate.split("-")[1];
			String return_bookyear = returndate.split("-")[2];
			System.out.println("Booking Ticket for:"+return_bookdate+return_bookmonth+return_bookyear);

			
			String return_currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText().trim();
			String return_currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText().trim();
			
//			Filling Depart date 
			while(!return_currentmonth.equals(return_bookmonth) || (!return_currentyear.equals(return_bookyear))) {
			      
				driver.findElement(By.xpath("(//span[text()='Next'])")).click();
				return_currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText().trim();
				return_currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText().trim();
//				System.out.print(currentmonth+currentyear);
			}
			List<WebElement> return_dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
				
				for(WebElement e: return_dates) {
					if(e.getText().trim().equals(return_bookdate)){
						e.click();
						break;
					}
				}
				
			driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_btn_FindFlights'])")).click();
		
		
		Thread.sleep(5000);
	}
	
	@Then("^I close driver$")
	public void i_close_driver() {
		driver.close();
	}
		
	
}
