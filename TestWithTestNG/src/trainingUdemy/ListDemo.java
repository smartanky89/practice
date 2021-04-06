package trainingUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListDemo {
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
	public void test1() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[2]")).click();
		List<WebElement> items = driver.findElements(By.xpath("//tr//td[2]"));
		ArrayList<String> orignal = new ArrayList<String>();
		ArrayList<String> rev = new ArrayList<String>();
		for(int i=0; i<items.size();i++) {
			orignal.add(items.get(i).getText());
		}
		System.out.println(orignal);
		for(String s:orignal) {
			rev.add(s);
		}
		Collections.sort(rev);
		Collections.reverse(rev);
		System.out.println(rev);
		Assert.assertTrue(orignal.equals(rev));
	}
}
