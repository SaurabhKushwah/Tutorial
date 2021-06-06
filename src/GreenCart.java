import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String veggies[] = { "Brocolli", "Cucumber", "Beans" };
		
		addItems(driver, veggies);
		checkoutCart(driver);
		selectCountry(driver);
		
		
		
		driver.quit();
	}
	
//	// Explicit wait method
//	public void explicitWait(WebDriver driver, String promoCodeLoc)
//	{
//		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(promoCodeLoc));
//	}
	
	public static void addItems(WebDriver driver, String[] veggies) {
		
		
		List<WebElement> items = driver.findElements((By.xpath("//h4[@class='product-name']")));

		List<String> veggiesAdded = Arrays.asList(veggies);
		int counter = 0;
		for (int i = 0; i < items.size(); i++) 
		{
			String[] prodName = items.get(i).getText().split("-");
			String veggieName = prodName[0].trim();

			if (veggiesAdded.contains(veggieName)) 
			{
				counter++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(counter == veggies.length )
				{
					break;
				}
			}
		}
	}
	
	// Code to Checkout the Cart
	
	public static void checkoutCart(WebDriver driver) 
	{
		String promoCode = "rahulshettyacademy";
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[@type='button'][text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys(promoCode);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		// Explicit Wait
//		String promoCodeLoc = "By.cssSelector('.promoInfo')";
//		GreenCart gc = new GreenCart();
//		gc.explicitWait(driver, promoCodeLoc);
		
		if(driver.findElement(By.cssSelector(".promoInfo")).getText().contains("Code applied"))
		{
			System.out.println("The Promo Code has been applied successfully");
		}
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".promoInfo")).getText(), "Code applied ..!");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
	
	public static void selectCountry(WebDriver driver)
	{
		WebElement dropDownLoc = driver.findElement(By.xpath("//div[@class='products']//div[@class='wrapperTwo']//div/select"));
		Select dropDown = new Select(dropDownLoc);
		dropDown.selectByVisibleText("India");
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		System.out.println("Order placed successfully");
	}

}
