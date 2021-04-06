package trainingUdemy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

public class Practice {
	WebDriver driver;
	Actions a;
	Robot r;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}

	@BeforeMethod
	public void browserOpen() throws AWTException {
		driver = new ChromeDriver();
		a = new Actions(driver);
		r = new Robot();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		List<WebElement> links = driver.findElements(By.xpath("//aside[@id='custom_html-2']//div[@class='textwidget custom-html-widget']//div/a"));
		int size = links.size();
		System.out.println(size);
		for (int i = 0; i < 10; i++) {
			//can be done like this also
			//links.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			a.contextClick(links.get(i)).build().perform();
			r.keyPress(KeyEvent.VK_T);
		}
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		Iterator<String> itr = win.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}

	@Test
	public void test2() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement footer = driver.findElement(By.xpath(" //div[@id='gf-BIG']"));
		List<WebElement> b = footer.findElements(By.tagName("a"));
		System.out.println(b.size());

		/*
		 * can do like this also List<WebElement> c =
		 * driver.findElements(By.xpath(" //div[@id='gf-BIG']//a"));
		 * System.out.println(c.size());
		 */

	}

}
