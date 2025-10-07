package firstProject;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import LoginPage.SignInPage;

@SuppressWarnings("unused")
public class secondPage {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "Banu";
		// Expected Results
		String E_loginSuccessString1 ="Hello "+username+",";
		String E_loginSuccessString2 ="Welcome to Rahul Shetty Academy";
		String E_loginSuccessString3 ="You are successfully logged in.";
		String E_loginSuccessString4 ="LOG OUT";
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().minimize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Object Creation
		SignInPage signInPage = new SignInPage(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		signInPage.login(username , "rahulshettyacademy");
		Thread.sleep(2000);
		
		// String loginSuccessString = driver.findElement(By.xpath("//div/p")).getText();
		// String loginSuccessString = driver.findElement(By.xpath("//body")).getText();
		String A_loginSuccessString1 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/h2")).getText(); // Hello <name>,
		String A_loginSuccessString2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/h1")).getText(); // Welcome to Rahul Shetty Academy
		String A_loginSuccessString3 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText();  // You are successfully logged in.
		//String A_loginSuccessString4 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/button")).getText(); // LOG OUT
		
		// identifying element using text() and is only applicable to xpath 
		// and we can't use text() for cssSelector 
		// console search: $x('//button[text()="Log Out"]')
		
		// without tagname also we can search , only thing is the locator should be unique 
		// String A_loginSuccessString4 = driver.findElement(By.xpath("//*[text()='Log Out']")).getText(); // LOG OUT
		String A_loginSuccessString4 = driver.findElement(By.xpath("//button[text()='Log Out']")).getText(); // LOG OUT
		
		// Thread.sleep(2000);

//		System.out.println(loginSuccessString1);
//		System.out.println(loginSuccessString2);
//		System.out.println(loginSuccessString3);
//		System.out.println(loginSuccessString4);

		Assert.assertEquals(A_loginSuccessString1, E_loginSuccessString1, "Both Strings are not equal");
		Assert.assertEquals(A_loginSuccessString2, E_loginSuccessString2, "Both Strings are not equal");
		Assert.assertEquals(A_loginSuccessString3, E_loginSuccessString3, "Both Strings are not equal");
		Assert.assertEquals(A_loginSuccessString4, E_loginSuccessString4, "Both Strings are not equal");
		
		
		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
