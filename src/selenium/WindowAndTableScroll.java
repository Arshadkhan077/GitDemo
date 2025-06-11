package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WindowAndTableScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> listOfAmount= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int actualSum=0;
		for(int i=0;i<listOfAmount.size();i++) {
			
			int eachValue= Integer.parseInt(listOfAmount.get(i).getText());
			actualSum=actualSum+eachValue;
			
		}
		System.out.println("total amount is = "+actualSum);
		int expectedSum=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(actualSum,expectedSum);
		
	}

}
