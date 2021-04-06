package trainingUdemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown {

	WebDriver driver;
	String actual, expected, url;
	Select sel;
	WebElement ele;
	
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
	public void test2() throws InterruptedException {
		url="https://www.spicejet.com/";
		driver.get(url);
		//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		if(driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style").contains("1")) {
			System.out.println("Enable");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Disabled");
		}
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style"), "display: block; opacity: 1;");
		System.out.println(driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		List<WebElement> chkEle = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(chkEle.size());
		chkEle.get(3).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value = 'CCU'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		sel = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByValue("4");
		ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		sel = new Select(ele);
		sel.selectByValue("USD");
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		System.out.println(driver.getTitle());
	} 
	
	@Test
	public void test1() throws InterruptedException {
		url ="https://www.makemytrip.com/";
		driver.get(url); 
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Del");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li[4]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Lon");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).getText());
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
		
	}
	
	@AfterMethod
	public void browserClose() {
		driver.close(); 
	} 
}
