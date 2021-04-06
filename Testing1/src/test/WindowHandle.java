package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class WindowHandle {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	long startTime = System.currentTimeMillis();
	WebDriver d= new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.metlife.com/");
	d.manage().window().maximize();
	WebElement e = d.findElement(By.xpath("//a[@id='homepage_skinny_banner_414769652_content-buttonLabel']"));
	Actions a= new Actions(d);
	a.moveToElement(e).perform();
	a.contextClick(e).build().perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	Set<String> s= d.getWindowHandles();
	System.out.println(s.size()+" "+s);
	Iterator<String> value= s.iterator();
	while(value.hasNext())
	{
		String first= value.next();
		String second= value.next();
		d.switchTo().window(second);
		Thread.sleep(4000);
		d.switchTo().window(first);
	} 
	System.out.println("Total run Time: "+ (System.currentTimeMillis()-startTime));
}
}
