package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class TestingMaxPage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement searchbar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	searchbar.sendKeys("Book");
	Thread.sleep(2000);
	searchbar.sendKeys(Keys.CONTROL,"a");
	String a =searchbar.getAttribute("value");
	System.out.println(a);
	Thread.sleep(2000);
	searchbar.sendKeys(Keys.BACK_SPACE);
	searchbar.sendKeys("superman");
	Thread.sleep(2000);
	WebElement btn = driver.findElement(By.xpath("//input[@name='btnK']"));
	System.out.println(btn.getLocation()+" "+btn.getSize());
	btn.click();
}
}
