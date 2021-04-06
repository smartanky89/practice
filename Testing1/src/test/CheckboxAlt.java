package test;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class CheckboxAlt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms09.htm");
	List<WebElement> allList = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int i = allList.size();
	System.out.println(i);
	for(int j=0; j<i;j=j+2)
	{
		WebElement a= allList.get(j);
		a.click();
	}
}
}
