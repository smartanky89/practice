package trainingUdemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Table {
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
	public void practice1() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("(//div[@class='block large-row-spacer'])[3]//table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		System.out.println(driver.findElements(By.xpath("(//div[@class='block large-row-spacer'])[3]//table//tr[1]//th")).size());
		List<WebElement> tabs = driver.findElements(By.xpath("(//div[@class='block large-row-spacer'])[3]//table//tr[3]//td"));
		for (int i= 0;i<tabs.size();i++) {
			System.out.println(tabs.get(i).getText());
		}
		
		
		
	}
}
