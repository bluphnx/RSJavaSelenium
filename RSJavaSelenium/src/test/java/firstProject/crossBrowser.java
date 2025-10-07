package firstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class crossBrowser {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Cdriver = new ChromeDriver();
		// WebDriver Fdriver = new FirefoxDriver();
		WebDriver Edriver = new EdgeDriver();

		// Fdriver.manage().window().maximize();
		// Fdriver.get("https://rahulshettyacademy.com/locatorspractice/");

		Edriver.manage().window().maximize();
		Edriver.get("https://rahulshettyacademy.com/locatorspractice/");

		Cdriver.manage().window().maximize();
		Cdriver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Fdriver.close();
		Edriver.close();
		Cdriver.close();
		// Fdriver.quit();
		Edriver.quit();
		Cdriver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
