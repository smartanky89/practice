package trainingUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionDemo {
	WebDriver driver;
	Actions a;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}

	@BeforeMethod
	public void browserOpen() {
		driver = new ChromeDriver();
		a = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	  @Test public void demo1() { driver.get("https://www.amazon.in/"); WebElement
	  ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	  WebElement box =
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  a.moveToElement(box).click().keyDown(Keys.SHIFT).sendKeys("hello").
	  doubleClick().build().perform();
	  a.moveToElement(ele).contextClick().build().perform(); }
	 

	@Test
	public void framesDemo() {
		driver.get("https://jqueryui.com/droppable/");
		// driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(drag, drop).build().perform();
		System.out.println(drop.getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		

	}
}
