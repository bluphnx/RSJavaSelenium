package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// url : https://rahulshettyacademy.com/dropdownsPractise/

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// while loop to click 4 times
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		// for loop to click 4 times
		for (i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// 9 Adults
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");

	}

}
