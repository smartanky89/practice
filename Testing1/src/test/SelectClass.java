package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.metlife.com/");
	WebElement e= d.findElement(By.xpath("//select[@class='insurance-type product__selector form-user-ctrl user-select']"));
	Select s= new Select(e);
	for(int i=1;i<s.getOptions().size();i++)
	{
		System.out.println(s.getOptions().get(i).getText());
	}
}
}
