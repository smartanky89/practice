package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sales {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	WebDriver d=  new ChromeDriver();
	String text;
	d.get("https://login.salesforce.com/");
	d.findElement(By.id("username")).sendKeys("ankur");
	d.findElement(By.id("password")).sendKeys("ankur");
	d.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	text =d.findElement(By.id("error")).getText();
	System.out.println("Test"+text);
}
}
