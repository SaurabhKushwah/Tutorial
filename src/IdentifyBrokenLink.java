import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyBrokenLink {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Code to get the status of one link
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		// use opeConnection method of URL Class of Java
		
		HttpsURLConnection con = (HttpsURLConnection)new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int responseCode = con.getResponseCode();
		System.out.println(responseCode);
		
		
//		System.out.println(columnDriver.findElements(By.tagName("a")).size());
//		int columnLinkSize = columnDriver.findElements(By.tagName("a")).size();
//		
//		List<WebElement> columnLink= columnDriver.findElements(By.tagName("a"));
//		
//		String keyAction = Keys.chord(Keys.CONTROL, Keys.ENTER);
//		
//		for(int i=0; i<columnLinkSize ; i++)
//		{
//			columnLink.get(i).sendKeys(keyAction);
//			System.out.println(driver.getTitle());
//			Thread.sleep(5000);
//		}
		 
//		driver.quit();
		
	}

}
