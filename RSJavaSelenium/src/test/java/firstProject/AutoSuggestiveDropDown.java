package firstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// url : https://rahulshettyacademy.com/dropdownsPractise/

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("Pa");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			System.out.println(option.getText());

			if (option.getText().equalsIgnoreCase("Pakistan")) {
				Thread.sleep(3000);
				option.click();
				Thread.sleep(3000);
			}
		}

		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");

	}

}
