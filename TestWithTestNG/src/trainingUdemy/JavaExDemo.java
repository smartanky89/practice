package trainingUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaExDemo {
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement box = driver.findElement(By.id("autocomplete"));
		box.sendKeys("vi");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value";
		String find = "Vietnam";
		int i = 0;
		while(!js.executeScript(script).toString().equalsIgnoreCase(find)) {
			Thread.sleep(500);
			i++;
			box.sendKeys(Keys.DOWN);
			if(i>10) {
				System.out.println("Not found");
				break;
			}
		}
		System.out.println(js.executeScript(script).toString());
		
	}
}
