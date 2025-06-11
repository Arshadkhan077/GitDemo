package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.tagName("p")).getText());
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
		
	}
	
	

}
