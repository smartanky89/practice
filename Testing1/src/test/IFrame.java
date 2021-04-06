package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
			//	options.addArguments("headless");
				//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size()+" "+ driver.getTitle());
		driver.switchTo().frame(0).findElement(By.id("aswift_0")).click();
		System.out.println(driver.getTitle());
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
		
	}

}
