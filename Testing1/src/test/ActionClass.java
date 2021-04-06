package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver d=  new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.flipkart.com/");
	d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	WebElement e = d.findElement(By.xpath("//span[text()='Electronics']"));
	Actions a=new Actions(d);
	a.moveToElement(e).perform();
	WebElement b = d.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']"));
	Thread.sleep(2000);
	a.contextClick(b).perform();
	a.sendKeys("w").perform();;
	//a.sendKeys(Keys.ENTER).perform();
}
}
