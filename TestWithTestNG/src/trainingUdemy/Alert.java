package trainingUdemy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void browserOpen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void alertTest() throws IOException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#name")).sendKeys("Hello Is the word");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#name")).sendKeys("Hello");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(ss,new File("C:\\Users\\achauhan26\\downloads\\ss.jpg"));
	}
	

}
