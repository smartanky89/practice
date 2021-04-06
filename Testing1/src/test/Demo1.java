package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Demo1 {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	driver.findElement(By.cssSelector("input[class='login-email reg-field__input']")).sendKeys("ankurshanki89@live.in");
	driver.findElement(By.cssSelector("input[class='login-password reg-field__input']")).sendKeys("touch$123");
	driver.findElement(By.cssSelector("input[class='login submit-button']")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@title='Settings']//li-icon[@type='gear-icon']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@id='ember512']/label[@class='toggle-switch__label']/after")).click();
}
}
