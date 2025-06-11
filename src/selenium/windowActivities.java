package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
	}

}
