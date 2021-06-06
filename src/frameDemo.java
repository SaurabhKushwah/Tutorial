import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class frameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement frameWebElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frameWebElement);
		
		System.out.println(driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle")).isDisplayed());
		
		Actions action = new Actions(driver);
		WebElement sourceWebElement = driver.findElement(By.id("draggable"));
		WebElement targetWebElement = driver.findElement(By.id("droppable"));
		action.dragAndDrop(sourceWebElement, targetWebElement).build().perform();
		
		String displayMessageLoc = "//div[@id='droppable']/p";
		
		// Explicit wait
		Wait explicitWait = new WebDriverWait(driver, 5);		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(displayMessageLoc)));
		
		String displayMessage = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(displayMessage);
		Assert.assertEquals(displayMessage, "Dropped!");
//		driver.quit();
	}

}
