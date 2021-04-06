package notDefault;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Listeners(listnerSetup.ListnerDemo.class)

public class firstProg {
	WebDriver driver;
	String actualTitle = "Outlook";
	String dynamicTitle;
	@BeforeTest
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achauhan26\\Desktop\\Testing Documents\\Chrome\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void startBrowser() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Object[][] setData(){
		Object[][] data= getDatafromExl("C:\\Users\\achauhan26\\Desktop\\WorkSpace\\TestWithTestNG\\data.xls","Sheet1") ;
		return data;
	}
	
	@Test(dataProvider = "setData")
	public void testURL(String name, String password) throws InterruptedException {
		driver.get("https://www.outlook.com");
		driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.id("i0116")).sendKeys(name+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("i0118")).sendKeys(password+Keys.ENTER);
		dynamicTitle = driver.getTitle();
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(dynamicTitle,actualTitle);
		System.out.println("After assert");
		softAssertion.assertAll();
		
	}
	
	public String[][] getDatafromExl(String fileName, String sheetName){
		String[][] s= null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh= wb.getSheet(sheetName);
			
			int totalColumn = sh.getColumns();
			int totalRow = sh.getRows();
			s = new String[totalRow - 1][totalColumn];
			for(int i = 1; i<totalRow; i++) {
				for(int j= 0; j<totalColumn; j++) {
					s[i-1][j]= sh.getCell(j,i).getContents();
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterTest
	public void termination() {
		System.out.println("Completed");
	}
	
}
