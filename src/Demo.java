import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.udemy.com/");
		
		System.out.println(driver.getTitle());
		
		ComFun header = new ComFun();
		header.validateHeader();
		System.out.println(header.validateHeader());
		driver.close();

	}

}
