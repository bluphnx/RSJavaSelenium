package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// url : https://rahulshettyacademy.com/dropdownsPractise/

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
	// Parent child relationship xpath
		
		// => By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//a[@value='MAA']")).click(); 
		// By.xpath("//a[@value='MAA']")
		// ==> this line will fail since 2 drop downs have same xpath and
		// when selenium follows top down approach MAA from FROM from drop down is first detected
		// but since it is closed, it couldn't click the element and not checking the element of TO dropdown
		// so we have to use indexing method to select the value from TO dropdown
		// like, 
		// (//a[@value='MAA'])[2]
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();	
		

		// => By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
