package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\Chrome\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://qa3.phoenix.ead.metlife.com/edge/web/public/uslogin");
	d.findElement(By.id("userNameId")).sendKeys("multicertificate@ml.com");
	d.findElement(By.id("passwordId")).sendKeys("metlife1");
	Thread.sleep(2000);
	d.findElement(By.cssSelector("button[data-dojo-attach-point='btnLogin']")).click();
	String text = d.findElement(By.xpath("//p/span[2]")).getText();
	System.out.println(text);
	d.findElement(By.cssSelector("input[class='dijitReset dijitInputInner']")).sendKeys(text);
	d.findElement(By.cssSelector("span[class='dijitReset dijitInline dijitButtonText']")).click();
	System.out.println(d.getTitle());
}
}
