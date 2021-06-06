import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class IdentifyAllBrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Code to get the status of one link
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		// Get all the links
		List<WebElement> linkWebElement = driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert sa = new SoftAssert();
		int count = linkWebElement.size();
		for (int i = 0; i < count; i++) {
			System.out.println(linkWebElement.get(i).getAttribute("href"));
			String url = linkWebElement.get(i).getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respCode = con.getResponseCode();
			System.out.println(respCode);
			// Hard Assert
//			if(respCode > 400 )
//			{
//				System.out.println("The link with text : " + linkWebElement.get(i).getText() +" " + "with Status Code : " + respCode);
//				Assert.assertTrue(false);
//			}

			// Use Soft Assert

//				System.out.println("The link with text : " + linkWebElement.get(i).getText() +" " + "with Status Code : " + respCode);
			sa.assertTrue(respCode < 400,
					"The link with text : " + linkWebElement.get(i).getText() + " " + "with Status Code : " + respCode);
		}
		sa.assertAll();

//		HttpsURLConnection con = (HttpsURLConnection)new URL(url).openConnection();
//		con.setRequestMethod("HEAD");
//		con.connect();
//		con.getResponseCode();
	}

}
