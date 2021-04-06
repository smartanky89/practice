package trainingUdemy;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FluentWaitDemo {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}

	@BeforeMethod
	public void browserOpen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void demo() {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		  WebElement foo = wait.until(new Function<WebDriver, WebElement>() { 
			  public WebElement apply(WebDriver driver) { 
				  if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
					  return driver.findElement(By.xpath("//div[@id='finish']/h4"));
				  }else {
					 return null;
				  }
				  
		  } });
		 System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
			 
	}

}
