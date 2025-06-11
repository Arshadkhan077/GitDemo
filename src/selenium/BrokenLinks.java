package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://jqueryui.com/droppable/");
		
			driver.get("https://demoqa.com/broken");
		List<WebElement> listOfTag= driver.findElements(By.tagName("a"));
		System.out.println("Total Links = "+listOfTag.size());
		SoftAssert softAss=new SoftAssert();
		for(int i=0;i<listOfTag.size();i++) {
			
			String url=listOfTag.get(i).getAttribute("href");
			String linkName= listOfTag.get(i).getText();
			if (url != null && !url.isEmpty()) {
				HttpURLConnection connection	= (HttpURLConnection)new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				System.out.println("Response Code for the URL - "+url+"   "+connection.getResponseCode());
			//	Assert.assertTrue(connection.getResponseCode()<=400, "Response Code for the broken URL "+url+"  of "+linkName+"  is found");
				softAss.assertTrue(connection.getResponseCode()<=400, "Response Code for the broken URL "+url+"  of "+linkName+"  is found");
			}
			else {
				System.out.println("yes its null");
			}
			softAss.assertAll();
		
		}
		
	}

}
