package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
public class Demo3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.actimind.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement e= driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	driver.findElement(By.xpath("//a[text()='Cloud Applications']")).click();
}
}
