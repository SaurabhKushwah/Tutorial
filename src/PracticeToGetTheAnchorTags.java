import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeToGetTheAnchorTags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.findElements(By.tagName("a")).size());

		// One way
		System.out.println("Total number of hyperlin in the footer : "
				+ driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());

		// Another way to do the same thing by limiting webdriver scope
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println("Another way to get the total number of anchor tags in footer : "
				+ footerDriver.findElements(By.tagName("a")).size());

		WebElement columnDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']//tr//ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		String parentWindowHandle = driver.getWindowHandle();
		int columnSize = columnDriver.findElements(By.tagName("a")).size();

		for (int i = 1; i < columnSize; i++) {
			// Tp press Control and Enter
			String clickOnText = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnText);
			Thread.sleep(3000);
		}

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();

		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

		// driver.quit();

	}

}
