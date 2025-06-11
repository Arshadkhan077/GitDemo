package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
	driver.findElement(By.linkText("Click Here")).click();
	
	Set<String> windows= driver.getWindowHandles();
	Iterator<String> itr= windows.iterator();
	String parentWIndow= itr.next();
	String childWIndow= itr.next();
	
	driver.switchTo().window(childWIndow);
	String childString= driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
	
	System.out.println(childString);
	driver.switchTo().window(parentWIndow);
	String parentString = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
	System.out.println(parentString);
	
		
	}

}
