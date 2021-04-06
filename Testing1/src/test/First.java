package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http:\\www.bing.com");
	driver.navigate().to("http:\\www.google.com");
	driver.findElement(By.linkText("Google Search")).click();
	driver.get("http:\\\\www.outlook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	if(driver.getCurrentUrl().contains("outlook"))
	{
		System.out.println("correct");
	}
	else {
		System.out.println("incorrect");
	}
	driver.close();
}
}
