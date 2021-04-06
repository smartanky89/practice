package test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Window {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("http://toolsqa.com/automation-practice-switch-windows/");
	WebElement e = d.findElement(By.xpath("//button[text()='New Browser Window']"));
	for(int i=0;i<3;i++)
	{
		e.click();
	}
	Set<String> w = d.getWindowHandles();
	/*for(String s:w)
	{
		System.out.println(s);
	}*/
	System.out.println(w);
	System.out.println(w.isEmpty());

}
}
