package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import LoginPage.SignInPage;

public class practicePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Object Creation
		//SignInPage signInPage = new SignInPage(driver);

//		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("xpath");
		// regular expression with partial text (customized cssSelector locator)
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("baloon"); // regular expression with partial text
	}

}
