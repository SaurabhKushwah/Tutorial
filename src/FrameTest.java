import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		a.dragAndDrop(drag, drop).build().perform();

		driver.switchTo().defaultContent();

	}

}