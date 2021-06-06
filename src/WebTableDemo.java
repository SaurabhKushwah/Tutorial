import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Window scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//WebTable scroll
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
//		List<WebElement> amountList = driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']//tbody//tr//td[4]"));
		List<WebElement> amountList = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int noOfRows = amountList.size();
		int sum = 0 ;
		for(int i =0; i<noOfRows; i++)
		{
			System.out.println(amountList.get(i).getText());
			sum =sum + Integer.parseInt(amountList.get(i).getText());
		}
		System.out.println(sum);
		
		int expectedSum = Integer.parseInt((driver.findElement(By.cssSelector("div.totalAmount")).getText()).split(":")[1].trim());
		System.out.println(expectedSum);
		
		Assert.assertEquals(sum, expectedSum);
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
