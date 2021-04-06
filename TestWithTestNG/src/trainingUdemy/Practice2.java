package trainingUdemy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Practice2 {
	WebDriver driver;
	ChromeOptions c;
	DesiredCapabilities dc;
	@BeforeTest
	public void setup() {
		dc =DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		c=new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void browserOpen() {
		driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws IOException {
		driver.get("https://wrong.host.badssl.com/");
		System.out.println(driver.getTitle());
		File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(ss,new File("C:\\Users\\achauhan26\\downloads\\ss.jpg"));
	}
}
