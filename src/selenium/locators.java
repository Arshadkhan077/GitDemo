package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		locators loc= new locators();
		String password=loc.getPassword(driver);
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//		driver.findElement(By.className("submit")).click();
//		// System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		System.out.println(driver.findElement(By.cssSelector("p[class = 'error']")).getText());
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("arshad@google.com");
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("994753678");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("div button")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

	public String getPassword(WebDriver driver) throws InterruptedException  {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String password=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passArray=password.split("'");
		String[] finalArray=passArray[1].split("'");
		String finalPassword=finalArray[0];
		return finalPassword;
	}
}
