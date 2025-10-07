package LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		PageFactory.initElements(driver, this);
	}

	// driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("VijaySethupathi");
	@FindBy(css = "[placeholder='Username']")
	WebElement EnterEmail;

	// driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("baloon");
	// regular expression with partial text (customized cssSelector locator)
	// driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("baloon");

	// regular expression with partial text (customized xpath locator)
	// driver.findElement(By.xpath("//input[contains(@name,'Pass')]")).sendKeys("baloon");
	@FindBy(xpath = "//input[@name='inputPassword']")
	WebElement EnterPassword;

	// driver.findElement(By.xpath("//button[@type='submit']")).click();

	// regular expression with partial text (customized xpath locator)
	// //button[contains(@class,'submit signInBtn')]
	// //button[contains(@class,'submit')]
	// driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitBtn;

	// button.logout-btn
	// driver.findElement(By.cssSelector("button.logout-btn")).sendKeys("VijaySethupathi");
	@FindBy(css = "button.logout-btn")
	WebElement LogoutBtn;

	public void login(String email, String password) {
		EnterEmail.sendKeys(email);
		EnterPassword.sendKeys(password);
		SubmitBtn.click();
	}

	public void logout() {
		LogoutBtn.click();
	}

}
