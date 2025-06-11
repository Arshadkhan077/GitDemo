package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		// switching to frame using webelement
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// switching using index
		driver.switchTo().frame(0);

		Actions act = new Actions(driver);

		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
				.perform();

		// to find number of frames present
		// System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch back from fram to window
		driver.switchTo().defaultContent();

	}

}
