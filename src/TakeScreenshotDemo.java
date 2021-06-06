import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// type cast the driver to TakeScreenshot method
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Saurabh\\seleniumScreenshot.png"));
		
		driver.quit();
		
		
	}

}
