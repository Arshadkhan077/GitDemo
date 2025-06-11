package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksRelated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\windows\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// count the total number of links in a page

		System.out.println("Total count of links in a page= " + driver.findElements(By.tagName("a")).size());

		// count number of links in footer section

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println("Total links in footer section= " + footer.findElements(By.tagName("a")).size());

		// total links from first column of footer

		// table[@class='gf-t']/tbody/tr/td/ul or //table[@class='gf-t'] //ul

		List<WebElement> firstColLinks = footer
				.findElements(By.xpath("(//table[@class='gf-t']/tbody/tr/td/ul)[1] //a"));
		System.out.println("total links in first column of footer= " + firstColLinks.size());

		// click on each link and check if every page is opening
		// one method using actions
		Actions act = new Actions(driver);
//		List<WebElement> listTextLinks = footer.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul")).get(0);
//		
		for (int i = 1; i < firstColLinks.size(); i++) {
			String linkText = firstColLinks.get(i).getText();

			act.moveToElement(firstColLinks.get(i).findElement(By.xpath("//li/a[text()='" + linkText + "']")))
					.keyDown(Keys.LEFT_CONTROL).click().build().perform();
			Thread.sleep(5000);

		}

//		//switch to each window and get title
		int windowHandles = driver.getWindowHandles().size();
		System.out.println("number of windows =" + windowHandles);
		Set<String> windowList = driver.getWindowHandles();

		Iterator<String> itr = windowList.iterator();

		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}

}
