package globalV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	WebDriver driver;
	Properties prop;
	FileInputStream fs;
	
	@BeforeSuite
	public void initVariable() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\achauhan26\\Desktop\\Testing Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
		prop = new Properties();
		try {
			fs= new FileInputStream("C:\\Users\\achauhan26\\Desktop\\WorkSpace\\TestWithTestNG\\Base.properties");
			}
			catch(FileNotFoundException ex) {
				System.out.println("FileNotFoundException");
			}
		prop.load(fs);
	}
	
	public void browserOpen() {
		if(prop.getProperty("browser").contains("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("driver not found");
		}
	}
	
	
}
