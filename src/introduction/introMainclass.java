/**
 * 
 */
package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */
public class introMainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//invoking chrome browser
		//ChromeDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//firefox browser invoke 
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		//edge browser invoke
		System.setProperty("webdriver.edge.driver", "C:\\Users\\windows\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
			
		
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		System.out.println("new commits again");
	}

}
