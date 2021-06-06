import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Read properties file in Java
		
		Properties prop = new Properties();
		// Create an object of the File Input Stream class
		FileInputStream fis = new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\Tutorial\\src\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String urlName = prop.getProperty("url");
		
		System.out.println(browserName);
		System.out.println(urlName);
		
		// to set the values of the browser at teh run time
		System.out.println(prop.setProperty("browser", "firefox"));
		
        //	To write back to the properties file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Saurabh\\eclipse-workspace\\Tutorial\\src\\data.properties");
		prop.store(fos, urlName);
		
	}

}
