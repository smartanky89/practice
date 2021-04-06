package test;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Demo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Book");
	Thread.sleep(3000);
	List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	for(int i =0;i<allList.size();i++)
	{
		WebElement e= allList.get(i);
		if(e.getText().contains("forex"))
		{
			System.out.println(i+" "+e.getText());
			e.click();
			break;
		}
	}
System.out.println("Bhuwan will be winning 1000 rs todat in dream 11");
}
}
