package firstProject;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import LoginPage.SignInPage;

//import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class FirstCode {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// PageFactory.initElements(driver, driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Object Creation
		SignInPage signInPage = new SignInPage(driver);

		// password variable
		String password = "dummy";

		// Login to Sign-in page
		// driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("VijaySethupathi");
		// driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("baloon");
		// regular expression with partial text (customized cssSelector locator)
		// driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("baloon");

		// Validate whether 'Remember my username' checkBox is checked or not?
		driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
		Boolean rememberUsernamecheckBox = driver.findElement(By.xpath("//input[@name='chkboxOne']")).isSelected();
		System.out.println("\nRemember my username checkBox: " + rememberUsernamecheckBox);
		System.out.println("----------------");
//
//		// Validate whether 'Terms and Conditions' checkBox is checked or not?
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
		Boolean TnCcheckBox = driver.findElement(By.xpath("//input[@value='agreeTerms']")).isSelected();
		System.out.println("\nTerms and Conditions checkBox: " + TnCcheckBox);
		System.out.println("----------------");

		// wrong password
		signInPage.login("Arul", password);
		// Thread.sleep(1000);
		// String e1 = driver.findElement(By.cssSelector("p.error")).getText();
		String e1 = driver.findElement(By.xpath("//form/p")).getText(); // xpath using html tagname
		System.out.println("\nLogin Failed: \n" + e1);
		System.out.println("----------------");
//		
		// correct password
//		signInPage.login("Kavin", "rahulshettyacademy");
//
//		Thread.sleep(1000);
//		String e2 = driver.findElement(By.xpath("//body")).getText();
//		System.out.println("Login Successful: " + e2);
//		
//		signInPage.logout();

		// driver.findElement(By.cssSelector("p.infoMsg")).getText();

		// driver.findElement(By.xpath("//a[normalize-space()='Forgot your
		// password?']")).click();
		// driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nambi");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Nambi@dmail.com");
		// driver.findElement(By.xpath("//input[@placeholder='Phone
		// Number']")).sendKeys("1234567889");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567889");
		Thread.sleep(1000);

		// to use this method getPassword , either we have to create a object of this
		// class
		String correctPassword = getPassword(driver);

//		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
//		// String resetLoginSuccessString =
//		// driver.findElement(By.cssSelector("p.infoMsg")).getText();
//
//		String resetLoginSuccessString = driver.findElement(By.cssSelector("form p")).getText(); // cssSelector using
//																									// html tagname
//		System.out.println("\nresetLoginSuccessString: \n" + resetLoginSuccessString);
//		System.out.println("----------------");
//		Thread.sleep(1000);

		// combining multiple ways to select xpath
		// parent child traversal + customized xpath
		// driver.findElement(By.xpath("//div/button[contains(@class,'go-to')]")).click();

		// parent child traversal + customized cssSelector
		// driver.findElement(By.cssSelector("div[class*='pwd']
		// button[class*='go-to']")).click();
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();

		Thread.sleep(1000);
		signInPage.login("Nambi", correctPassword);
		Thread.sleep(1000);
		// String loginSuccessString = driver.findElement(By.xpath("//body")).getText();
		String loginSuccessString = driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText();
		System.out.println("\nloginSuccessString: \n" + loginSuccessString);
		System.out.println("----------------");
		signInPage.logout();
		System.out.println("\nlogoutSuccess");
		System.out.println("----------------");

		// Thread.sleep(1000);
		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

	public static String getPassword(WebDriver driver) {

		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String resetLoginSuccessString = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray1 = resetLoginSuccessString.split("'");
		// Original String
		// Please use temporary password 'rahulshettyacademy' to Login.
		// 0th index - passwordArray1[0] = "Please use temporary password "
		// 1st index - passwordArray1[1] = "rahulshettyacademy' to Login."

		String[] passwordArray2 = passwordArray1[1].split("'");
		// passwordArray[1] = "rahulshettyacademy' to Login."
		// 0th index - passwordArray2[0] = "rahulshettyacademy"
		// 1st index - passwordArray2[1] = " to Login."

		String password = passwordArray2[0];

		return password;

	}

}
