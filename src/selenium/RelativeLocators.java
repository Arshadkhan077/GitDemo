package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	// but here we have list of labels webelement. no other attributes it has also to create locator. So 
	//in that case we use relative locators or friendly locators which helps to locate it.
	//syntax is 
	// driver.findelement(RelativeLocator.with(by.tagname("")).above(webelement));
	driver.findElement(By.name("name"));//web element used for tracking or reference 
	System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(driver.findElement(By.name("name")))).getText());

	driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	driver.findElement(RelativeLocator.with(By.tagName("input")).below(driver.findElement(By.cssSelector("label[for='dateofBirth']")))).click();
//the above element is not taken , subsequent input tag is clicked bec the above html component is flex ,so it doesnt support.
	
	WebElement checkbox=driver.findElement(By.className("form-check-label"));
	driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(checkbox)).click();
}

}
