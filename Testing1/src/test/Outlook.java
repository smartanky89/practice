package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Outlook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://outlook.live.com/owa/");
	d.findElement(By.xpath("//a[@class='linkButtonSigninHeader']")).click();
	d.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("smartanky@live.in");
	d.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	d.findElement(By.xpath("//input[@id='i0118']")).sendKeys("start$123");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	System.out.println(d.findElement(By.xpath("//*[@id='AQAAAAAAAQwBAAADVWx1ygAAAAA=']/div/div/div/div/span")).getText());
	WebElement e = d.findElement(By.xpath("//*[@id='AQAAAAAAAQwBAAADVWx1ygAAAAA=']/div/div/div/div/div[2]/div/div[1]"));
	Actions a=new Actions(d);
	a.moveToElement(e).perform();
	a.doubleClick(e).perform();
	
}
}
