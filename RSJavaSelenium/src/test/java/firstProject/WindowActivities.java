package firstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// url : https://rahulshettyacademy.com/dropdownsPractise/
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(500);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		
		
		
		
		
		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
