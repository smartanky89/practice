package trainingUdemy;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calendar {
	WebDriver driver;
	String enterDM, date;
	Scanner s;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}

	@BeforeMethod
	public void browserOpen() {
		s = new Scanner(System.in);
		System.out.println("Enter month and year in following format eg - APRIL 2020");
		enterDM = s.nextLine();
		System.out.println("Enter date in following format eg - 2 ");
		date = s.nextLine();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		if (enterDM.equalsIgnoreCase(
				driver.findElement(By.xpath("//div[@class='monthBlock first']//div[@class='title']")).getText())) {
			List<WebElement> firstDates = driver
					.findElements(By.xpath("//div[contains(@class,'monthBlock first')]//tr//td"));
			for (int j = 0; j <= firstDates.size(); j++) {
				if (date.equalsIgnoreCase(firstDates.get(j).getText())) {
					firstDates.get(j).click();
					break;
				}
			}

		} else {
			while (!enterDM.equalsIgnoreCase(
					driver.findElement(By.xpath("//div[@class='monthBlock last']//div[@class='title']")).getText())) {
				driver.findElement(By.xpath("//a[contains(@class,'nextMonth')]")).click();
			}
			List<WebElement> secondDates = driver
					.findElements(By.xpath("//div[contains(@class,'monthBlock last')]//tr//td"));
			for (int i = 0; i <= secondDates.size(); i++) {
				if (date.equalsIgnoreCase(secondDates.get(i).getText())) {
					secondDates.get(i).click();
					break;
				}
			}
		}
	}

}
