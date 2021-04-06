package notDefault;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaEX {
	WebDriver driver;
	@BeforeTest
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void javaExExample() throws InterruptedException {
		driver.get("https://uat.ibm.online.metlife.com/employerdashboard/employerdashboard");
		driver.findElement(By.id("login_username_textbox")).sendKeys("sahil.kumar@metlife.com");
		driver.findElement(By.id("login-password-textbox")).sendKeys("metlife1");
		Thread.sleep(5000);
		driver.findElement(By.className("login_btn")).click();
		Thread.sleep(20000);
		String scriptToExecute = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
        String netData = ((JavascriptExecutor) driver).executeScript(scriptToExecute).toString();
        System.out.println(netData);
        Object o = ((JavascriptExecutor) driver).executeScript("return digitalData.event");
       
        
        System.out.println("Displaying attribute of application" + o.toString());

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
