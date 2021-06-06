import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement helloSignInWebElement = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
		action.moveToElement(helloSignInWebElement).build().perform();
		
		WebElement searchTextBoxWebElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// Shift Key Down to print everything in Caps
		action.moveToElement(searchTextBoxWebElement).click().keyDown(Keys.SHIFT).sendKeys("cosmetics").build().perform();
		// Double Click
		action.doubleClick(searchTextBoxWebElement).build().perform();
		// Right Click
		action.contextClick(searchTextBoxWebElement).build().perform();
//		driver.quit();
		
	}

}
