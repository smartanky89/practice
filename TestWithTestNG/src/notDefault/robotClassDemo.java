package notDefault;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class robotClassDemo {
	
	WebDriver driver; 
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void robotTest() throws InterruptedException, AWTException {
			driver.get("https://demoqa.com/keyboard-events/");
			WebElement element = driver.findElement(By.id("browseFile"));
			element.sendKeys("C:\\Users\\achauhan26\\Desktop\\1.txt");
			Thread.sleep(5000);
			driver.findElement(By.id("uploadButton")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println(alrt.getText());
			alrt.accept();
			
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("All Test executed");
	}

}
