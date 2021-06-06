import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumDemoRS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// static drop down - Select

//		WebElement staticDropdown = driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
//		Select dropdown = new Select(staticDropdown);
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		dropdown.selectByVisibleText("USD");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		dropdown.selectByValue("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

//		int noOfAdults = 1;
//		driver.findElement(By.id("divpaxinfo")).click();
//		while(noOfAdults < 5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			noOfAdults ++ ;
//		}
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Autosuggestive Dropdwon

		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).click();
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");
		Thread.sleep(3000);
//		List<WebElement> countryList = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		List<WebElement> countryList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		Thread.sleep(2000);

		for (WebElement country : countryList) {
			System.out.println(country.getText());
			if (country.getText().equalsIgnoreCase("India")) {
				country.click();
				break;
			}
		}

		Thread.sleep(2000);
// Checkbox Code	
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		boolean isChecked = driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		System.out.println("The checkbox is checked : " + isChecked);
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		boolean isCheckedAgain = driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		System.out.println("The checkbox is checked : " + isCheckedAgain);
// all the checkbox

		// List<WebElement> checkBoxList =
		// driver.findElements(By.cssSelector("input[type='checkbox']"));
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//		for(WebElement checkBox : checkBoxList)
//		{
//			System.out.println(checkBox.getText());
//			if(!checkBox.isSelected())
//			{
//				checkBox.click();
//				Thread.sleep(2000);
//			}
//		}

		driver.quit();
	}

}
