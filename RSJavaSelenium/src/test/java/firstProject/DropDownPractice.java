package firstProject;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class DropDownPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// url : https://rahulshettyacademy.com/dropdownsPractise/

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// drop down with select tag
		// how to identify a dropdown is static or not?
		// the tagname will be 'select' for a static dropdown

		/*
		   <select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" xpath="1"> 
		     <option value="">Select</option> 
		     <option value="INR">INR</option> 
		     <option value="AED">AED</option> 
		     <option value="USD">USD</option> 
		 </select>
		 */

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdropdown);

		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// <option value="INR" xpath="1">INR</option>
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//System.out.println(dropdown.getOptions());

		driver.close();
		driver.quit();
		System.out.println("-------------------\nProgram Terminated\n-------------------");
	}

}
