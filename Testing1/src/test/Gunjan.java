package test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
public class Gunjan {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Mobile" + Keys.ENTER);
	Thread.sleep(6000);
	EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
	File scr= edriver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr,new File("C://test/google.jpg"));
	
}
}
