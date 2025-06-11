package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class uiComponents3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Auto suggestive dropdowns
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		
		//checkbox selection and find total count of checkboxes
		WebElement checkbox=driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		Assert.assertFalse(checkbox.isSelected());
	//	System.out.println(checkbox.isSelected());
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
	//	System.out.println(checkbox.isSelected());
		
		//count of total checkboxes
	//	System.out.println("total count = "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		//or
		
//		int count=0;
//		List<WebElement> checkboxList=driver.findElements(By.xpath("//div[@id='discount-checkbox']/div"));
//		for(WebElement check:checkboxList) {
//			if(check.getText() !=null) {
//				count=count+1;
//			}
//			
//		}
//		System.out.println("total count of checkboxes are "+ count);
	}

}
