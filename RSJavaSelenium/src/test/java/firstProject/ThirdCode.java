package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// url : https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// siblings to sibling travel
		// driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"))
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		// child to parent travel
		// By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")
		System.out.println(
				driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());

		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
