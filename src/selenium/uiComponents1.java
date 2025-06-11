package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class uiComponents1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Static Dropdowns

		WebElement staticDropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Select");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// dropdown for increasing adult count
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		WebElement adultClick = driver.findElement(By.id("hrefIncAdt"));

//		for(int i=0;i<=1;i++) {
//			adultClick.click();
//		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int i = 1;
		while (i < 5) {
			adultClick.click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
