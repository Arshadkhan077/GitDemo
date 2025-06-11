package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		WebDriverWait explWait= new WebDriverWait(driver, Duration.ofSeconds(4));
		// switching control from parent to child window

		Set<String> windows = driver.getWindowHandles(); // contains parent[0] and child[1]
		Iterator<String> itr = windows.iterator();
		String parentWindow = itr.next(); // parent window ID
		String childWindow = itr.next(); // child window ID

		driver.switchTo().window(childWindow);
		
		//explWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("mentor@rahulshettyacademy.com"))));
		String username = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.id("username")).sendKeys(username);

	}

}
