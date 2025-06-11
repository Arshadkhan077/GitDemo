package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedMonth = "6";
		String expectedDate = "15";
		String expectedYear = "2027";
		
		String calenderYear= expectedMonth+"/"+expectedDate+"/"+expectedYear;
		System.out.println(calenderYear);
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("button[class*='calendar-button']")).click();
		
		//int forwardCountofYear= 
		for(int i=0;i<2;i++) {
		driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		
		}
		driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']/button[7]")).click();
		driver.findElement(By.xpath("//abbr[text()='June']")).click();
		driver.findElement(By.xpath("//abbr[text()='15']")).click();
		
		WebElement element= driver.findElement(By.cssSelector("input[value='2027-06-15']"));
		String value=element.getAttribute("value");
		System.out.println(value);
		 String[] yearDate = value.split("-");
		  String actualYear=yearDate[0];
		  String actualDate=yearDate[2];
		  int ActualMonth=Integer.parseInt(yearDate[1]);
		//  Integer.toString(ActualMonth);
		 System.out.println(Integer.toString(ActualMonth));
		 System.out.println(expectedMonth);
		  Assert.assertEquals(actualYear, expectedYear);
		  Assert.assertEquals(actualDate, expectedDate);
		  Assert.assertEquals(Integer.toString(ActualMonth), expectedMonth);
		  
		  
		  //or
		  
	}

}
