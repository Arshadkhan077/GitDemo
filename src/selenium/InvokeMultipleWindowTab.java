package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeMultipleWindowTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> itr= windows.iterator();
		String parent=itr.next();
		String child=itr.next();
		
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");
		
	List<WebElement> text=driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']"));
	String texts=text.get(1).getText();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(texts);
	}

}
