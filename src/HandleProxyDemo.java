import javax.swing.text.html.CSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first check witch kind of certificate needs to be accepted SSL or Insecure browser
		
		// Desired capabilities for general chrome profile
		DesiredCapabilities ds = new DesiredCapabilities();
		
		// one way to accept certificate
		ds.acceptInsecureCerts();
		//other way
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//set the local chrome profile with ChromeOptions Class
		ChromeOptions co = new ChromeOptions();
		
		co.merge(ds);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
	}

}
