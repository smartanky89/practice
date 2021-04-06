package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.List;
public class DropDown {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/achauhan26/Desktop/new.html");
	/*driver.findElement(By.xpath("//select[@class='insurance-type product__selector form-user-ctrl user-select']//option[@value='Auto']")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-brand-2nd btn_global js-productSelector']")).click();
	System.out.println(driver.getCurrentUrl());*/
	List<WebElement> allList = driver.findElements(By.xpath("//select[@role='listbox']"));
	int i = allList.size();
	System.out.println(i);
	for(int j=0; j<i;j++)
	{
		WebElement a= allList.get(j);
		String s = a.getText();
		System.out.println(s);
	}
	}	
}
