import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.udemy.com/");
		
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.get("https://yahoo.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.navigate().back();
//		driver.navigate().forward();
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("abh");
//		driver.findElement(By.name("login")).click();
//		String errorDisplayMessage = driver.findElement(By.cssSelector("div_9ay7")).getText();
//		System.out.println("The display message is : " + errorDisplayMessage );
//		//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("abd");
		driver.findElement(By.name("pw")).sendKeys("bsss");
		driver.findElement(By.cssSelector("#Login")).click();
		
		String errorDisplayMessage = driver.findElement(By.id("error")).getText();
		System.out.println(errorDisplayMessage);
		System.out.println("Test Completed");
		driver.quit();

	}

}
