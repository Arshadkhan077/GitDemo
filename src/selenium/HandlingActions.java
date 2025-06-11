package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);

		// move onto a textbox and press shift and type -caps we get
//		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

		// move to specific element
		// act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		// double click on text
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().perform();
		// right click on element
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		//drag and drop
	}

}
