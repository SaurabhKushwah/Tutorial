import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		WebElement blinkingText = driver.findElement(By.xpath("//a[@class='blinkingText']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(blinkingText).keyDown(Keys.CONTROL).click().build().perform();
		
		Set<String> windowAll = driver.getWindowHandles();
		
		Iterator<String> itr = windowAll.iterator();
		String parentWindowHandle = itr.next();
		String childWindowHandle = itr.next();
		
		driver.switchTo().window(childWindowHandle);
		
		String displayMessage = driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailIDRetrieved = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailIDRetrieved);
		
		driver.switchTo().window(parentWindowHandle);
		
		System.out.println(displayMessage);
		
//		driver.quit();
		
	}

}
