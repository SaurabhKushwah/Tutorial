import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdads");
		
	}

}
