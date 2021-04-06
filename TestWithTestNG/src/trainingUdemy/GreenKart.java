package trainingUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GreenKart {
	WebDriver driver;
	//WebDriverWait w;
	int j = 0;
	String[] actualProductName = { "Brocolli", "Carrot", "Capsicum","Corn", "Walnuts" };

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
	public void test1() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<String> itemsNeededList = Arrays.asList(actualProductName);
		List<WebElement> products = driver.findElements(By.className("product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String productName = name[0].trim();
			if (itemsNeededList.contains(productName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeededList.size())
					break;
			}

		}
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		//w = new WebDriverWait(driver,8);
		//w.until(ExpectedConditions.presenceOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		//System.out.println("Hi");
		driver.findElement(By.className("promoBtn")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		sel.selectByValue("China");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	}
}
