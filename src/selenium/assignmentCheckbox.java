package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class assignmentCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//
//		System.out.println("count = "+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//calender handling
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
//		driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();
		
		//calender enable disable check
		Thread.sleep(5000);
		String style= driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(style);
		Assert.assertTrue(style.contains("0.5"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String style1= driver.findElement(By.id("Div1")).getAttribute("style");

		System.out.println(style1);
		Assert.assertTrue(style1.contains("1"));
		
	}

}
