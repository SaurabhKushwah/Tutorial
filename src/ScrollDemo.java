import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
//		driver.quit();
	}

}
