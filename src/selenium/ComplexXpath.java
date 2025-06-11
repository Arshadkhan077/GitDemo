package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComplexXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\windows\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	//	Thread.sleep(3000);
		addItems(driver);
		cart(driver);
	}

	public static void addItems(WebDriver driver) throws InterruptedException {

//		this also correct but not generic		driver.findElement(By.xpath("//div[@class='product']/h4[text()='Cucumber - 1 Kg']/parent::div/div[3] //button[text()='ADD TO CART']")).click();
//		driver.findElement(By.xpath("//div[@class='product']/h4[text()='Cauliflower - 1 Kg']/parent::div/div[3] //button[text()='ADD TO CART']")).click();
//		driver.findElement(By.xpath("//div[@class='product']/h4[text()='Brocolli - 1 Kg']/parent::div/div[3] //button[text()='ADD TO CART']")).click();

		// doing in another way
		// list of products take
		// additems list create for vegetables
		// extract each product and their text together inside do following
		// then check if it matches with items
		// if it matches get index of that product and click add to cart

		String[] addItemsveg = { "Cauliflower", "Cucumber", "Beetroot", "Brocolli", "Carrot" };
		List<WebElement> productsNameList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < productsNameList.size(); i++) {

			WebElement indexElement = productsNameList.get(i);
			for (String eachItemVeg : addItemsveg) {
				if (indexElement.getText().contains(eachItemVeg)) {
					j++;
					
					 driver.findElement(By.xpath("//div[@class='product-image']/following-sibling::h4[text()='"+eachItemVeg+" - 1 Kg']/following-sibling::div/button[text()='ADD TO CART']")).click();
					// or below
//					Thread.sleep(3000);
//					driver.findElements(By.xpath("// button[text()='ADD TO CART']")).get(i).click();
					if (j == addItemsveg.length) {
						break;
					}
				}

			}
		}

	}
	
	public static void cart(WebDriver driver) {
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait explicitwait= new WebDriverWait(driver, Duration.ofSeconds(5));
		//explicit wait
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));

		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
		
	}
}
